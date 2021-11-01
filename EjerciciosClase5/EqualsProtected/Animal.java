package EjerciciosClase5.EqualsProtected;

import java.util.Objects;

public class Animal {
	protected String especie;
	protected float peso;
	private int llamadosAlimentar = 0;

	public Animal(String especie, float peso) {
		this.peso = peso;
		this.especie = especie;
	}

	public void alimentar(float peso) {
		this.peso += peso;
		llamadosAlimentar++;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || o.getClass() != getClass())
			return false;
		Animal animal = (Animal) o;
		return this.especie == animal.especie && Objects.equals(this.peso, animal.peso);
	}
}
