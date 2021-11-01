package EjerciciosClase6.Tareas;

public class ContadorEjecuciones implements Tarea {

	@Override
	public void ejecutar() {
		Principal.ejecucionTareas++;
	}

	@Override
	public String getNombre() {
		return this.getClass().getName();
	}
	
}
