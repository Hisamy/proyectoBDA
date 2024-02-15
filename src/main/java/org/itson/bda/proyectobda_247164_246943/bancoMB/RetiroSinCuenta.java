
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;


public class RetiroSinCuenta extends Transaccion{
    
    private int contrasenia;
    private Date fechaGenerada;

    public RetiroSinCuenta() {
    }


    public RetiroSinCuenta(int folio,int contrasenia, Date fechaGenerada, float monto) {
        super(folio, monto);
        this.contrasenia = contrasenia;
        this.fechaGenerada = fechaGenerada;
    }

    public RetiroSinCuenta(int contrasenia, Date fechaGenerada, float monto) {
        super(monto);
        this.contrasenia = contrasenia;
        this.fechaGenerada = fechaGenerada;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    

    }
    

