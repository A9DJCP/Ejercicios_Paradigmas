package EjerciciosClase4.Matematica;

public class Multiplicador extends HacedorDeCuenta {

	public Multiplicador(int n) {
		super(n);
	}

	@Override
	public int hacerCuenta(int n2) {
		return super.n*n2;
	}

}
