package p3.queries;

import java.util.List;

import p3.model.Jugador;

public class Query3 extends CollectionQuery<Jugador> {

	@Override
	@Consulta(
			numero = 3,
			enunciado = "Jugadores del Chelsea (Chelsea (ENG)) nacidos entre 1980 y 1989 (inclusive)",
			tipo = "Consultas nativas (clase Predicate<T>)"
			)
	public List<Jugador> ejecutar() {
		return null;
	}

}
