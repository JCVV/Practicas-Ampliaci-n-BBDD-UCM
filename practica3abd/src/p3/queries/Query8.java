package p3.queries;

import java.util.List;

import com.db4o.ObjectSet;
import com.db4o.query.Query;

import p3.model.Jugador;

public class Query8 extends CollectionQuery<Jugador> {

	@Override
	@Consulta(
			numero = 8,
			enunciado = "Jugadores en cuyo nombre de inscripción no aparezca ni la letra 'A', "
					+ "ni la letra 'E', ni la letra 'I'. Para facilitar las cosas, ten en cuenta "
					+ "que la función like() de la clase Constraint no hace distinción entre "
					+ "mayúsculas y minúsculas.",
			tipo = "SODA"
			)
	public List<Jugador> ejecutar() {
		Query q = db.query();
		q.constrain(Jugador.class);
		q.descend("nombreInscrito").constrain("A").like().not();
		q.descend("nombreInscrito").constrain("E").like().not();
		q.descend("nombreInscrito").constrain("I").like().not();
		ObjectSet<Jugador> result = q.execute();
		return result;
	}

}
