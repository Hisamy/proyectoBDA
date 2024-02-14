
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
        IClientesDAO sociosDAO = new ClientesDAO(conexion);
        ClientesForm sociosForm = new ClientesForm(sociosDAO);
        sociosForm.setVisible(true);

//        try {
//            Socio socioEliminado = sociosDAO.eliminar(13);
//            logger.log(Level.INFO, socioEliminado.toString());
//        } catch (PersistenciaException e) {
//            logger.log(Level.SEVERE, null, e);
//        } catch (NullPointerException e) {
//            logger.log(Level.SEVERE, null, e);
//        }

//        SocioActualizadoDTO socioActualizado = new SocioActualizadoDTO();
//        socioActualizado.setId(Long.valueOf("13"));
//        socioActualizado.setNombre("Karim Franco");
//        socioActualizado.setTelefono("6442874536");
//        socioActualizado.setCorreo("karimfranco@gmail.com");
//        
//        try {
//           Socio socioModificado = sociosDAO.actualizar(socioActualizado);
//           logger.log(Level.INFO, socioModificado.toString());
//        } catch (PersistenciaException e) {
//            logger.log(Level.SEVERE, null, e);
//        } catch (NullPointerException e) {
//            logger.log(Level.SEVERE, null, e);
//        }

//        SocioNuevoDTO socioNuevo = new SocioNuevoDTO();
//        socioNuevo.setNombre("Victor Encias");
//        socioNuevo.setTelefono("6441869403");
//        socioNuevo.setCorreo("victorencinas@gmail.com");
//
//        try {
//            Socio socioAgregado = sociosDAO.agregar(socioNuevo);
//            logger.log(Level.INFO, socioAgregado.toString());
//        } catch (PersistenciaException e){
//            logger.log(Level.SEVERE, null, e);
//        }
//
//        try {
//            List<Socio> listaSocios = sociosDAO.consultar();
//            listaSocios.forEach(socio -> System.out.println(socio));
//        } catch (PersistenciaException e) {
//            logger.log(Level.SEVERE, null, e);
//        }
    }

    
    }
    
}
