package p3.queries;

/**
 * Consulta que devuelve un solo elemento de tipo T
 * 
 * @author Manuel Montenegro
 *
 * @param <T> Tipo del elemento devuelto
 */
abstract public class SingleValueQuery<T> extends AbstractQuery<T> {

	@Override
	public void mostrarResultado() {
		T resultado = ejecutar();
		if (resultado != null) {
			System.out.println(ejecutar().toString());
		} else {
			System.out.println("Consulta no implementada, o devuelve null.");
		}
				
	}

}
