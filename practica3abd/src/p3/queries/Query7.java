package p3.queries;

import p3.model.Jugador;

public class Query7 extends SingleValueQuery<Jugador> {

	@Override
	@Consulta(
			numero = 7,
			enunciado = "Jugador cuyo apellido acaba con la cadena \"COCA\". Consulta el método endsWith() en la documentación de db4o",
			tipo = "SODA"
			)
	public Jugador ejecutar() {
		return null;
	}

}
