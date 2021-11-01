package EjerciciosClase3.Auto.Autos;

public class FabricaDeAuto {

	public String marca;
	public static int año;

	public FabricaDeAuto(String marca) {
		this.marca = marca;
	}
	
	public Auto fabricarAuto(String modelo) {
		if(año == 0) {
			System.out.println("Error");
			return null;
		} else {
		return new Auto(this.marca, modelo, FabricaDeAuto.año);
		}
	}
	
}
