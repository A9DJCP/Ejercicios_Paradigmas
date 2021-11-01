package EjerciciosClase7.ArraysYSorting;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		int[] arrayInt = { 1, 65, 3, 6, 10, 14, 20, 9 };
		java.util.Arrays.sort(arrayInt);
		java.util.Arrays.asList(arrayInt);
		
		List<Integer> listaDesordenada = new ArrayList<Integer>();
		listaDesordenada.add(10);
		listaDesordenada.add(5);
		listaDesordenada.add(11);
		listaDesordenada.add(3);
		listaDesordenada.add(1);
		listaDesordenada.add(14);
		listaDesordenada.add(20);
		java.util.Collections.sort(listaDesordenada);
		Object[] array = listaDesordenada.toArray();
	}

}
