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
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

public class CuentasDAO implements ICuentasDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public CuentasDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    @Override
    public List<Cuentas> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT numero_cuenta, fecha_apertura, saldo, clave
                              FROM cuentas;
                              """;
        List<Cuentas> listaClientes = new LinkedList<>();
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer numero_cuenta = resultados.getInt("numeroCuenta");
                Date fecha_apertura = resultados.getDate("fechaApertura");
                float saldo = resultados.getFloat("saldo");
                int clave = resultados.getInt("clave");
                Cuentas cuenta = new Cuentas(numero_cuenta, fecha_apertura, saldo, clave);
                listaClientes.add(cuenta);
            }
            logger.log(Level.INFO, "Se consultaron {0} cuentas", listaClientes.size());
            return listaClientes;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los cuentas.", e);
            throw new PersistenciaException("No se pudieron consultar los cuentas.", e);
        }
    }

    @Override
    public Cuentas agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        String sentenciaSQL = """
                              INSERT INTO cuentas(fecha_apertura,saldo, clave) 
                              VALUES(?, ?, ?);
                              """;
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setDate(1, cuentaNueva.getFechaApertura());
            comando.setFloat(2, cuentaNueva.getSaldo());
            comando.setInt(3, cuentaNueva.getClave());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} cuentas", numeroRegistrosInsertados);
            ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
            numeroCuentasGeneradas.next();
            return new Cuentas(numeroCuentasGeneradas.getInt(1), cuentaNueva.getFechaApertura(), cuentaNueva.getSaldo(), cuentaNueva.getClave());
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar la cuenta.", e);
            throw new PersistenciaException("No se pudo guardar el cuenta.", e);
        }
    }
}


