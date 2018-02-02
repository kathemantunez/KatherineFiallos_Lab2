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
        String opcion2="";
         ArrayList lista=new ArrayList();//detectives
         ArrayList lista2=new ArrayList();//casos
         
         while(!opcion.equalsIgnoreCase("e")){
            
            opcion=JOptionPane.showInputDialog("ORGANIZACIÓN SECRETA\n"
                    +"a. Agregar detectives\n"
                    + "b.Modificar detectives\n"
                    +"c.Eliminar detectives\n"
                    + "d.Log in\n"
                    + "e.salir\n"
                    + "f.imprimir\n"
                   );
            if(opcion.equals("a")){//agregar
                 String nombre=JOptionPane.showInputDialog("nombre");
                 int edad=Integer.parseInt(JOptionPane.showInputDialog("edad"));
                 String nacionalidad=JOptionPane.showInputDialog("nacionalidad");
                 int años=Integer.parseInt(JOptionPane.showInputDialog("años laborales"));
                 int nivel=Integer.parseInt(JOptionPane.showInputDialog("nivel(0-10)"));
                 Object listacasos=Integer.parseInt(JOptionPane.showInputDialog(" cantidad de lista de casos"));
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
                    Object listacasos=Integer.parseInt(JOptionPane.showInputDialog("nueva cantidad de lista de casos"));
                      ((detectives)lista.get(pos1)).setListacasos(listacasos);
                 }
                 if(pos1==6){
                    String buzon=JOptionPane.showInputDialog("nuevo buzon");
                      ((detectives)lista.get(pos1)).setBuzon(buzon);
                 }
                 if(pos1==7){
                    String usuario=JOptionPane.showInputDialog("nuevo usuario");
                      ((detectives)lista.get(pos1)).setUsuario(usuario);
                 }
                 if(pos1==8){
                    String contraseña=JOptionPane.showInputDialog("nueva contraseña");
                      ((detectives)lista.get(pos1)).setContraseña(contraseña);
                 }
             }
            }
            if(opcion.equals("c")){//Elimiar
                int pos=Integer.parseInt(JOptionPane.showInputDialog("posicion a eliminar"));
                if(pos>=0 &&pos>lista.size() && lista.get(pos)instanceof detectives){
                    lista.remove(pos);
            }
            }
            if(opcion.equals("d")){
//                String usuario=JOptionPane.showInputDialog("Ingrese usuario");
//                String contraseña=JOptionPane.showInputDialog("Ingrese contraseña");
//                     if(contraseña.equals(lista.get(7))&& usuario.equals(lista.get(8)) ){
                          opcion2=JOptionPane.showInputDialog("LOG IN"
                            + "1.listar mis datos\n"
                            + "2.listar casos \n"
                            + "3.registro de casos\n"
                            + "4.modificar casos\n"
                            + "5.enviar mensajes\n"
                            + "6.listar mensajes\n"
                            + "7.Log out");
                       if(opcion2.equals("1")){
                           for (Object t : lista) {
                             JOptionPane.showMessageDialog(null, t);
                           }
                       }
                   if(opcion2.equals("2")){
                       for (Object t : lista2) {
                             JOptionPane.showMessageDialog(null, t);
                           }
                       
                   }
                   if(opcion2.equals("3")){
                       String lugar=JOptionPane.showInputDialog("Lugar");
                       String descripcion=JOptionPane.showInputDialog("descripción");
                       String tipo=JOptionPane.showInputDialog("tipo (homicidio, robo, secuestro, violacion)");
                       String detective=JOptionPane.showInputDialog("detective a cargo");
                       String estado=JOptionPane.showInputDialog("estado (en proceso, resuelto)");
                       String cantidadevi=JOptionPane.showInputDialog("cantidad de evidencias");
                       String nombreevi=JOptionPane.showInputDialog("nombre de evidencia");
                       String descevi=JOptionPane.showInputDialog("decripcion evidencia");
                       String nivelevi=JOptionPane.showInputDialog("nivel de peligrosidad (alto,medio,bajo)");
                       lista2.add(new casos(lugar,descripcion,tipo,detective,estado,cantidadevi,nombreevi,descevi,nivelevi));
                   }
                       
            }
            
            if(opcion.equals("f")){
                    for (Object t : lista) {
                    JOptionPane.showMessageDialog(null, t);
                }
            }
                
         }
    }
}

                 
         