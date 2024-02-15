
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;


public class RetirosSinCuenta extends Transaccion{
    private Date fechaApertura;
    private int contrasenia;

    public RetirosSinCuenta() {
    }

    public RetirosSinCuenta(Date fechaApertura, int contrasenia, int folio, float monto) {
        super(folio, monto);
        this.fechaApertura = fechaApertura;
        this.contrasenia = contrasenia;
    }

    public RetirosSinCuenta(Date fechaApertura, int contrasenia) {
        this.fechaApertura = fechaApertura;
        this.contrasenia = contrasenia;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
