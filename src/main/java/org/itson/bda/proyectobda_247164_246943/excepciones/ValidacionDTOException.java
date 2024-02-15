
package org.itson.bda.proyectobda_247164_246943.excepciones;

/**
 * La clase `ValidacionDTOException` extiende la clase Exception y se utiliza para
 * representar excepciones relacionadas con la validación de objetos de transferencia de datos (DTO).
 * Estas excepciones suelen ocurrir cuando los datos proporcionados no cumplen con los criterios de validación.
 */
public class ValidacionDTOException extends Exception {
    /**
     * Constructor predeterminado de la excepción.
     */
    public ValidacionDTOException() {
    }
    /**
     * Constructor que acepta un mensaje de error.
     * @param message El mensaje de error asociado con la excepción.
     */
    public ValidacionDTOException(String message) {
        super(message);
    }
    /**
     * Constructor que acepta un mensaje de error y una causa subyacente.
     * @param message El mensaje de error asociado con la excepción.
     * @param cause La causa subyacente de la excepción.
     */
    public ValidacionDTOException(String message, Throwable cause) {
        super(message, cause);
    }
    /**
     * Constructor que acepta una causa subyacente.
     * @param cause La causa subyacente de la excepción.
     */
    public ValidacionDTOException(Throwable cause) {
        super(cause);
    }
    /**
     * Constructor que acepta un mensaje de error, una causa subyacente,
     * y opciones para habilitar la supresión y la capacidad de escritura en seguimiento.
     * @param message El mensaje de error asociado con la excepción.
     * @param cause La causa subyacente de la excepción.
     * @param enableSuppression Indica si la supresión debe estar habilitada o deshabilitada.
     * @param writableStackTrace Indica si el seguimiento de la pila debe ser escribible.
     */
    public ValidacionDTOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
