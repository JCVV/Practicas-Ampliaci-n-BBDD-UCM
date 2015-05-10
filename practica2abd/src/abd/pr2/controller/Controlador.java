package abd.pr2.controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import abd.pr2.bd.DAO;
import abd.pr2.gui.FrameNews;
import abd.pr2.model.Noticia;

public class Controlador implements ListSelectionListener, ItemListener{

	private FrameNews vista;
	private DAO dao;
	
	
	public Controlador(FrameNews vista, DAO dao) {
		super();
		this.vista = vista;
		this.dao = dao;
		this.vista.addItemListener(this);
		this.vista.addSelectionListener(this);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox combo = (JComboBox) e.getSource();
			String cadena = (String) combo.getSelectedItem();
			this.vista.actualizaNoticias(dao.consultarNoticiasPorEtiqueta(cadena));
		}
		
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {

		if (!e.getValueIsAdjusting()){
            JList source = (JList)e.getSource();
            Noticia selected = (Noticia) source.getSelectedValue();
            if(selected!=null)
            	this.vista.setNoticia(this.dao.consultarInformacionNoticia(selected.getId()));
        }
		
	}

}
