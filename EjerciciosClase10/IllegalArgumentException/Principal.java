package EjerciciosClase10.IllegalArgumentException;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(8);
		lista.add(15);
		lista.add(20);
		lista.add(2);
		try {
			int rta = recorrerLista(lista);
			if (rta == -1) {
				System.out.println("No hay números mayores a 10 en la lista.");
			} else {
				System.out.println("El elemento encontrado es: " + rta);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("La lista no es de todos números positivos enteros (naturales).");
			System.out.println(e.getMessage());
		}

		try {
			Persona p = crearPersona("Pedro", 19, 43567000);
			System.out.println("Persona creada: " + "Pedro");
		} catch (IllegalArgumentException e) {
			System.out.println("La persona no se ha creado");
			System.out.println("Error: " + e.getMessage());
		}

		try {
			Persona p2 = crearPersona("Claudio", -5, -3);
			System.out.println("Persona creada: " + "Claudio");
		} catch (IllegalArgumentException e) {
			System.out.println("La persona no se ha creado");
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static int recorrerLista(List<Integer> lista) throws IllegalArgumentException {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i)<=0) throw new IllegalArgumentException();
		}
		
		boolean found = false;
		int i = 0;
		do {
			if (lista.get(i) > 10)
				return lista.get(i);
			i++;
		} while (!found);
		return -1;
	}

	private static Persona crearPersona(String nombre, int edad, int DNI) throws IllegalArgumentException {
		if (edad <= 0 || DNI <= 0 || nombre == null)
			throw new IllegalArgumentException();
		return new Persona(nombre, edad, DNI);
	}

}
