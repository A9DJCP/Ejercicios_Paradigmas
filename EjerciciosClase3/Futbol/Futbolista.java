package EjerciciosClase3.Futbol;

public class Futbolista {
	private String nombre;
	private String equipo;

	private int cantidadDeGoles = 0;

	public static Futbolista maximoGoleador;

	public Futbolista(String nombre, String equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void anotarGol() {
		this.cantidadDeGoles++;
		if (this.cantidadDeGoles > Futbolista.maximoGoleador.getCantidadDeGoles())
			Futbolista.maximoGoleador = this;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getCantidadDeGoles() {
		return this.cantidadDeGoles;
	}

}
