/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katherinefiallos_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class KatherineFiallos_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion="";
         ArrayList lista=new ArrayList();
         while(!opcion.equalsIgnoreCase("e")){
            
            opcion=JOptionPane.showInputDialog("ORGANIZACIÓN SECRETA\n"
                    +"a. Agregar detectives\n"
                    + "b.Modificar detectives\n"
                    +"c.Eliminar detectives\n"
                    + "d.Log in\n\n"
                    + "e.salir"
                   );
            if(opcion.equals("a")){//agregar
                 String nombre=JOptionPane.showInputDialog("nombre");
                 int edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                 String nacionalidad=JOptionPane.showInputDialog("nacionalidad");
                 int años=Integer.parseInt(JOptionPane.showInputDialog("años laborales"));
                 int nivel=Integer.parseInt(JOptionPane.showInputDialog("nivel(0-10)"));
                 int listacasos=Integer.parseInt(JOptionPane.showInputDialog(" cantidad de lista de casos"));
                 String buzon=JOptionPane.showInputDialog("Buzon");
                 String usuario=JOptionPane.showInputDialog("usuario");
                 String contraseña=JOptionPane.showInputDialog("contraseña");
                 lista.add(new detectives(nombre,edad,nacionalidad,años,nivel,listacasos,buzon,usuario,contraseña) );
                
            }
            if(opcion.equals("b")){//modificar
                int pos1=Integer.parseInt(JOptionPane.showInputDialog("MODIFICAR \n"
                        + "posicion a modificar[nombre,edad,nacionalidad,años laborales,nivel,listacasos,buzon,usuario,contraseña]"));
             if(pos1>=0 && pos1<lista.size() &&lista.get(pos1) instanceof detectives){
                if(pos1==0){
                    String nombre=JOptionPane.showInputDialog("nuevo nombre");
                      ((detectives)lista.get(pos1)).setNombre(nombre);
                }
                if(pos1==1){
                    int edad=Integer.parseInt(JOptionPane.showInputDialog("nueva edad"));
                      ((detectives)lista.get(pos1)).setEdad(edad);
                }
                 if(pos1==2){
                    String nacionalidad=JOptionPane.showInputDialog("nueva nacionalidad");
                      ((detectives)lista.get(pos1)).setNacionalidad(nacionalidad);
                 }
                 if(pos1==3){
                    int años=Integer.parseInt(JOptionPane.showInputDialog("nuevos años laborales"));
                      ((detectives)lista.get(pos1)).setAños(años);
                 }
                 if(pos1==4){
                    int nivel=Integer.parseInt(JOptionPane.showInputDialog("nuevo nivel"));
                      ((detectives)lista.get(pos1)).setNivel(nivel);
                 }
                 if(pos1==5){
                    int listacasos=Integer.parseInt(JOptionPane.showInputDialog("nueva cantidad de lista de casos"));
                      ((detectives)lista.get(pos1)).setListacasos(listacasos);
                 }
                 if(pos1==6){
                    String buzon=JOptionPane.showInputDialog("nuevo buzon");
                      ((detectives)lista.get(pos1)).setBuzon(buzon);
                 }
                 if(pos1==0){
                    String usuario=JOptionPane.showInputDialog("nuevo usuario");
                      ((detectives)lista.get(pos1)).setUsuario(usuario);
                 }
                 if(pos1==0){
                    String contraseña=JOptionPane.showInputDialog("nueva contraseña");
                      ((detectives)lista.get(pos1)).setContraseña(contraseña);
                 }
             }
            }
         }
    }
}
                 
         