/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;


public class Cuentas {
    
    private Integer numeroCuenta;
    private Date fechaApertura;
    private float saldo;
    private int clave;

    public Cuentas() {
    }

    
    public Cuentas(Integer numeroCuenta, Date fechaApertura, float saldo, int clave) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.clave = clave;
    }

    public Cuentas(Date fechaApertura, float saldo, int clave) {
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.clave = clave;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
}
