
package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.bancoMB.RetirosSinCuenta;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
 * La clase `RetirosSinCuentaDAO` implementa la interfaz `IRetiroSinCuentaDAO` y proporciona
 * métodos para acceder y manipular datos relacionados con retiros sin cuenta en la base de datos.
 */
public class RetirosSinCuentaDAO implements IRetiroSinCuentaDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());
    /**
    * Constructor de la clase `RetirosSinCuentaDAO`.
    * @param conexion Objeto que implementa la interfaz `IConexion` para establecer la conexión con la base de datos.
    */
    public RetirosSinCuentaDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }
    @Override
    public List<RetirosSinCuenta> consultar() throws PersistenciaException {
        // Consulta SQL para obtener información de retiros sin cuenta.
         String sentenciaSQL = """
                              SELECT folio, fechaHora, contrasenia,monto
                              FROM retiros_sin_cuenta;
                              """;
        List<RetirosSinCuenta> listaRetirosSinCuentas = new LinkedList<>();
        try (
                // Establecer conexión y preparar la consulta.
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            // Ejecutar la consulta y procesar los resultados.
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer folio = resultados.getInt("folio");
                Date fechaHora = resultados.getDate("fechaHora");
                int contrasenia = resultados.getInt("Contraseña");
                float monto = resultados.getFloat("Monto");
                RetirosSinCuenta retirosSinCuenta = new RetirosSinCuenta(fechaHora, contrasenia, folio, monto);
                listaRetirosSinCuentas.add(retirosSinCuenta);
            }
             // Registrar la cantidad de retiros sin cuenta consultados.
            logger.log(Level.INFO, "Se consultaron {0} Retiros Sin Cuenta", listaRetirosSinCuentas.size());
            return listaRetirosSinCuentas;
        } catch (SQLException e) {
            // Manejar errores de persistencia y lanzar una excepción personalizada.
            logger.log(Level.SEVERE, "No se pudieron consultar los Retiros Sin Cuenta.", e);
            throw new PersistenciaException("No se pudieron consultar los Retiros Sin Cuenta.", e);
        }
    }

    @Override
    public Cuentas agregar(RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo) throws PersistenciaException {
         // Sentencia SQL para insertar un nuevo retiro sin cuenta en la base de datos.
          String sentenciaSQL = """
                              INSERT INTO cuentas(fechaHora, contrasenia,monto) 
                              VALUES(?, ?, ?);
                              """;
        try (
            // Establecer conexión y preparar la inserción.
            Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            // Configurar los parámetros de la inserción.
            comando.setDate(1, retiroSinCuentaNuevo.getFechaGenerada());
            comando.setFloat(2, retiroSinCuentaNuevo.getMonto());
            comando.setInt(3, retiroSinCuentaNuevo.getClave());
            // Ejecutar la inserción y obtener las claves generadas.
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} Retiros Sin Cuenta", numeroRegistrosInsertados);
            ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
            numeroCuentasGeneradas.next();
            // Crea y devuelve un objeto de tipo Cuentas con la información del retiro sin cuenta agregado.
            return new Cuentas(numeroCuentasGeneradas.getInt(1), retiroSinCuentaNuevo.getFechaGenerada(), 
                    retiroSinCuentaNuevo.getMonto(), retiroSinCuentaNuevo.getClave());
        } catch (SQLException e) {
            // Manejar errores de persistencia y lanzar una excepción personalizada.
            logger.log(Level.SEVERE, "No se pudo guardar la Retiros Sin Cuenta.", e);
            throw new PersistenciaException("No se pudo guardar el Retiros Sin Cuenta.", e);
        }
    }
    
   }
    

