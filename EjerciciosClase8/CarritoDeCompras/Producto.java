package EjerciciosClase8.CarritoDeCompras;

import java.util.Objects;

public class Producto implements Comparable<Object> {
	private static int maxIdProducto = 0;
	public int idProducto;
	public String nombreProducto;

	public Producto(int idProducto, String nombreProducto) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		maxIdProducto++;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.idProducto, this.nombreProducto);

	}

	@Override
	public boolean equals(Object o) {
		return (this == o);
	}

	public static int getMaxIdProducto() {
		return maxIdProducto;
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.idProducto == ((Producto) o).idProducto) return 0;
		if(this.idProducto > ((Producto) o).idProducto) return 1;
		if(this.idProducto < ((Producto) o).idProducto) return -1;
		return 0;
	}

}
