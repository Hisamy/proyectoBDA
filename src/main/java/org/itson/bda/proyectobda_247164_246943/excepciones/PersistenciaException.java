
package org.itson.bda.proyectobda_247164_246943.excepciones;


public class PersistenciaException extends Exception {
    
    /**
     * Constructor vacío.
     */
    public PersistenciaException() {
    }

    /**
     * Constructor que establece el mensaje de la excepción.
     * @param message de la excepción.
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Constructor que establece el mensahje y la causa de la excepción.
     * @param message de la excepción.
     * @param cause de la excepción.
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que establece la causa de la excepción.
     * @param cause de la excepción
     */
    public PersistenciaException(Throwable cause) {
        super(cause);
    }
    
    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
