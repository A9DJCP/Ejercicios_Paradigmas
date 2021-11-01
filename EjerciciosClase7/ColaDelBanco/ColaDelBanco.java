package EjerciciosClase7.ColaDelBanco;

import java.util.ArrayDeque;

public class ColaDelBanco {

	private ArrayDeque<Persona> cola = new ArrayDeque<Persona>();

	public void aString() {
		System.out.println("Personas de la Lista");
		int cont = 0;
		for (Persona persona : cola) {
			cont++;
			System.out.println(cont + ") " + persona.nombre);
		}
	}

	public void agregar(Persona persona) {
		boolean found = false;
		ArrayDeque<Persona> tempCola = cola.clone();
		while (tempCola.size() > 0 && !found) {
			if (tempCola.getFirst().DNI == persona.DNI) {
				found = true;
			} else
				tempCola.removeFirst();
		}

		if (found)
			System.out.println("La persona ya estaba en la cola.");
		else {
			if (persona.edad > 60)
				cola.addFirst(persona);
			else
				cola.addLast(persona);
		}
	}

	public void atender(Persona persona) {
		System.out.println("Persona atendida" + (cola.removeFirst()).nombre);
	}

}
