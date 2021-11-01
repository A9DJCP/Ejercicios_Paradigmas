package EjerciciosClase7.ListaDeStrings;

import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/*1*/
		//List<String> lista = new ArrayList<String>();
		/*10*/
		List<String> lista = new LinkedList<String>();
		/*2*/
		lista.add("Carla");
		lista.add("Manuel");
		lista.add("Tomás");
		lista.add("Carolina");
		/*3*/
		for(int i=0; i<lista.size();i++) {
			System.out.println((i+1) + ") " + lista.get(i));
		}
		/*4*/
		for(String nombre : lista) {
			System.out.println(nombre);
		}
		/*5*/
		lista.set(0, "Carlita");
		lista.set(1, "Manolo");
		/*6*/
		lista.remove(3);
		/*7*/
		lista.add("Carlita");
		lista.remove("Carlita");
		/*8*/
		lista.contains("Manolo");
		/*9*/
		lista.add("Carlita");
		borrarTodos(lista, "Carlita");
	}

	private static void borrarTodos(List<String> lista, String nombre) {
		for(int i=0; i<lista.size(); i++) {
			if (lista.get(i).contains(nombre)) lista.remove(i);
		}
		lista.remove(lista.contains(nombre));
	}
	
}
