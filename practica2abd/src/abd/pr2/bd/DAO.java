package abd.pr2.bd;

import java.util.List;

import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;

import net.xqj.exist.ExistXQDataSource;
import abd.pr2.controller.Controlador;
import abd.pr2.gui.FrameNews;
import abd.pr2.model.Noticia;
import abd.pr2.model.Usuario;

public class DAO {

	private XQDataSource xqs;
	
	public DAO(XQDataSource xqs){
		this.xqs=xqs;
	}
	
	public static void main(String[] args){
		
/////////////////////////////////////CONEXION///////////////////////////////////////////
		XQDataSource xqs = new ExistXQDataSource();
		try {
			xqs.setProperty("serverName", "localhost");
			xqs.setProperty("port", "8080");
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DAO dao = new DAO(xqs);
		
/////////////////////////////////////CONSULTAS CONSOLA///////////////////////////////////////////
		List<Noticia> list = dao.consultarNoticiasPorEtiqueta("Deportes");
		for(Noticia noticia : list){
			System.out.println(noticia);
		}
			
		List<String> list2 = dao.consultarEtiquetas();

		for(String st : list2){
			System.out.println(st);
		}
		
		List<Usuario> list3 = dao.consultarUsuariosMasActivos();
		for(Usuario user : list3)
			System.out.println(user);
		
		String string = dao.consultarInformacionNoticia("c02");
		System.out.println(string);

/////////////////////////////////////PARTE INTERFAZ///////////////////////////////////////////
		FrameNews frame = new FrameNews(list2.toArray(new String[list2.size()]));
		frame.setVisible(true);
		new Controlador(frame,dao);
	}

	public List<Noticia> consultarNoticiasPorEtiqueta(String etiqueta){
		ConsultaNoticiasPorCategoria cons = new ConsultaNoticiasPorCategoria(this.xqs, "etiqueta", etiqueta);
		return cons.ejecutar();
	}
	
	public List<Usuario> consultarUsuariosMasActivos(){
		ConsultaUsuariosMasActivos cons = new ConsultaUsuariosMasActivos(xqs);
		return cons.ejecutar();
	}
	
	public String consultarInformacionNoticia(String id){
		ConsultaInformacionNoticia cons = new ConsultaInformacionNoticia(xqs, 
				new Parametros("id_noticia",id ));
		return cons.ejecutar().get(0);
	}
	
	public List<String> consultarEtiquetas(){
		ConsultaEtiquetas cons = new ConsultaEtiquetas(xqs);
		return cons.ejecutar();
	}
	
}
