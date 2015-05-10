package abd.pr2.bd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQResultSequence;

import org.w3c.dom.Element;

public class ConsultaEtiquetas extends ConsultaAbstracta<String>{
	
	private static final String ETIQUETAS_CONSULTA_XQUERY = "consulta3.xquery";
	
	public ConsultaEtiquetas(XQDataSource xqds) {
		super(xqds, ETIQUETAS_CONSULTA_XQUERY, null);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	protected String buildObject(Element ele) {
		
		return null;
	}



	@Override
	protected List<String> construyeLista(XQResultSequence rs) {
		List<String> list = new ArrayList<String>();
		String cadena = new String();
		try {
			if(rs.next()){
				org.w3c.dom.Element ele = (Element) rs.getObject();
				cadena = ele.getAttribute("etiqueta");
			}
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] cadenaSeparada = cadena.split("\\,");
		for(int i=0; i<cadenaSeparada.length; i++)
			list.add(cadenaSeparada[i]);
		
		return list;
			
	}

}
