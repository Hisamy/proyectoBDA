
package org.itson.bda.proyectobda_247164_246943.bancoMB;


public class Transaccion {
    private int folio;
    private float monto;

    public Transaccion() {
    }


    public Transaccion(int folio, float monto) {
        this.folio = folio;
        this.monto = monto;
    }

    public Transaccion(float monto) {
        this.monto = monto;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
    
}
