package EjerciciosClase10.Exception;

public class Principal {

	public static void main(String[] args) {
		//funcion(null); --> Rompe el main
		try {
			funcion(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void funcion(String cadena) {
		cadena.length();
	}

}
