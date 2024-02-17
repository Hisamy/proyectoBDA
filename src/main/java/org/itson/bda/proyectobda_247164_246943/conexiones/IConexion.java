
package org.itson.bda.proyectobda_247164_246943.conexiones;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * La interfaz `IConexion` define un contrato para obtener conexiones a una base de datos.
 */
public interface IConexion {

       /**
        * Obtiene una conexión a la base de datos.
        * @return La conexión establecida.
        * @throws SQLException Si hay un error al establecer la conexión.
        */
        Connection obtenerConexion() throws SQLException;

}
