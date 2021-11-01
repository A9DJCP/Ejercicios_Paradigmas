package EjerciciosClase6.Animales;

public abstract class Animal {
	private String nombre;
	private String tipo;

	public Animal(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		Principal.animales.add(this);
		if(this instanceof Acuatico)Principal.acuaticos.add((Acuatico)this);
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public abstract void describir();

}
