package abd.pr2.bd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQResultSequence;

import org.w3c.dom.Element;

public class ConsultaInformacionNoticia extends ConsultaAbstracta<String>{

	private static final String ETIQUETAS_CONSULTA_XQUERY = "consulta4.xquery";
	
	public ConsultaInformacionNoticia(XQDataSource xqds, Parametros parametros) {
		super(xqds, ETIQUETAS_CONSULTA_XQUERY, parametros);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<String> construyeLista(XQResultSequence rs) {
		String cadena = new String();
		try {
			if(rs.next()){
				cadena = rs.getItemAsString(null);
			}
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> list = new ArrayList<String>();
		list.add(cadena);
		return list;
	}

	@Override
	protected String buildObject(Element ele) {
		// TODO Auto-generated method stub
		return null;
	}

}
