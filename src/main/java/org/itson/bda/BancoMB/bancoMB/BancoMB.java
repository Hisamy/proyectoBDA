
package org.itson.bda.BancoMB.bancoMB;

import org.itson.bda.proyectobda_247164_246943.conexiones.Conexion;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.daos.ClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IRetiroSinCuentaDAO;
import org.itson.bda.proyectobda_247164_246943.daos.RetirosSinCuentaDAO;


public class BancoMB {

    /**
    * @param args Clase principal de BancoMB.
    */
    public static void main(String[] args) {

        /**
        * Credenciales y detalles de conexión a la base de datos (URL, usuario, contraseña).
        */
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "cinco123";

        /**
        * Instancia de la interfaz IConexion implementando Conexion.
        */
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);

        /**
        * Instancia de la interfaz IClientesDAO implementando ClientesDAO, pasando la instancia de conexión.
        */
        IClientesDAO clientesDAO = new ClientesDAO(conexion);

        /**
        * Instancia de la interfaz IRetiroSinCuentaDAO implementando la clase RetirosSinCuentaDAO.
        * Se utiliza para realizar operaciones relacionadas con retiros sin cuenta en la base de datos.
        */
        IRetiroSinCuentaDAO retirosSinCuentaDAO = new RetirosSinCuentaDAO(conexion);

       /**
        * Instancia de la clase RetiroSinCuentaForm se le pasa la instancia de IClientesDAO para operaciones relacionadas con clientes.
        */
        RetiroSinCuentaForm clientesForm = new RetiroSinCuentaForm(clientesDAO);

        /**
         * Hace visible el formulario de RetiroSinCuentaForm en la interfaz gráfica.
         */
        clientesForm.setVisible(true);
        
    
    }
}
    

