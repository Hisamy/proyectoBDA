
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.bancoMB.RetirosSinCuenta;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


public interface IRetiroSinCuentaDAO {
    List<RetirosSinCuenta> consultar() throws PersistenciaException;

    RetirosSinCuenta agregar(RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo) throws PersistenciaException;
}
