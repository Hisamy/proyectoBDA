
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.bancoMB.RetirosSinCuenta;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
* La interfaz `IRetiroSinCuentaDAO` define las operaciones necesarias para acceder y manipular
* datos relacionados con retiros sin cuenta en la base de datos.
*/
public interface IRetiroSinCuentaDAO {
    /**
    * Consulta la información de todos los retiros sin cuenta en la base de datos.
    * @return Una lista de objetos `RetirosSinCuenta`.
    * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
    */
    List<RetirosSinCuenta> consultar() throws PersistenciaException;
    /**
    * Agrega un nuevo retiro sin cuenta a la base de datos.
    * @param retiroSinCuentaNuevo Objeto `RetiroSinCuentaNuevoDTO` que contiene la información del nuevo retiro sin cuenta.
    * @return Un objeto `Cuentas` con la información de la cuenta asociada al retiro sin cuenta recién agregado.
    * @throws PersistenciaException Si ocurre un error al insertar el retiro sin cuenta en la base de datos.
    */
    Cuentas agregar(RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo) throws PersistenciaException;
}
