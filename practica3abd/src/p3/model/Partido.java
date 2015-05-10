package p3.model;

public class Partido {
	private Fecha fecha;
	private Hora hora;
	private TipoPartido tipo;
	private Equipo[] equipos;
	private Estadio estadio;
	private Resultado resultado;
	
	public Partido() {
		this.fecha = null;
		this.hora = null;
		this.tipo = null;
		this.equipos = null;
		this.estadio = null;
		this.resultado = null;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public TipoPartido getTipo() {
		return tipo;
	}

	public void setTipo(TipoPartido tipo) {
		this.tipo = tipo;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}


	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Partido [fecha=" + fecha + ", hora=" + hora + ", tipo=" + tipo
				+ ", equipo1=" + equipos[0] + ", equipo2=" + equipos[1]
				+ ", estadio=" + estadio + ", resultado=" + resultado + "]";
	}
}
