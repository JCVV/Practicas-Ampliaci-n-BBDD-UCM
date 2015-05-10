package p3.queries;

import java.util.List;

/**
 * Consulta que devuelve una colección de objetos de tipo T
 *  
 * @author Manuel Montenegro
 *
 * @param <T> Tipo de cada elemento devuelto
 */
abstract public class CollectionQuery<T> extends AbstractQuery<List<T>> {

	@Override
	public void mostrarResultado() {
		List<T> resultado = ejecutar();
		if (resultado != null) {
			int i = 1;
			for (T elem : resultado) {
				System.out.println((i++) + ": " + elem.toString());
			}
		} else {
			System.out.println("Consulta no implementada, o devuelve null.");
		}
	}

}
