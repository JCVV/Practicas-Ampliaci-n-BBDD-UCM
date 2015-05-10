package p3.model;

public class Resultado {
	private int equipo1;
	private int equipo2;
	
	public Resultado(int equipo1, int equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public int getEquipo1() {
		return equipo1;
	}

	public int getEquipo2() {
		return equipo2;
	}

	@Override
	public String toString() {
		return equipo1 + "-" + equipo2;
	}
	
	
}
