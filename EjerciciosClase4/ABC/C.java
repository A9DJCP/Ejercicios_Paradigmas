package EjerciciosClase4.ABC;

public class C extends B {

	public C(int nro) {
		super(nro);
		System.out.println("Estoy construyendo un A/B/C  // Nro: " + nro);
	}

	@Override
	public void hola() {
		System.out.println("Hola en C");
	}
}
