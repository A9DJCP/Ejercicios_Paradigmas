package EjerciciosClase2.AulasVirtuales;

import EjerciciosClase2.AulasVirtuales.Persona.Alumno;
import EjerciciosClase2.AulasVirtuales.Persona.Docente;
import EjerciciosClase2.AulasVirtuales.Persona.Persona;

public class Materia {
	public Docente docente;
	public Alumno[] alumnos;
	public String nombreMateria;
	
	public Materia(Docente docente, Alumno[] alumnos, String nombreMateria) {
		this.docente= docente;
		this.alumnos = alumnos;
		this.nombreMateria = nombreMateria;
	}

	public Persona[] listarParticipantes() {
		Persona[] lista = new Persona[alumnos.length+1];
		lista[0] = docente;
		for(int i=1; i<lista.length; i++) {
			lista[i] = alumnos[i-1];
		}
		return lista;
	}

}
