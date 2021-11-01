package EjerciciosClase6.Tareas;

import java.util.List;

public class Principal {

	public static int ejecucionTareas = 0;
	
	public static void main(String[] args) {

	}
	
	public static void procesarBatch(List<Tarea> tareas) {
		for(int i=0; i<tareas.size(); i++) {
			System.out.println("TAREA: " + tareas.get(i).getNombre());
			tareas.get(i).ejecutar();
		}
	}
}
