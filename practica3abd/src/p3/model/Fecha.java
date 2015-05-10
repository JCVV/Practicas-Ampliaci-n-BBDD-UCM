package p3.model;

public class Fecha {
	private int dia, mes, anyo;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public Fecha(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}
	
	
}
