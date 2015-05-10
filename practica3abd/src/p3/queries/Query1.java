package p3.queries;

import java.util.List;

import p3.model.Partido;

public class Query1 extends CollectionQuery<Partido> {

	@Override
	@Consulta(
			numero = 1,
			enunciado = "Partidos jugados en Johannesburgo (Johannesburg) durante el mes de Julio",
			tipo = "QBE"
			)
	public List<Partido> ejecutar() {
		return null;
	}

}
