package EjerciciosClase3.Multiplicador;

public class Multiplicador {

	public static int n;

	public Multiplicador(int n) {
		Multiplicador.n = n;
	}

	public static int multiplicar(int n2) {
		return n * n2;
	}

	public static Multiplicador dameMultiplicador(int n) {
		return new Multiplicador(n);
	}
}
