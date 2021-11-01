package EjerciciosClase7.ColaDelBanco;

public class Persona {
	public int DNI;
	public String nombre;
	public int edad;

	public Persona(int DNI, String nombre, int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
		int i = 0;
		boolean found = false;
		while(!found && i < Principal.registroPersonas.size()) {
			if (Principal.registroPersonas.get(i).DNI == this.DNI)
				found = true;
			i++;
		};
		if (!found)
			Principal.registroPersonas.add(this);
		else
			System.out.println("DNI Ya registrado.");
	}
}
