package abd.pr2.bd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQResultSequence;

import org.w3c.dom.Element;

import abd.pr2.model.Usuario;

public class ConsultaUsuariosMasActivos extends ConsultaAbstracta<Usuario>{
	private static final String ARCHIVO_CONSULTA_XQUERY = "consulta2.xquery";
	
	public ConsultaUsuariosMasActivos(XQDataSource xqds) {
		super(xqds, ARCHIVO_CONSULTA_XQUERY, null);
		
	}

	protected Usuario buildObject(Element ele) {
		return new Usuario(ele.getAttribute("nombre"), 
				Integer.parseInt(ele.getAttribute("numero_comentarios")));
	}

	@Override
	protected List<Usuario> construyeLista(XQResultSequence rs) {
		List<Usuario> list = new ArrayList<Usuario>();
		try {
			while(rs.next()){
				org.w3c.dom.Element ele = (Element) rs.getObject();
				Usuario obj = buildObject(ele);	
				list.add(obj);
				}
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
		
}
