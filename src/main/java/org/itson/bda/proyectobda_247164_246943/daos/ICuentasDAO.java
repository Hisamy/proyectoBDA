
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
* La interfaz `ICuentasDAO` define las operaciones necesarias para acceder y manipular
* datos relacionados con cuentas en la base de datos.
*/
public interface ICuentasDAO {
    /**
    * Consulta la información de todas las cuentas en la base de datos.
    * @return Una lista de objetos `Cuentas`.
    * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
    */
    List<Cuentas> consultar() throws PersistenciaException;
    /**
    * Agrega una nueva cuenta a la base de datos.
    * @param cuentaNueva Objeto `CuentaNuevaDTO` que contiene la información de la nueva cuenta.
    * @return Un objeto `Cuentas` con la información de la cuenta recién agregada.
    * @throws PersistenciaException Si ocurre un error al insertar la cuenta en la base de datos.
    */
    Cuentas agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;
}

