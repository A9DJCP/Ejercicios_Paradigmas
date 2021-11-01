package EjerciciosClase8.ComparatorCustomizadoExterno;

import java.util.Comparator;
import java.util.Objects;

public class Producto implements Comparator<Producto> {
	private static int maxIdProducto = 0;
	public String nombreProducto;
	public int idProducto;

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
	public int compare(Producto o1, Producto o2) {
		return o1.nombreProducto.compareTo(o2.nombreProducto);

	}

}
