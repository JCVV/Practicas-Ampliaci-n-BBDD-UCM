package p3.queries;

import p3.model.Fecha;

public class Query6 extends SingleValueQuery<Fecha> {

	@Override
	@Consulta(
			numero = 6,
			enunciado = "Fecha de nacimiento del jugador que tiene la cadena \"DAVID VILLA\" en su camiseta",
			tipo = "SODA"
			)
	public Fecha ejecutar() {
		return null;
	}

}
