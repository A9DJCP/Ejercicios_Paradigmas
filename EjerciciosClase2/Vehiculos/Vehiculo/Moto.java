package EjerciciosClase2.Vehiculos.Vehiculo;

public class Moto extends Vehiculo {
	public int cilindrada;
	public String tipoManubrio;
	
	public Moto(String nombre, int cantRuedas, int cilindrada, String tipoManubrio) {
		super(nombre, cantRuedas);
		this.cilindrada = cilindrada;
		this.tipoManubrio = tipoManubrio;
	}
}
