package EjerciciosClase4.Matematica;

public abstract class HacedorDeCuenta {

	protected int n;

	public HacedorDeCuenta(int n) {
		this.n = n;
	}

	abstract public int hacerCuenta(int n2);
}
