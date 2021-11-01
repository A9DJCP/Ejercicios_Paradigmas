package EjerciciosClase8.Primos;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NumerosPrimos {

	private static Map<Integer, Boolean> conocidos = new TreeMap<Integer, Boolean>();
	private static Set<Integer> primos = new TreeSet<Integer>();

	public static boolean esPrimo(int n) {
		if (conocidos.containsKey(n))
			return conocidos.get(n);
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != n)) {
			if (n % contador == 0)
				primo = false;
			contador++;
		}
		if (!conocidos.containsKey(n))
			conocidos.put(n, primo);
		if(primo) primos.add(n);
		return primo;
	}


	public static Set<Integer> getPrimos() {
		return primos;
	}
	
	
}
