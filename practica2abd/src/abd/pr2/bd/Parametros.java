package abd.pr2.bd;

public class Parametros {
	/*Clase que se podría usar en el caso en el que hubiese más de un parámetro en una consulta.
	 * En esta práctica no sería necesario.
	*/
	private String variable;
	private String valor;
	public Parametros(String variable, String valor) {
		super();
		this.variable = variable;
		this.valor = valor;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
