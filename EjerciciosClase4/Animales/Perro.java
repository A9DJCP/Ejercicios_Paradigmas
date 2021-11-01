package EjerciciosClase4.Animales;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre, "Perro");
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
	}

	@Override
	public void describir() {
		super.describir();
		System.out.println("Soy un Perro");
	}

}
