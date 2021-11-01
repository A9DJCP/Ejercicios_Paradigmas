package EjerciciosClase6.Tareas;

public class TareaString implements Tarea {
	private String impresion;

	public TareaString(String impresion) {
		this.impresion = impresion;
	}

	@Override
	public void ejecutar() {
		System.out.println(this.impresion);

	}

	@Override
	public String getNombre() {
		return this.getClass().getName();
	}

}
