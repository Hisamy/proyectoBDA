
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;


public class RetiroSinCuentaNuevoDTO{
    private int folio;
    private int contrasenia;
    private Float monto;
    private Date fechaGenerada;

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    
    public int getClave() {
        return contrasenia;
    }

    public void setClave(int clave) {
        this.contrasenia = clave;
    }

    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    
}
