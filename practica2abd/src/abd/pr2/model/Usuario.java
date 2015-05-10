package abd.pr2.model;

public class Usuario {

	private String nombre;
	private int comentarios;
	
	public Usuario(String nombre, int comentarios) {
		this.nombre = nombre;
		this.comentarios = comentarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getComentarios() {
		return comentarios;
	}
	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", comentarios=" + comentarios
				+ "]";
	}
	
}
