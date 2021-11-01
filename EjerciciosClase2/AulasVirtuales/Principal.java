package EjerciciosClase2.AulasVirtuales;

import EjerciciosClase2.AulasVirtuales.Persona.Alumno;
import EjerciciosClase2.AulasVirtuales.Persona.Docente;
import EjerciciosClase2.AulasVirtuales.Persona.Persona;

public class Principal {

	public static void main(String[] args) {
		Docente d1 = new Docente("Laura", "Rodriguez", 25222111, "Matemática", 100234510);
		Alumno a1, a2, a3;
		a1 = new Alumno("Tomás", "Fernandez", 45001223, false, false, 1);
		a2 = new Alumno("Camila", "Torrente", 47000112, false, true, 2);
		a3 = new Alumno("Ricardo", "Millos", 48691696, true, true, 3);
		Alumno[] alumnos = new Alumno[3];
		alumnos[0] = a1;
		alumnos[1] = a2;
		alumnos[2] = a3;
		/* No lo hice con un for porque eran pocos :p */

		Materia m1 = new Materia(d1, alumnos, "Matemática");
		
		Persona[] personas = m1.listarParticipantes();
		for(int i=0; i<personas.length;i++) {
			System.out.println(personas[i].nombre + " " + personas[i].apellido + " // DNI: " + personas[i].DNI);
		}
	}

}
