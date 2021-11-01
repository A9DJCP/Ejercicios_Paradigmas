package EjerciciosClase6.Animales;

import java.util.ArrayList;
import java.util.List;

import EjerciciosClase6.Vehiculos.Volador;

public class Principal {

	public static List<Animal> animales = new ArrayList<Animal>();
	public static List<Acuatico> acuaticos = new ArrayList<Acuatico>();

	public static void main(String[] args) {
		Animal a1, a2, a3, a4, a5, a6;
		a1 = new Ave("Pedro");
		a2 = new Gato("Thor");
		a3 = new Loro("Lito");
		a4 = new Mono("Babaus");
		a5 = new Pez("Fishy");
		a6 = new Tiburon("Tibu");
		dameAcuaticos(animales);
		showDeAnimales(animales);

	}

	public static List<Acuatico> dameAcuaticos(List<Animal> animales) {
		List<Acuatico> acuaticosTemp = new ArrayList<Acuatico>();
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i) instanceof Acuatico)
				acuaticosTemp.add((Acuatico) animales.get(i));
		}
		return acuaticosTemp;
	}

	public static void showDeAnimales(List<Animal> animales) {
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i) instanceof Acuatico)
				((Acuatico) animales.get(i)).nadar();
			else if (animales.get(i) instanceof Volador)
				((Volador) animales.get(i)).volar();
			else
				System.out.println(animales.get(i).getTipo() + " " + (i + 1) + ": No hace nada.");
		}
	}
}
