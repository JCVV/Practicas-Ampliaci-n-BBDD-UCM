package abd.pr2.bd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import org.w3c.dom.Element;

public abstract class ConsultaAbstracta<T> {

	//private static final String ARCHIVO_CONSULTA_XQUERY;
	private XQDataSource xqds;
	private String nombreArchivo;
	private Parametros parametros;
	
	public ConsultaAbstracta(XQDataSource xqds, String nombreArchivo, Parametros parametros) {
		this.xqds = xqds;
		this.nombreArchivo = nombreArchivo;
		this.parametros=parametros;
	}

	public List<T> ejecutar(){
		List<T> lista = new ArrayList<T>();

		try {
			//Apertura del archivo de la consulta:
			InputStream is = new FileInputStream(nombreArchivo);
			//Creación de la conexión:
			XQConnection con = xqds.getConnection("admin", "");
			//Creación del XQPreparedExpression a partir de la conexión:
			XQPreparedExpression exp = con.prepareExpression(is);
			//Parámetro de la consulta;
			if(this.parametros!=null)
				exp.bindString(new QName(this.parametros.getVariable()), this.parametros.getValor(), null);
			//Ejecución de la expresión:
			XQResultSequence rs = exp.executeQuery();
			//Iteramos sobre los resultados:
			
				lista = construyeLista(rs);		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
		
	}

	protected abstract List<T> construyeLista(XQResultSequence rs);

	protected abstract T buildObject(Element ele);
	
}
