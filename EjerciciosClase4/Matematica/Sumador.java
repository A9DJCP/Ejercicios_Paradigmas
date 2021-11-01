package EjerciciosClase4.Matematica;

public class Sumador extends HacedorDeCuenta {

	public Sumador(int n) {
		super(n);
	}

	@Override
	public int hacerCuenta(int n2) {
		return super.n + n2;
	}

}
