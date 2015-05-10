package p3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Decididor {
	public static int NUMERO_CONSULTAS = 4;
	
	public static int[] decidir(int[] DNIs) {
		int[] result = new int[NUMERO_CONSULTAS];
		boolean[] marked = new boolean[10];
		int indice = 0;
		
		Arrays.sort(DNIs);
		
		Queue<Integer> cola = new LinkedList<Integer>();
		for (int dni : DNIs) {
			if (dni > 0) {
				cola.add(dni);				
			}
		}
		for (int i = 0; i < marked.length; i++) marked[i] = false;
		
		while (indice < NUMERO_CONSULTAS && !cola.isEmpty()) {
			int dni = cola.remove();
			int queryNumber = dni % 10;
			if (!marked[queryNumber]) {
				marked[queryNumber] = true;
				result[indice++] = queryNumber;
			} 
			dni = dni / 10;
			if (dni != 0) {
				cola.add(dni);
			}
		}
		
		if (indice < NUMERO_CONSULTAS) {
			System.err.println("No hay suficientes digitos distintos en los DNIs como para asignar ejercicios.");
			System.err.println("Comprueba si has rellenado el atributo DNIs.\n"
					+ "Si lo has hecho y sigue apareciendo este error, consulta con el profesor.");
			return null;
		} else {
			Arrays.sort(result);
			return result;
		}
	}

}
