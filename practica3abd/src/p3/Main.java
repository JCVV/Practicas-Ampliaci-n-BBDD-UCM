package p3;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import p3.queries.AbstractQuery;
import p3.queries.Consulta;

public class Main {

	/*
	 * IMPORTANTE:
	 * 
	 * Introducir los DNIs (o NIEs, en su caso) de los componentes del grupo
	 * dentro del siguiente array sin letras ni comillas. El orden no importa.
	 */
	public static int[] DNIs = {04620230, 70083402
		// Por ejemplo: 23123215, 95817231, ...
		
	};
	
	private static final String CLASS_PREFIX = "p3.queries.Query";
	private static final String DB4O_FILE = "mundial2010.db4o";
	
	public static void main(String[] args) {
		ObjectContainer db = Db4oEmbedded.openFile(DB4O_FILE); 
		int[] consultas = Decididor.decidir(DNIs);
		if (consultas != null) {
			System.out.print("Consultas a realizar: ");
			for (int i : consultas) {
				System.out.print(i + " ");
			}
			System.out.println("\n");
			for (int i : consultas) {
				AbstractQuery<?> consulta = findQuery(i);
				if (consulta != null) {
					consulta.setObjectContainer(db);
					executeQuery(consulta);
				}
			}
		}
		db.close();
	}

	/**
	 * Ejecuta la consulta pasado como parámetro
	 * y muestra sus resultados, incluyendo su enunciado
	 * 
	 * @param query Consulta a ejecutar
	 */
	public static void executeQuery(AbstractQuery<?> query) {
		try {
			System.out.println("--------------------------------------------------------");
			Consulta c = query.getClass().getMethod("ejecutar")
					.getAnnotation(Consulta.class); 
			if (c == null) throw new Exception("No se ha encontrado la anotación @Consulta encima del método ejecutar");
			System.out.println("Numero: " + c.numero());
			System.out.println(c.enunciado());
			System.out.println("Utilizar: " + c.tipo());
			System.out.println("--------------------------------------------------------");
			System.out.println("Resultado:\n");
			
			query.mostrarResultado();
			
			System.out.println("\n--------------------------------------------------------\n");
		} catch (NoSuchMethodException e) {
			System.err.println("No se ha encontrado el método ejecutar en la consulta.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
				
	}
	
	/**
	 * Crea una consulta a partir del número pasado como parámetro
	 */
	public static AbstractQuery<?> findQuery(int number)  {
		String className = CLASS_PREFIX + number;
		try {
			Class<?> cl = Class.forName(CLASS_PREFIX + number);
			return (AbstractQuery<?>) cl.newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println("No se ha encontrado la clase " + className);
		} catch (InstantiationException e) {
			System.err.println("Error al crear una instancia de " + className +
					"\n¿Has sobreescrito su constructor?");
		} catch (IllegalAccessException e) {
			System.err.println("Error al crear una instancia de " + className +
					"\n¿Has sobreescrito su constructor?");
		} 
		return null;
	}
	
}
