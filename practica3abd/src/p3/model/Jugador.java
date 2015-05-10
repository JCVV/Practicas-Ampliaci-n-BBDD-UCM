package p3.model;

public class Jugador {
	private int numero;
	private Posicion posicion;
	private String nombreInscrito;
	private String apellido;
	private String nombre;
	private String nombreCamiseta;
	private Fecha fechaNacimiento;
	private String club;
	private int altura;
	
	public Jugador() {
		this.numero = 0;
		this.posicion = null;
		this.nombreInscrito = null;
		this.apellido = null;
		this.nombre = null;
		this.fechaNacimiento = null;
		this.club = null;
		this.altura = 0;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public void setNombreInscrito(String nombreInscrito) {
		this.nombreInscrito = nombreInscrito;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombreCamiseta(String nombreCamiseta) {
		this.nombreCamiseta = nombreCamiseta;
	}
	
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getNumero() {
		return numero;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public String getNombreInscrito() {
		return nombreInscrito;
	}


	public String getApellido() {
		return apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public String getNombreCamiseta() {
		return nombreCamiseta;
	}


	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}


	public String getClub() {
		return club;
	}


	public int getAltura() {
		return altura;
	}


	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", posicion=" + posicion
				+ ", nombreInscrito=" + nombreInscrito + ", apellido="
				+ apellido + ", nombre=" + nombre + ", nombreCamiseta="
				+ nombreCamiseta + ", fechaNacimiento=" + fechaNacimiento
				+ ", club=" + club + ", altura=" + altura + "]";
	}
	
	
}
