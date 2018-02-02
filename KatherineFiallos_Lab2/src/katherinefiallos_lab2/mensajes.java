/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katherinefiallos_lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class mensajes {
    private String titulo;
    private String emisor;
    private String receptor;
    private String cuerpo;
    private int importancia;
     
    public mensajes(String envia, String recibe){
        this.emisor=envia;
        this.receptor=recibe;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public int getImportancia() {
        return importancia;
    }
    public void nuevoMensaje(){
        cuerpo=JOptionPane.showInputDialog("ESCRIBA SU MESAJE:");
        importancia=Integer.parseInt(JOptionPane.showInputDialog("importancia del mensaje:"));
    }
    public String toString(){
        return "emisor:"+emisor+"  recibe"+receptor+"\n mensaje:"+cuerpo+"  Importancia:"+importancia;
    }
    
    
    
}
