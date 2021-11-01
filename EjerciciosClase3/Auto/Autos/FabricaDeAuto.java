package EjerciciosClase3.Auto.Autos;

public class FabricaDeAuto {

	public String marca;
	public static int a�o;

	public FabricaDeAuto(String marca) {
		this.marca = marca;
	}
	
	public Auto fabricarAuto(String modelo) {
		if(a�o == 0) {
			System.out.println("Error");
			return null;
		} else {
		return new Auto(this.marca, modelo, FabricaDeAuto.a�o);
		}
	}
	
}
