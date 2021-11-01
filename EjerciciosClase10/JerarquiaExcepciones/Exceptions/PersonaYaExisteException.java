package EjerciciosClase10.JerarquiaExcepciones.Exceptions;

public class PersonaYaExisteException extends PersonaException {
	private static final long serialVersionUID = 1L;
	private static String excepcion = "PERSONA_YA_EXISTE_EXCEPCION";
	private static String mensaje = "La persona que se intentó crear ya está registrada.";

	public PersonaYaExisteException() {
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
