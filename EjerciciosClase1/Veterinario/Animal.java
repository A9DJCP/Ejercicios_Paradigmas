package EjerciciosClase1.Veterinario;

public class Animal {
	private String especie;
	private float peso;
	private String nombre;
	private String raza;

	public Animal(String nombre, String especie, String raza, float peso) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
	}

	public void describir() {
		System.out.println("----INFORMACIÓN DE " + this.nombre.toUpperCase() + "----");
		System.out.println("PESO: " + this.peso + ".");
		System.out.println("ESPECIE: " + this.especie + ".");
		System.out.println("RAZA: " + this.raza + ".");
		System.out.println("---------------------------------------------------------");
	}

	public void aumentarPeso(float aumento) {
		this.peso += aumento;
		System.out.println("Peso actualizado: " + this.peso);
	}

	public void comer(Alimento alim) {
		if (alim.especie.toLowerCase().equals(this.especie.toLowerCase())) {
			System.out.println("Alimento Comido");
			this.peso += alim.peso;
			System.out.println("Peso actualizado: " + this.peso);
		} else {
			System.out.println("El animal no puede comer este alimento porque no es para su especie.");
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}
