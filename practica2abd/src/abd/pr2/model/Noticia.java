package abd.pr2.model;

public class Noticia {
	private String id;
	private String titular;
	
	public Noticia(String id, String titular) {
		this.id = id;
		this.titular = titular;
	}

	public String getId() {
		return id;
	}

	public String getTitular() {
		return titular;
	}
	
	public String toString() {
		return titular;
	}
}
