package p3.model;

public class ResultadoPenaltis extends ResultadoProrroga {
	private int equipo1penaltis;
	private int equipo2penaltis;
	
	public ResultadoPenaltis(int equipo1, int equipo2, int equipo1Prorroga,
			int equipo2Prorroga, int equipo1penaltis, int equipo2penaltis) {
		super(equipo1, equipo2, equipo1Prorroga, equipo2Prorroga);
		this.equipo1penaltis = equipo1penaltis;
		this.equipo2penaltis = equipo2penaltis;
	}

	public int getEquipo1penaltis() {
		return equipo1penaltis;
	}

	public int getEquipo2penaltis() {
		return equipo2penaltis;
	}

	@Override
	public String toString() {
		return super.toString() + " (PEN: " + equipo1penaltis
				+ "-" + equipo2penaltis + ")";
	}
}
