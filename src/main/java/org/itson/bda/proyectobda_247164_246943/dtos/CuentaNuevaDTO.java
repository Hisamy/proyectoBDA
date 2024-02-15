
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;

/**
 * La clase `CuentaNuevaDTO` representa un objeto de transferencia de datos (DTO)
 * para almacenar información sobre una nueva cuenta bancaria.
 */
public class CuentaNuevaDTO {
    // Atributos para almacenar información de la cuenta bancaria.
    private Integer numeroCuenta;
    private Date fechaApertura;
    private float saldo;
    private int clave;
    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Establece el número de cuenta.
     * @param numeroCuenta El número de cuenta a establecer.
     */
    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Obtiene la fecha de apertura de la cuenta.
     * @return La fecha de apertura de la cuenta.
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }
   /**
     * Establece la fecha de apertura de la cuenta.
     * @param fechaApertura La fecha de apertura de la cuenta a establecer.
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    /**
     * Obtiene el saldo de la cuenta.
     * @return El saldo de la cuenta.
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo de la cuenta.
     * @param saldo El saldo de la cuenta a establecer.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * Obtiene la clave de la cuenta.
     * @return La clave de la cuenta.
     */
    public int getClave() {
        return clave;
    }
    /**
     * Establece la clave de la cuenta.
     * @param clave La clave de la cuenta a establecer.
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
}
