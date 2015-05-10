package p3.model;


public class Grupo {
	private char letra;
	private Equipo[] componentes;
	
	public Grupo(char letra, Equipo[] componentes) {
		super();
		this.letra = letra;
		this.componentes = componentes;
	}

	public char getLetra() {
		return letra;
	}

	public Equipo[] getComponentes() {
		return componentes;
	}

	@Override
	public String toString() {
		return ""+letra;
	}
	
	
}
