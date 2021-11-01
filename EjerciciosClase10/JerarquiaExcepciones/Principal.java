package EjerciciosClase10.JerarquiaExcepciones;

import java.util.TreeMap;

import EjerciciosClase10.IllegalArgumentException.Persona;
import EjerciciosClase10.JerarquiaExcepciones.Exceptions.PersonaMenorException;
import EjerciciosClase10.JerarquiaExcepciones.Exceptions.PersonaYaExisteException;

public class Principal {

	private static TreeMap<Integer, Persona> personas = new TreeMap<Integer, Persona>();

	public static void main(String[] args) {
		Persona p1, p2, p3, p4, p5;
		System.out.println("----- Persona 1 -----");
		p1 = creacionPersona("Pedro", 10, 53000111);
		System.out.println("----- Persona 2 -----");
		p2 = creacionPersona("Maria", 19, 44555222);
		System.out.println("----- Persona 3 -----");
		p3 = creacionPersona("Pano", -2, 0);
		System.out.println("----- Persona 4 -----");
		p4 = creacionPersona(null, 22, 52333111);
		System.out.println("----- Persona 5 -----");
		p5 = creacionPersona("Maria", 19, 44555222);
	}

	private static Persona creacionPersona(String nombre, int edad, int DNI) {
		try {
			Persona p = crearPersona(nombre, edad, DNI);
			return p;
		} catch (IllegalArgumentException e) {
			System.out.println("Error en la creación de la persona. Entrada inválida:  " + e.getMessage());
			System.out.println("No se ha creado la persona.");
			return null;
		}
	}

	private static Persona crearPersona(String nombre, int edad, int DNI) throws IllegalArgumentException {
		if (edad <= 0 || DNI <= 0 || nombre == null)
			throw new IllegalArgumentException();
		else {
			try {
				Persona p = comprobarPersona(new Persona(nombre, edad, DNI));
				personas.put(p.DNI, p);
				System.out
						.println("Persona creada: [Nombre: " + nombre + " // Edad: " + edad + " // DNI: " + DNI + "]");
				return p;
			} catch (PersonaYaExisteException e) {
				System.out.println("Error: " + e.getExcepcion() + " // " + e.getMensaje());
				System.out.println("DNI y Nombre de la persona que se intentó registrar: " + DNI + " // " + nombre);

			} catch (PersonaMenorException e) {
				System.out.println("Error: " + e.getExcepcion() + " // " + e.getMensaje());
				System.out.println("Edad de la persona que se intentó registrar: " + edad);
			}
		}

		return null;
	}

	private static Persona comprobarPersona(Persona p) throws PersonaYaExisteException, PersonaMenorException {
		if (personas.containsKey(p.DNI))
			throw new PersonaYaExisteException();
		else if (p.edad < 18)
			throw new PersonaMenorException();
		else
			return p;
	}

}
