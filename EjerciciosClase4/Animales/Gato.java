package EjerciciosClase4.Animales;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre, "Gato");
	}

	@Override
	public void hacerRuido() {
		System.out.println("Meow");
	}

	@Override
	public void describir(){
		super.describir();
		System.out.println("Soy un Gato");
	}

	
}
