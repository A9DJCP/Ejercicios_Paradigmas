package EjerciciosClase5.Equals1;

public class Principal {

	public static void main(String[] args) {
		Album a1, a2;
		a1 = new Album("Calamaro", "Carnaval");
		a2 = new Album("Calamaro", "Carnaval");
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
	}

}
