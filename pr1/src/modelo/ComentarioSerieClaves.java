package modelo;

public class ComentarioSerieClaves {

	private String nick;
	private int idSerie;
	public ComentarioSerieClaves(String nick, int idSerie) {
		super();
		this.nick = nick;
		this.idSerie = idSerie;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getIdSerie() {
		return idSerie;
	}
	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}
	
	
}
