package EjerciciosClase6.Sorting;

public class Persona implements Ordenable {

	public int DNI;
	public String nombre;
	public String apellido;
	public String sexo; /* [M/F] */

	public Persona(int DNI, String nombre, String apellido, String sexo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}

	@Override
	public boolean esMayor(Object o) {
		if (this.DNI > ((Persona) o).DNI)
			return true;
		else if (this.DNI == ((Persona) o).DNI) {
			if (this.sexo.equals("F") && ((Persona) o).sexo.equals("M"))
				return true;
			if (((Persona) o).sexo.equals("F") && this.sexo.equals("M"))
				return false;
		}
		return false;

	}

}
