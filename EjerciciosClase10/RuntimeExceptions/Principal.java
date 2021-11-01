package EjerciciosClase10.RuntimeExceptions;

public class Principal {

	public static void main(String[] args) {
		try {
			codigo1(null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			codigo2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void codigo1(String cadena) {
		/* NullPointerException */
		System.out.println(cadena.length());
	}

	private static void codigo2() {
		/* ArrayIndexOutOfBoundsException */
		int[] array = new int[2];
		array[0] = 0;
		array[1] = 2;
		array[2] = 3;
	}

}
