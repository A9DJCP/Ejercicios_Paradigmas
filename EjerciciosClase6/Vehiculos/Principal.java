package EjerciciosClase6.Vehiculos;

public class Principal {

	public static void main(String[] args) {
		Vehiculo v1, v2, v3, v4, v5;
		v1 = new Auto();
		v2 = new Avion();
		v3 = new Helicoptero();
		v4 = new Lancha();
		
		hacerVolar(v1);
	}

	public static void hacerVolar(Vehiculo vehiculo) {
		if (esVolador(vehiculo))
			System.out.println("El vehiculo está volando");
		else
			System.out.println("Este vehiculo no vuela");
	}
	
	public static boolean esVolador(Vehiculo vehiculo) {
		if (vehiculo instanceof Volador)
			return false;
		return true;
	}
	
	
}
