package EjerciciosClase4.Animales;

public class Labrador extends Perro {

	public Labrador(String nombre) {
		super(nombre);
	}

	@Override
	public void describir() {
		super.describir();
		System.out.println("Soy un Labrador");
	}
}
