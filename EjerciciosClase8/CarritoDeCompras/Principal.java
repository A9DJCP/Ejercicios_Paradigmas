package EjerciciosClase8.CarritoDeCompras;

import java.util.Map;
import java.util.TreeMap;

public class Principal {

	// public static Map<Producto, Integer> carritoDeCompras = new HashMap<Producto,
	// Integer>();
	public static Map<Producto, Integer> carrito = new TreeMap<Producto, Integer>();

	public static void main(String[] args) {
		Producto p1, p2, p3, p4, p5;
		p1 = new Producto(Producto.getMaxIdProducto(), "Banana");
		p2 = new Producto(Producto.getMaxIdProducto(), "Manzana");
		p3 = new Producto(Producto.getMaxIdProducto(), "Vino");
		p4 = new Producto(Producto.getMaxIdProducto(), "Cerveza");
		p5 = new Producto(Producto.getMaxIdProducto(), "Agua");

		agregarProducto(p5);
		agregarProducto(p5);
		agregarProducto(p5);
		agregarProducto(p1);
		agregarProducto(p4);
		agregarProducto(p3);
		agregarProducto(p4);
		agregarProducto(p2);
		agregarProducto(p2);
		agregarProducto(p2);
		agregarProducto(p2);
		agregarProducto(p5);

		for (Producto producto : carrito.keySet()) {
			System.out.println("ID: " + producto.idProducto + " // Producto: " + producto.nombreProducto + " // Cant: "
					+ carrito.get(producto).intValue());
		}


	}

	private static void agregarProducto(Producto producto) {
		if (carrito.containsKey(producto))
			carrito.put(producto, carrito.get(producto).intValue() + 1);
		else
			carrito.put(producto, 1);
	}

}
