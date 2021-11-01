package EjerciciosClase2.AulasVirtuales.Persona;

public class Alumno extends Persona {
	public boolean repitente;
	public boolean problematico;
	public int nroInscripcion;

	public Alumno(String nombre, String apellido, int dNI, boolean repitente, boolean problematico,
			int nroInscripcion) {
		super(nombre, apellido, dNI);
		this.repitente = repitente;
		this.problematico = problematico;
		this.nroInscripcion = nroInscripcion;
	}

}
