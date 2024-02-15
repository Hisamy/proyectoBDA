
package org.itson.bda.proyectobda_247164_246943.dtos;

/**
 * La clase `TransaccionNuevaDTO` representa un objeto de transferencia de datos (DTO)
 * para almacenar información sobre una nueva transacción en un banco.
 */
public class TransaccionNuevaDTO {
    // Atributos para almacenar información de la transacción.
    private int folio;
    private float monto;
    /**
     * Obtiene el folio asociado a la transacción.
     * @return El folio de la transacción.
     */
    public int getFolio() {
        return folio;
    }
    /**
     * Establece el folio asociado a la transacción.
     * @param folio El folio de la transacción a establecer.
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
    /**
     * Obtiene el monto de la transacción.
     * @return El monto de la transacción.
     */
    public float getMonto() {
        return monto;
    }
    /**
     * Establece el monto de la transacción.
     * @param monto El monto de la transacción a establecer.
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}
