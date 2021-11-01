package EjerciciosClase7.TiposDeDatosAbstractosConjunto;

public class isNumber implements Conjunto {

	@Override
	public boolean pertenece(Object o) {
		if (o instanceof Integer) {
			if ((((Integer) o % 2) == 0))
				return true;
		}
		return false;
	}

}
