package EjerciciosClase6.Sorting;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
	}

	public static void bubbleSort(List<Ordenable> lista) {
		for (int i = 0; i < lista.size() - 1; i++) {
			for (int j = 0; j < lista.size() - i - 1; j++) {
				if (lista.get(i).esMayor(lista.get(i+1))) {
					Ordenable aux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, aux);
				}
			}
		}

	}
	

}
