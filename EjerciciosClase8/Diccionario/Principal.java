package EjerciciosClase8.Diccionario;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		String oracion = "animal zoo conejo dinosaurio zoo zoo animal";

		Map<String, String> diccionario = new TreeMap<String, String>();
		diccionario.put("animal", "Ser orgánico que vive, siente y se mueve por propio impulso.");
		diccionario.put("zoo", "Parque zoológico.");
		diccionario.put("conejo",
				"Mamífero del orden de los lagomorfos, " + "de unos 40 cm de largo, comprendida la cola, "
						+ "de pelaje espeso de color ordinariamente gris, "
						+ "orejas muy largas, patas posteriores más largas que las anteriores,"
						+ " cola muy corta, que vive en madrigueras, "
						+ "se domestica fácilmente y es apreciado por su carne y su pelo");
		diccionario.put("dinosaurio",
				"Reptil fósil, propio del Mesozoico, generalmente de gran tamaño,"
						+ " cabeza pequeña, cuello largo, cola robusta y larga,"
						+ " y extremidades posteriores más largas que las anteriores.");
		diccionario.put("automóvil",
				"Que se mueve por sí mismo. Dicho principalmente de los vehículos "
						+ "que pueden ser guiados para marchar por una vía ordinaria sin necesidad "
						+ "de carriles y llevan un motor, generalmente de combustión interna o eléctrico,"
						+ " que los propulsa.");
		diccionario.put("diente", "Cuerpo duro que, engastado en las mandíbulas del hombre y de muchos animales, "
				+ "queda descubierto en parte, para servir como órgano de masticación o de defensa.");

		
		imprimirDefiniciones(devolverPalabrasOrdenadas(oracion), diccionario);
		
	}

	private static TreeSet<String> devolverPalabrasOrdenadas(String oracion){
		Set<String> palabras = new TreeSet<String>();
		String[] oracionSplitted = oracion.split(" ");
		for(String palabra: oracionSplitted) {
			palabras.add(palabra);
		}
		return (TreeSet<String>) palabras;	
	}
	
	private static void imprimirDefiniciones(Set<String> palabras, Map<String, String> diccionario) {
		for(String palabra : palabras) {
			System.out.println(palabra + ": " + diccionario.get(palabra));
		}
	}
	
	

}
