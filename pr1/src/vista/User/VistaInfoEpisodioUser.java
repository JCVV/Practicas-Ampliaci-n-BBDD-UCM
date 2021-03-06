package vista.User;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.Document;

import modelo.ComentarioEpisodio;
import modelo.ComentarioSerie;
import modelo.Episodio;
import modelo.ParNombreActor;

/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alex
 */
public class VistaInfoEpisodioUser extends javax.swing.JFrame {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form vistaEpisodioUser
     */

    // Variables declaration - do not modify                     
    private javax.swing.JLabel actoresLabel;
    private javax.swing.JButton comentarioBoton;
    private javax.swing.JTextArea comentarioTextArea;
    private javax.swing.JLabel comentariosLabel;
    private javax.swing.JTextPane comentariosPane;
    private javax.swing.JLabel temporadaEpisodioLabel;
    private javax.swing.JLabel temporadaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JButton salirBoton;
    private javax.swing.JTextArea sinopsisText;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel valorNota;
    private javax.swing.JButton votarBoton;
    // End of variables declaration          

	
    public VistaInfoEpisodioUser(Episodio episodio) {
        initComponents(episodio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Episodio episodio) {

    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tituloLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsisText = new javax.swing.JTextArea();
        temporadaLabel = new javax.swing.JLabel();
        temporadaEpisodioLabel = new javax.swing.JLabel();
        notaLabel = new javax.swing.JLabel();
        valorNota = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();

        jSlider1.setMaximum(10);
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
        
        votarBoton = new javax.swing.JButton();
        actoresLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comentariosLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        comentariosPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        comentarioTextArea = new javax.swing.JTextArea();
        comentarioBoton = new javax.swing.JButton();
        this.comentarioBoton.setActionCommand("comentar");
        salirBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloLabel.setText(episodio.toString2());

        jLabel1.setText("Sinopsis:");

        sinopsisText.setColumns(20);
        sinopsisText.setRows(5);
        jScrollPane1.setViewportView(sinopsisText);
        sinopsisText.setText(episodio.getSinopsis());

        temporadaLabel.setText("Temporada:");

        temporadaEpisodioLabel.setText(episodio.getNumTemporada().toString());

        notaLabel.setText("Nota:");

        valorNota.setText("notaMedia");

        votarBoton.setText("Votar");
        votarBoton.setActionCommand("votar");

        actoresLabel.setText("Actores:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Actor", "Papel"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        comentariosLabel.setText("Comentarios");

        jScrollPane3.setViewportView(comentariosPane);

        comentarioTextArea.setColumns(20);
        comentarioTextArea.setRows(5);
        comentarioTextArea.setText("Nuevo comentario.");
        jScrollPane4.setViewportView(comentarioTextArea);

        comentarioBoton.setText("Enviar Comentario");

        salirBoton.setText("Salir");
        salirBoton.setActionCommand("cerrar");
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(valorNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGap(14, 14, 14)
                        .addComponent(votarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comentarioBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(actoresLabel)
                            .addComponent(comentariosLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temporadaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(temporadaEpisodioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temporadaLabel)
                    .addComponent(temporadaEpisodioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(notaLabel)
                            .addComponent(valorNota)))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(votarBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actoresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentariosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(comentarioBoton)))
                .addGap(18, 18, 18)
                .addComponent(salirBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public void setPersonajes(ArrayList<ParNombreActor> lista){
        
    	Object[][] obj = new Object[lista.size()][4];
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
               obj,	new String [] {"Actor", "Nombre artistico",}));
    	
    	Iterator<ParNombreActor> it = lista.iterator();
    	String[][] info = new String[lista.size()][2];
    	int i = 0;
    	
    	while(it.hasNext()){
    		ParNombreActor par = it.next();
    		info[i][0] = par.getNombreActor().toString();
    		this.jTable1.setValueAt(info[i][0], i, 0);
    		info[i][1] = par.getNombreArtistico().toString();
    		this.jTable1.setValueAt(info[i][1], i, 1);
    		i++;
    	}

    }
    
    public void addListener(ActionListener al){
    	this.salirBoton.addActionListener(al);
    	this.votarBoton.addActionListener(al);
    	this.comentarioBoton.addActionListener(al);
    }
    
    public int getCalificacion(){
    	return this.jSlider1.getValue();
    }
    
    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    
    public void setNotaMedia(Double nota){
    	this.valorNota.setText(nota.toString());
    }
    
    public String getComentario(){
    	return this.comentarioTextArea.getText();
    }
    
	public void publicaComentarios(ArrayList<ComentarioEpisodio> comentarios){
		this.comentariosPane.setText("");
	        Document doc = this.comentariosPane.getDocument();
	        this.comentariosPane.removeAll();
	        for (ComentarioEpisodio s : comentarios)
	            try {
	                doc.insertString(doc.getLength(), "Autor: " + s.getNick() +
	                		"\nFecha: " + s.getFecha().toString() + "\n" + s.getTexto() + "\n\n", null);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
		
	}

                 
}
