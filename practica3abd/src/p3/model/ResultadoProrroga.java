package p3.model;

public class ResultadoProrroga extends Resultado {
	private int equipo1Prorroga;
	private int equipo2Prorroga;
	
	public ResultadoProrroga(int equipo1, int equipo2, int equipo1Prorroga,
			int equipo2Prorroga) {
		super(equipo1, equipo2);
		this.equipo1Prorroga = equipo1Prorroga;
		this.equipo2Prorroga = equipo2Prorroga;
	}

	public int getEquipo1Prorroga() {
		return equipo1Prorroga;
	}

	public int getEquipo2Prorroga() {
		return equipo2Prorroga;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + equipo1Prorroga
				+ "-" + equipo2Prorroga + ")";
	}

	
	
}
