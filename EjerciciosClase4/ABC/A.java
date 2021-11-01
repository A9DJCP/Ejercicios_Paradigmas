package EjerciciosClase4.ABC;

public class A {
	public int nro;
	public A(int nro) {
		this.nro = nro;
		System.out.println("Estoy construyendo un A/B/C // Nro: " + this.nro);
	}
	
	public void hola() {
		System.out.println("Hola en A");
	}
}
