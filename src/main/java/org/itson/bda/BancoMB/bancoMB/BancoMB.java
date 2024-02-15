
package org.itson.bda.BancoMB.bancoMB;

import org.itson.bda.proyectobda_247164_246943.conexiones.Conexion;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.daos.ClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;


public class BancoMB {

   
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "password";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        IClientesDAO clientesDAO = new ClientesDAO(conexion);
        ClientesForm clientesForm = new ClientesForm(clientesDAO);
        clientesForm.setVisible(true);
        
    
    }
}
    

