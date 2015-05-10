package p3.queries;

import java.util.List;

import com.db4o.ObjectSet;

import p3.model.Equipo;
import p3.model.Hora;
import p3.model.Partido;
import p3.model.TipoPartido;

public class Query0 extends CollectionQuery<Partido> {

	@Override
	@Consulta(
			numero = 0,
			enunciado = "Partidos de primera fase en los que españa (Spain) ha jugado a las 20:30",
			tipo = "QBE"
			)
	public List<Partido> ejecutar() {
		Partido prototipo = new Partido();
		Equipo equipo = new Equipo("Spain", null, null);
		prototipo.setEquipos(new Equipo[]{equipo});
		prototipo.setHora(new Hora(20, 30));
		prototipo.setTipo(TipoPartido.PRIMERA_FASE);
		ObjectSet<Partido> result = db.queryByExample(prototipo);
		return result;
	}

}
