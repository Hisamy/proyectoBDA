
package org.itson.bda.proyectobda_247164_246943.conexiones;

import java.sql.Connection;
import java.sql.SQLException;


public interface IConexion {
        Connection obtenerConexion() throws SQLException;

}
