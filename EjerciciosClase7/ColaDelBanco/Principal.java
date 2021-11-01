package EjerciciosClase7.ColaDelBanco;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static List<Persona> registroPersonas = new ArrayList<Persona>();

	public static void main(String[] args) {
		ColaDelBanco cola = new ColaDelBanco();
		Persona p1, p2, p3, p4;
		p1 = new Persona(43500222, "Carlos", 21);
		p2 = new Persona(46000111, "María", 18);
		p3 = new Persona(47323948, "Tomás", 16);
		p4 = new Persona(25039125, "Javier", 62);
		cola.agregar(p1);
		cola.agregar(p2);
		cola.agregar(p3);
		cola.agregar(p4);
		cola.agregar(p4);
		cola.agregar(p1);
	}
}
