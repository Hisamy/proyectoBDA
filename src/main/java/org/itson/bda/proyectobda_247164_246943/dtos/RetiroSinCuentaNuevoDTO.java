
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;


public class RetiroSinCuentaNuevoDTO{
    private int clave;
    private Float monto;
    private Date fechaGenerada;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    
}
