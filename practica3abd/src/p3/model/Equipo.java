package p3.model;

public class Equipo {
	public String pais;
	public String entrenador;
	public Jugador[] jugadores;
	public Grupo grupo;
	
	public String getPais() {
		return pais;
	}
	
	public String getEntrenador() {
		return entrenador;
	}
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Equipo(String pais, String entrenador, Jugador[] jugadores) {
		this.pais = pais;
		this.entrenador = entrenador;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return pais + "(" + grupo + ")";
	}
	
	
}
