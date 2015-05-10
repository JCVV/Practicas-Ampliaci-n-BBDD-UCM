package p3.model;

public class Hora {
	private int hora;
	private int minuto;
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}

	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return hora + ":" + (minuto < 10 ? "0" + minuto : minuto);
	}
	
	
}
