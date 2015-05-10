package p3.queries;

import com.db4o.ObjectContainer;

/**
 * Subclase de todas las consultas
 * 
 * @author Manuel Montenegro
 *
 * @param <T> Tipo del resultado de la consulta
 */
abstract public class AbstractQuery<T> {
	protected ObjectContainer db = null;
	
	/**
	 * Establece el ObjectContainer asociado a la consulta
	 * 
	 * @param db Object container a cambiar
	 */
	public void setObjectContainer(ObjectContainer db) {
		this.db = db; 
	}
	
	/**
	 * Devuelve el ObjectContainer asociado a la consulta
	 * 
	 * @return Object container de la consulta
	 */
	public ObjectContainer getObjectContainer() {
		return this.db;
	}

	/**
	 * Ejecuta la consulta.
	 * 
	 * @return Resultado de la consulta.
	 */
	public abstract T ejecutar();
	
	/**
	 * Muestra el resultado de la consulta por pantalla
	 * 
	 * @param T resultado de la consulta
	 */
	public abstract void mostrarResultado();
	
}
