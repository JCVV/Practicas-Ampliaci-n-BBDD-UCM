package p3.model;

public class Estadio {
	private String nombre;
	private String ciudad;
	
	public Estadio(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return nombre + " (" + ciudad + ")";
	}
	
	
}
