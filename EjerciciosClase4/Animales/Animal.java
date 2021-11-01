package EjerciciosClase4.Animales;

import java.lang.reflect.Array;

public abstract class Animal {
	public String nombre;
	public String especie;
	
	public Animal(String nombre, String especie) {
		
	}
	
	public abstract void hacerRuido();
	
	public void describir() {
		System.out.println("Soy un Animal");
	}
	
	public static void escucharTodos(Animal[] animales) {
		for(int i=0; i<animales.length; i++) {
			animales[i].hacerRuido();
			System.out.println("");
		}
	}
}
