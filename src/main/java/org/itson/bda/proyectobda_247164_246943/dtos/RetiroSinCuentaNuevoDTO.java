
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;

/**
 * La clase `RetiroSinCuentaNuevoDTO` representa un objeto de transferencia de datos (DTO)
 * para almacenar información sobre un nuevo retiro sin cuenta en un banco.
 */
public class RetiroSinCuentaNuevoDTO{
    // Atributos para almacenar información del retiro sin cuenta.
    private int clave;
    private Float monto;
    private Date fechaGenerada;
    /**
     * Obtiene la clave asociada al retiro sin cuenta.
     * @return La clave del retiro sin cuenta.
     */
    public int getClave() {
        return clave;
    }
    /**
     * Establece la clave asociada al retiro sin cuenta.
     * @param clave La clave del retiro sin cuenta a establecer.
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    /**
     * Obtiene la fecha en que se generó el retiro sin cuenta.
     * @return La fecha de generación del retiro sin cuenta.
     */
    public Date getFechaGenerada() {
        return fechaGenerada;
    }
    /**
     * Establece la fecha en que se generó el retiro sin cuenta.
     * @param fechaGenerada La fecha de generación del retiro sin cuenta a establecer.
     */
    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }
    /**
     * Obtiene el monto del retiro sin cuenta.
     * @return El monto del retiro sin cuenta.
     */
    public Float getMonto() {
        return monto;
    }
    /**
     * Establece el monto del retiro sin cuenta.
     * @param monto El monto del retiro sin cuenta a establecer.
     */
    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    
}
