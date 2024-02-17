package org.itson.bda.proyectobda_247164_246943.daos;




import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.dtos.ClienteNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
* La interfaz `IClientesDAO` define las operaciones necesarias para acceder y manipular
* datos relacionados con clientes en la base de datos.
*/
public interface IClientesDAO {

    /**
    * Consulta la información de todos los clientes en la base de datos.
    * @return Una lista de objetos `Clientes`.
    * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
    */
    List<Clientes> consultar() throws PersistenciaException;
    /**
     * Agrega un nuevo cliente a la base de datos.
     * @param clienteNuevo Objeto `ClienteNuevoDTO` que contiene la información del nuevo cliente.
     * @return Un objeto `Clientes` con la información del cliente recién agregado.
     * @throws PersistenciaException Si ocurre un error al insertar el cliente en la base de datos.
     */
    Clientes agregar(ClienteNuevoDTO socioNuevo) throws PersistenciaException;
}
