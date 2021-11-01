package EjerciciosClase8.Diccionario;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		String oracion = "animal zoo conejo dinosaurio zoo zoo animal";

		Map<String, String> diccionario = new TreeMap<String, String>();
		diccionario.put("animal", "Ser org�nico que vive, siente y se mueve por propio impulso.");
		diccionario.put("zoo", "Parque zool�gico.");
		diccionario.put("conejo",
				"Mam�fero del orden de los lagomorfos, " + "de unos 40 cm de largo, comprendida la cola, "
						+ "de pelaje espeso de color ordinariamente gris, "
						+ "orejas muy largas, patas posteriores m�s largas que las anteriores,"
						+ " cola muy corta, que vive en madrigueras, "
						+ "se domestica f�cilmente y es apreciado por su carne y su pelo");
		diccionario.put("dinosaurio",
				"Reptil f�sil, propio del Mesozoico, generalmente de gran tama�o,"
						+ " cabeza peque�a, cuello largo, cola robusta y larga,"
						+ " y extremidades posteriores m�s largas que las anteriores.");
		diccionario.put("autom�vil",
				"Que se mueve por s� mismo. Dicho principalmente de los veh�culos "
						+ "que pueden ser guiados para marchar por una v�a ordinaria sin necesidad "
						+ "de carriles y llevan un motor, generalmente de combusti�n interna o el�ctrico,"
						+ " que los propulsa.");
		diccionario.put("diente", "Cuerpo duro que, engastado en las mand�bulas del hombre y de muchos animales, "
				+ "queda descubierto en parte, para servir como �rgano de masticaci�n o de defensa.");

		
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
