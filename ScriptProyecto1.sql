CREATE DATABASE IF NOT EXISTS banco;
USE banco;

CREATE TABLE banco.domicilio (
  numero_domicilio INT NOT NULL,
  calle VARCHAR(45) NOT NULL,
  colonia VARCHAR(45) NOT NULL,
  codigo_postal INT NOT NULL,
  PRIMARY KEY (numero_domicilio));
  
CREATE TABLE banco.clientes (
   id_cliente INT NOT NULL AUTO_INCREMENT,
   fecha_nacimiento DATE NOT NULL,
   nombres VARCHAR(100) NOT NULL,
   apellido_paterno VARCHAR(50) NOT NULL,
   apellido_materno VARCHAR(50) NOT NULL,
   edad INT,
   numero_domicilio INT,
   FOREIGN KEY (numero_domicilio) REFERENCES domicilio(numero_domicilio),
   PRIMARY KEY (id_cliente));
   
DELIMITER //
CREATE TRIGGER calcular_edad
BEFORE INSERT ON clientes
FOR EACH ROW
BEGIN
    SET NEW.edad = TIMESTAMPDIFF(YEAR, NEW.fecha_nacimiento, CURRENT_DATE);
END;
//
DELIMITER ;

  CREATE TABLE banco.cuentas (
  numero_cuenta INT NOT NULL AUTO_INCREMENT,
  fecha_apertura DATE NOT NULL,
  saldo FLOAT NOT NULL,
  clave VARCHAR(4) NOT NULL,
  id_cliente INT NOT NULL,
  FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
  PRIMARY KEY (numero_cuenta));
  
DELIMITER //
CREATE TRIGGER validar_longitud_clave
BEFORE INSERT ON banco.cuentas
FOR EACH ROW
BEGIN
    IF LENGTH(NEW.clave) != 4 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'La longitud de la clave debe ser 4.';
    END IF;
END;
//
DELIMITER ;
/--------------------------------------------------------------------------------------/
DELIMITER //
CREATE TRIGGER asignar_fecha_apertura_trigger
BEFORE INSERT ON banco.cuentas
FOR EACH ROW
BEGIN
    SET NEW.fecha_apertura = CURDATE();
END;
//
DELIMITER ;  

  
CREATE TABLE banco.Transacciones (
  folio INT NOT NULL ,
  monto FLOAT NOT NULL,
  numero_cuenta INT,
   FOREIGN KEY (numero_cuenta) REFERENCES cuentas(numero_cuenta),
  PRIMARY KEY (folio));
  
  
/--------------------------------------------------------------------------------------/
DELIMITER //
CREATE TRIGGER validar_saldo_retiro
BEFORE INSERT ON Transacciones
FOR EACH ROW
BEGIN
    DECLARE cuenta_saldo FLOAT;
    SELECT saldo INTO cuenta_saldo FROM cuentas WHERE numero_cuenta = NEW.numero_cuenta;
    IF NEW.monto > cuenta_saldo THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Fondos insuficientes para realizar el retiro.';
    END IF;
END;
//
DELIMITER ;

  
  CREATE TABLE banco.retiros_sin_cuenta (
  folio INT PRIMARY KEY,
  fechaHora DATETIME NOT NULL,
  contrasenia INT NOT NULL,
  estado INT NOT NULL,
  monto FLOAT NOT NULL,
  FOREIGN KEY (folio) REFERENCES Transacciones(folio),
FOREIGN KEY (monto) REFERENCES retiros(monto));
  
/--------------------------------------------------------------------------------------/
DELIMITER //
CREATE TRIGGER validar_retiro_sin_cuenta
BEFORE INSERT ON retiros_sin_cuenta
FOR EACH ROW
BEGIN
    IF TIMEDIFF(NOW(), NEW.fechaHora) > '00:10:00' THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Periodo excedido.';
    END IF;
END;
//
DELIMITER ;

START TRANSACTION;
UPDATE retiros_sin_cuenta SET estado = 'no cobrado' WHERE TIMEDIFF(NOW(), fechaHora) > '00:10:00';
COMMIT;

  CREATE TABLE banco.transferencias (
  folio INT PRIMARY KEY,
  num_cuenta_receptor INT NOT NULL,
 monto FLOAT NOT NULL,

  FOREIGN KEY (folio) REFERENCES Transacciones(folio),
    FOREIGN KEY (monto) REFERENCES retiros(monto));
  
/--------------------------------------------------------------------------------------/
DELIMITER //
CREATE PROCEDURE registrar_operacion(
    IN p_tabla_afectada VARCHAR(50),
    IN p_operacion_realizada VARCHAR(10)
)
BEGIN
    INSERT INTO historial_operaciones (tabla_afectada, operacion_realizada, fecha_hora)
    VALUES (p_tabla_afectada, p_operacion_realizada, NOW());
END;
//
DELIMITER ;
/--------------------------------------------------------------------------------------/
DELIMITER //
CREATE PROCEDURE consultar_historial_operaciones(
    IN p_id_cliente INT,
    IN p_tipo_operacion VARCHAR(20),
    IN p_fecha_inicio DATE,
    IN p_fecha_fin DATE
)
BEGIN
    SELECT * FROM historial_operaciones WHERE id_cliente = p_id_cliente
	AND tipo_operacion = p_tipo_operacion
	AND fecha_hora BETWEEN p_fecha_inicio AND p_fecha_fin;
END;
//
DELIMITER ;

/*
START TRANSACTION;
UPDATE cuentas SET saldo = saldo - monto_transferencia WHERE numero_cuenta = numero_cuenta;
UPDATE cuentas SET saldo = saldo + monto_transferencia WHERE numero_cuenta = numero_cuenta_receptor;
COMMIT;
*/