package EjerciciosClase2.AulasVirtuales.Persona;

public class Docente extends Persona {
	public String especialidad;
	public int matricula;

	public Docente(String nombre, String apellido, int dNI, String especialidad, int matricula) {
		super(nombre, apellido, dNI);
		this.especialidad = especialidad;
		this.matricula = matricula;
	}

}
