
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;

/**
* La clase `ClienteNuevoDTO` representa un objeto de transferencia de datos
* (DTO) para almacenar información sobre un nuevo cliente.
*/
public class ClienteNuevoDTO {

      // Atributos para almacenar información del cliente.
      private String nombre;
       private String apellidoPaterno;
       private String apellidoMaterno;
       private Date fechaNacimiento;

     /**
      * Obtiene el nombre del cliente.
      * @return El nombre del cliente.
      */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del cliente.
     * @param nombre El nombre del cliente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el apellido paterno del cliente.
     * @return El apellido paterno del cliente.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    /**
     * Establece el apellido paterno del cliente.
     * @param apellidoPaterno El apellido paterno del cliente a establecer.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    /**
     * Obtiene el apellido materno del cliente.
     * @return El apellido materno del cliente.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * Establece el apellido materno del cliente.
     * @param apellidoMaterno El apellido materno del cliente a establecer.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    /**
     * Obtiene la fecha de nacimiento del cliente.
     * @return La fecha de nacimiento del cliente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Establece la fecha de nacimiento del cliente.
     * @param fechaNacimiento La fecha de nacimiento del cliente a establecer.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
       
       
}
