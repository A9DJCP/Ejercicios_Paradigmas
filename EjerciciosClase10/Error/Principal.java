package EjerciciosClase10.Error;

public class Principal {

	public static void main(String[] args) {
		int n = 10;
		try {
			int[] array = new int[n];
			while (true) {
				n *= 10;
				array = new int[n];
				array[0] = n;
			}
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
			System.out.println("El último array creado fue de " + n + " posiciones.");
		}

	}
}
