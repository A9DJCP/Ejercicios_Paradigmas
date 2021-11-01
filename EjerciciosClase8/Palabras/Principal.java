package EjerciciosClase8.Palabras;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		String oracion = "animal zoo conejo dinosaurio zoo animal";
		System.out.println(devolverPalabras(oracion));
		System.out.println(devolverPalabrasOrdenadas(oracion));
		
		oracion = "animal zoo conejo dinosaurio zoo zoo animal";
		System.out.println(devolverPalabrasCantidad(oracion));
	}

	private static Set<String> devolverPalabras(String oracion) {
		Set<String> palabras = new HashSet<String>();
		String[] oracionSplitted = oracion.split(" ");
		for(String palabra: oracionSplitted) {
			palabras.add(palabra);
		}
		return palabras;
	}
	
	private static Set<String> devolverPalabrasOrdenadas(String oracion){
		Set<String> palabras = new TreeSet<String>();
		String[] oracionSplitted = oracion.split(" ");
		for(String palabra: oracionSplitted) {
			palabras.add(palabra);
		}
		return palabras;	
	}
	
	private static TreeMap<String, Integer> devolverPalabrasCantidad(String oracion){
		Map<String, Integer> tablaTemp = new TreeMap<String, Integer>();
		String[] oracionSplitted = oracion.split(" ");
		for(String palabra: oracionSplitted) {
			if(tablaTemp.containsKey(palabra)) tablaTemp.put(palabra, (tablaTemp.get(palabra).intValue())+1);
			else tablaTemp.put(palabra, 1);
		}
		return (TreeMap<String, Integer>) tablaTemp;	
	}
	
}
