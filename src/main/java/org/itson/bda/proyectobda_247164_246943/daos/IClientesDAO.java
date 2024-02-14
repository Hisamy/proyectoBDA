package org.itson.bda.proyectobda_247164_246943.daos;




import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.dtos.ClienteNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


public interface IClientesDAO {
    
    List<Clientes> consultar() throws PersistenciaException;

    Clientes agregar(ClienteNuevoDTO socioNuevo) throws PersistenciaException;
}
