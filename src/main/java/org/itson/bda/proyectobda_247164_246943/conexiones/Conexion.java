
package org.itson.bda.proyectobda_247164_246943.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * La clase `Conexion` implementa la interfaz `IConexion` y se encarga de establecer
 * y proporcionar conexiones la base de datos utilizando JDBC.
 */
public class Conexion implements IConexion{
    //Atributos de la clase.
    final String cadenaConexion;
    final String usuario;
    final String password;
    static final Logger logger = Logger.getLogger(Conexion.class.getName());


   /**
    * Constructor de la clase `Conexion`.
    * @param cadenaConexion La cadena de conexión a la base de datos.
    * @param usuario El nombre de usuario para la conexión.
    * @param password La contraseña para la conexión.
    */
    public Conexion(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }

   /**
    * Obtiene una conexión a la base de datos.
    * @return La conexión establecida.
    * @throws SQLException Si hay un error al establecer la conexión.
    */
    @Override
    public Connection obtenerConexion() throws SQLException {
          // Establecer la conexión utilizando JDBC
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
         // Registrar el evento de conexión exitosa en el registro de log
        logger.log(Level.INFO, "Conexion establecida {0}", cadenaConexion);
        return conexion;
    }
}
