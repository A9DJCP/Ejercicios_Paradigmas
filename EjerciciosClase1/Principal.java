package EjerciciosClase1;

import EjerciciosClase1.Veterinario.Animal;

public class Principal {

	public static void main(String[] args) {
		Animal a1, a2, a3;
		a1 = new Animal("Carlos", "Perro", "Caniche", 5);
		a2 = new Animal("Pipi", "Gato", "Persa", 8);
		a3 = new Animal("Perico", "Loro", "Loro", 3);
		
		/*LECTURA DE ATRIBUTOS*/
		a1.describir();
		a2.describir();
		a3.describir();
		
		/*MODIFICACIÓN DE ATRIBUTOS*/
		a1.aumentarPeso(2);
		a2.aumentarPeso(-1);
		a3.aumentarPeso(1);
		
		/*LECTURA DE ATRIBUTOS*/
		a1.describir();
		a2.describir();
		a3.describir();
		
	}
}
