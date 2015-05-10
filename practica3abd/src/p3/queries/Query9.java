package p3.queries;

import java.util.List;
import p3.model.Equipo;

public class Query9 extends CollectionQuery<Equipo> {

	@Override
	@Consulta(
			numero = 9,
			enunciado = "Equipos que contengan algún jugador que mida dos metros o más",
			tipo = "SODA"
			)
	public List<Equipo> ejecutar() {
		return null;
	}

}
