package jcolonia.daw2025.tablasmvc;
/**
 * Excepción personalizada para errores de la aplicación.
 */
public class ExcepcionES extends Exception {

	/**
	 * Crea la excepción con un mensaje.
	 * @param mensaje el texto del error
	 */
	public ExcepcionES(String mensaje) {
		super(mensaje);
	}
}