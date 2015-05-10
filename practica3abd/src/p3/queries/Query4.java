package p3.queries;

import java.util.List;

import p3.model.Partido;

public class Query4 extends CollectionQuery<Partido> {

	@Override
	@Consulta(
			numero = 4,
			enunciado = "Partidos en los que la diferencia de puntuación (sin contar prorroga ni penaltis) entre el ganador y el perdedor es de tres goles o más",
			tipo = "Consultas nativas (clase Predicate<T>)"
			)
	public List<Partido> ejecutar() {
		return null;
	}

}
