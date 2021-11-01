package EjerciciosClase7.TiposDeDatosAbstractosConjunto;

import java.util.ArrayList;
import java.util.List;

public class listaObjetos implements Conjunto {

	private List<Object> lista = new ArrayList<Object>();
	
	@Override
	public boolean pertenece(Object o) {
		if(lista.contains(o)) return true;
		return false;
	}

}
