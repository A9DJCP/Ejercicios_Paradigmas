package EjerciciosClase10.ManejoCasosInesperados;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(8);
		lista.add(15);
		lista.add(20);
		lista.add(0);

		try {
			int rta = recorrerLista(lista);
			if (rta == -1) {
				System.out.println("No hay números mayores a 10 en la lista.");
			} else {
				System.out.println("El elemento encontrado es: " + rta);
			}
		} catch (InvalidInputException e) {
			System.out.println("La lista no es de todos números positivos enteros (naturales).");
			System.out.println(e.getMensaje());
		}

		try {
			Persona p = crearPersona("Pedro", 19, 43567000);
			System.out.println("Persona creada: " + "Pedro");
		} catch (InvalidInputException e) {
			System.out.println("La persona no se ha creado");
			System.out.println("Error: " + e.getNombre() + " // " + e.getMensaje());
		}

		try {
			Persona p2 = crearPersona("Claudio", -5, -3);
			System.out.println("Persona creada: " + "Claudio");
		} catch (InvalidInputException e) {
			System.out.println("La persona no se ha creado");
			System.out.println("Error: " + e.getNombre() + " // " + e.getMensaje());
		}
	}

	private static int recorrerLista(List<Integer> lista) throws InvalidInputException {
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

	private static Persona crearPersona(String nombre, int edad, int DNI) throws InvalidInputException {
		if (edad <= 0 || DNI <= 0 || nombre == null)
			throw new InvalidInputException();
		return new Persona(nombre, edad, DNI);
	}

	public static class InvalidInputException extends Exception {
		String nombre = "Entrada inválida";
		String mensaje = "Se ha registrado un valor incorrecto para la creación del objeto.";

		public String getNombre() {
			return this.nombre;
		}

		public String getMensaje() {
			return this.mensaje;
		}
	}

}
