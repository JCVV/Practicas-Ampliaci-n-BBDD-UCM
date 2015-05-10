package abd.pr2.bd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQResultSequence;

import org.w3c.dom.Element;

import abd.pr2.model.Noticia;

public class ConsultaNoticiasPorCategoria extends ConsultaAbstracta<Noticia> {
	private static final String ARCHIVO_CONSULTA_XQUERY = "consulta1.xquery";

	public ConsultaNoticiasPorCategoria(XQDataSource xqds, String variable, String valor) {
		super(xqds, ARCHIVO_CONSULTA_XQUERY, new Parametros(variable, valor));

	}

	protected List<Noticia> construyeLista(XQResultSequence rs) {
		List<Noticia> list = new ArrayList<Noticia>();
		try {
			while(rs.next()){
				org.w3c.dom.Element ele = (Element) rs.getObject();
				Noticia obj = buildObject(ele);	
				list.add(obj);
				}
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
		@Override
	protected Noticia buildObject(Element ele) {
		return new Noticia(ele.getAttribute("id"), ele.getAttribute("titular"));
	}	
}
