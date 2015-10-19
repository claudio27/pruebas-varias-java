package excepciones;

public class BadNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadNumberException() {

	}
	
	public BadNumberException(String mensaje) {

		super(mensaje);
	}
	

}
