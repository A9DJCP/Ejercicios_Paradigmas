package EjerciciosClase2.Vehiculos.Vehiculo;

public class Auto extends Vehiculo {
	public int cantPuertas;
	public boolean baul;

	public Auto(String nombre, int cantRuedas, int cantPuertas, boolean baul) {
		super(nombre, cantRuedas);
		this.cantPuertas = cantPuertas;
		this.baul = baul;
	}
}
