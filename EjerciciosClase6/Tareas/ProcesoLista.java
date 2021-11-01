package EjerciciosClase6.Tareas;

import java.util.List;

public class ProcesoLista implements Tarea {
	
	private List lista;
	public ProcesoLista(List lista) {
		this.lista=lista;
	}
	
	@Override
	public void ejecutar() {
		List newList = this.lista;
		lista.clear();
		System.out.println("Tamaño Lista: " + newList.size());
	}

	@Override
	public String getNombre() {
		return this.getClass().getName();
	}

}
