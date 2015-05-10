package abd.pr2.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class VisorNoticias extends JTextPane {
	private static final String TEMPLATE_MARK = "$$$";
	private static final String TEMPLATE_HTML = "Template.html";
	private String templateText = null;
	
	
	public VisorNoticias() {
		setContentType("text/html");
		setEditable(false);
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(TEMPLATE_HTML));
			StringBuilder sb = new StringBuilder();
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea);
				sb.append(System.getProperty("line.separator"));
			}
			templateText = sb.toString();
		} catch (IOException e) {
			System.err.println("Aviso: No se ha podido cargar el fichero " + TEMPLATE_HTML + 
					". El contenido de las noticias aparecerá sin formatear.");
		} finally {
			if (br != null) { try { br.close(); } catch (IOException e) {} }
		}
	}
	
	public void setBodyText(String body) {
		String text;
		if (templateText != null) {
			text = templateText.replace(TEMPLATE_MARK, body);
		} else {
			text = body;
		}
		setText(text);
	}

}
