package p3.queries;

import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

import p3.model.Equipo;


public class Query5 extends SingleValueQuery<Character> {

	@Override
	@Consulta(
			numero = 5,
			enunciado = "Letra del grupo al que pertenece el equipo de Paraguay.",
			tipo = "Consultas nativas (clase Predicate<T>)"
			)
	public Character ejecutar() {
		
		ObjectSet<Equipo> result = db.query(new Predicate<Equipo>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean match(Equipo equipo) {
				// TODO Auto-generated method stub
					if(equipo.getPais().equals("Paraguay"))
						return true;
				return false;
				}
			}
		);
		return result.get(0).getGrupo().getLetra();
	}

}
