package EjerciciosClase10.JerarquiaExcepciones.Exceptions;

public abstract class PersonaException extends Exception {
	private static final long serialVersionUID = 1L;
	private String excepcion;
	private String mensaje;

	public abstract String getExcepcion();

	public abstract String getMensaje();

	public PersonaException(String excepcion, String mensaje) {
		this.excepcion = excepcion;
		this.mensaje = mensaje;
	}
	

}
