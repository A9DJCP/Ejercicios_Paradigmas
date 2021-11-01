package EjerciciosClase5.EqualsProtected;

import java.util.Objects;

public class Perro extends Animal {
	public String raza;

	public Perro(float peso, String raza) {
		super("Perro", peso);
		this.raza = raza;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || o.getClass() != getClass())
			return false;
		Perro animal = (Perro) o;
		return (this.especie == animal.especie && Objects.equals(this.raza, animal.raza)
				&& Objects.equals(this.peso, animal.peso));
	}
}
