package EjerciciosClase5.Equals2;

import java.util.Objects;

public class Persona {
	public int DNI;
	public boolean sexo;
	public String nombre;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || o.getClass() != getClass())
			return false;
		Persona persona = (Persona) o;
		return this.DNI == persona.DNI && Objects.equals(this.sexo, persona.sexo);
	}
}
