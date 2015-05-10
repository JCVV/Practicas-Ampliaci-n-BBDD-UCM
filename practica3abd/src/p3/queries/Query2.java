package p3.queries;

import java.util.List;

import com.db4o.ObjectSet;

import p3.model.Partido;
import p3.model.ResultadoProrroga;

public class Query2 extends CollectionQuery<Partido> {

	@Override
	@Consulta(
			numero = 2,
			enunciado = "Partidos que tuvieron prórroga (independientemente de que luego hubiese fase de penaltis)",
			tipo = "QBE"
			)
	public List<Partido> ejecutar() {
		Partido prototipo = new Partido();
		prototipo.setResultado(new ResultadoProrroga(0,0,0,0));
		ObjectSet<Partido> result = db.queryByExample(prototipo);
		return result;
	}

}
