package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.ClienteNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


/**
 * La clase `ClientesDAO` implementa la interfaz `IClientesDAO` y proporciona
 * operaciones para acceder y manipular datos de clientes en la base de datos.
 */
public class ClientesDAO implements IClientesDAO {
     // Atributos de la clase
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());
    
    /**
    * Constructor de la clase `ClientesDAO`.
    * @param conexion Objeto que implementa la interfaz `IConexion` para obtener conexiones a la base de datos.
    */
    public ClientesDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }
    /**
    * Consulta la información de todos los clientes en la base de datos.
    * @return Una lista de objetos `Clientes`.
    * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
    */
    @Override
    public List<Clientes> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT id, fecha_nacimiento, nombre, apellido_paterno,apellido_materno
                              FROM clientes;
                              """;
        List<Clientes> listaClientes = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer id = resultados.getInt("id");
                Date fechaNacimiento = resultados.getDate("fechaNacimiento");
                String nombre = resultados.getString("nombre");
                String apellidoPaterno = resultados.getString("apellidoPaterno");
                String apellidoMaterno = resultados.getString("apellidoMaterno");
                Clientes cliente = new Clientes(id,fechaNacimiento ,nombre, apellidoPaterno, apellidoMaterno);
                listaClientes.add(cliente);
            }
            logger.log(Level.INFO, "Se consultaron {0} clientes", listaClientes.size());
            return listaClientes;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los clientes.", e);
            throw new PersistenciaException("No se pudieron consultar los clientes.", e);
        }
    }

    /**
    * Agrega un nuevo cliente a la base de datos.
    * @param clienteNuevo Objeto `ClienteNuevoDTO` que contiene la información del nuevo cliente.
    * @return Un objeto `Clientes` con la información del cliente recién agregado.
    * @throws PersistenciaException Si ocurre un error al insertar el cliente en la base de datos.
    */
    @Override
    public Clientes agregar(ClienteNuevoDTO clienteNuevo) throws PersistenciaException {
        String sentenciaSQL = """
                              INSERT INTO clientes(fecha_nacimeinto,nombre, apellido_paterno, apellido_materno) 
                              VALUES(?, ?, ?,?);
                              """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ) {
             comando.setDate(1, clienteNuevo.getFechaNacimiento());
            comando.setString(2, clienteNuevo.getNombre());
            comando.setString(3, clienteNuevo.getApellidoPaterno());
            comando.setString(4, clienteNuevo.getApellidoMaterno());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} clientes", numeroRegistrosInsertados);
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            return new Clientes(idsGenerados.getInt(1),clienteNuevo.getFechaNacimiento() ,clienteNuevo.getNombre(), clienteNuevo.getApellidoPaterno(), clienteNuevo.getApellidoMaterno());
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar el cliente.", e);
            throw new PersistenciaException("No se pudo guardar el cliente.", e);
        }
    }

   
}
