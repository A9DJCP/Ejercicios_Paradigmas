package EjerciciosClase9.Stack;

public class Principal {

	public static void main(String[] args) {
		int a=0;
		funcion1();
	}

	private static void funcion1() {
		int b=1;
		funcion2();
	}

	private static void funcion2() {
		int c=2;
		funcion3();
	}

	private static void funcion3() {
		int d=3;
		funcion4();		
	}

	private static void funcion4() {
		int e=4;
		funcion5();
	}

	private static void funcion5() {
		int f=5;
		int[] array = new int[2];
		//System.out.println(array[2]);
		funcion1();
	}

}
