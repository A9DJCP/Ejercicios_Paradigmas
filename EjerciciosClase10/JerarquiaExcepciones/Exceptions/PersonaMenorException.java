package EjerciciosClase10.JerarquiaExcepciones.Exceptions;

public class PersonaMenorException extends PersonaException{
	private static final long serialVersionUID = 1L;
	private static String excepcion = "PERSONA_MENOR_EXCEPCION";
	private static String mensaje = "La persona que se intentó crear es menor, no puede registrarse.";

	public PersonaMenorException() {
		super(excepcion, mensaje);
	}

	@Override
	public String getExcepcion() {
		return excepcion;
	}

	@Override
	public String getMensaje() {
		return mensaje;
	}
}
