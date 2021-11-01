package EjerciciosClase9.Heap;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		tresVariablesTresObjetos();
		tresVariablesUnObjeto();
		unaVariableTresObjetos();
		unObjetoRecolectado();
		Persona[] personas = milObjetosNoRecolectados();
		eliminarReferenciaMilObjetos();
		codigoSinFinErrorMemoria();
		codigoSinFinSinError();
	}

	private static void tresVariablesTresObjetos() {
		Object o1 = new Persona("Maria", "Fernandez");
		Object o2 = new Persona("Tomas", "Perez");
		Object o3 = new Persona("Rodrigo", "Quesada");

	}

	private static void tresVariablesUnObjeto() {
		Object o1, o2, o3;
		o1 = new Persona("Ricardo", "Rodriguez");
		o2 = o1;
		o3 = o1;
	}

	private static void unaVariableTresObjetos() {
		Object o1 = new Persona("Rodrigo", "Perez");
		o1 = new Persona("Tomas", "Salazar");
		o1 = new Persona("Cristina", "Godoy");
	}

	private static void unObjetoRecolectado() {
		Object o1 = new Persona("Persona", "Recolectable");
		System.gc();
	}

	private static Persona[] milObjetosNoRecolectados() {
		Persona[] milObjetos = new Persona[1000];
		for (int i = 0; i < milObjetos.length; i++) {
			milObjetos[i] = new Persona("Persona", "Apellido");
		}
		return milObjetos;
	}

	private static void eliminarReferenciaMilObjetos() {
		System.gc();
	}

	private static void codigoSinFinErrorMemoria() {
		Persona[] array = new Persona[1000 * 1000 * 1000];
		while (true) {
			codigoSinFinErrorMemoria();
		}

	}

	private static void codigoSinFinSinError() {
		Persona persona;
		while (true) {
			persona = new Persona("Nombre", "Apellido");
		}
	}

}
