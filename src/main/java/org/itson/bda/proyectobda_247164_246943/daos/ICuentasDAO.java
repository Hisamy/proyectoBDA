
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


public interface ICuentasDAO {
 
    List<Cuentas> consultar() throws PersistenciaException;

    Cuentas agregar(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;
}

