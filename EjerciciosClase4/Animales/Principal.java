package EjerciciosClase4.Animales;

public class Principal {

	public static void main(String[] args) {		
		Animal[] animales = new Animal[3];
		animales[0] = new Gato("Pedro");
		animales[1] = new Perro("Carlos");
		animales[2] = new Labrador("Lara");
		Animal.escucharTodos(animales);
	}

}
