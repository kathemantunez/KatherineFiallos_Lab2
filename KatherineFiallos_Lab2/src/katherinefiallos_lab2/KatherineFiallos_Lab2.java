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
 private static ArrayList<mensajes> bmensajes=new ArrayList();
 static String usuario1="";
 static String contraseña1="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion="";
        String opcion2="";
         ArrayList lista=new ArrayList();//detectives
         ArrayList lista2=new ArrayList();//casos
         ArrayList lista3=new ArrayList();//mensajes
         
         while(!opcion.equalsIgnoreCase("e")){
            
            opcion=JOptionPane.showInputDialog("ORGANIZACIÓN SECRETA\n"
                    +"a. Agregar detectives\n"
                    + "b.Modificar detectives\n"
                    +"c.Eliminar detectives\n"
                    + "d.Log in\n"
                    + "e.salir\n"
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
                
            int p = Integer.parseInt(
                JOptionPane.showInputDialog("Posicion de Detectice a Eliminar"));
                lista.remove(p);
            }
            
            
            //------------------------------------------------------------------------------
            if(opcion.equals("d")){
                while(!opcion.equalsIgnoreCase("f")){
                    
                
                usuario1=JOptionPane.showInputDialog("Ingrese usuario");
                 contraseña1=JOptionPane.showInputDialog("Ingrese contraseña");
////                    
                     for (int i = 0; i < lista.size(); i++) {
                     if(((detectives)lista.get(i)).getUsuario().equals(usuario1) && ((detectives)lista.get(i)).getContraseña().equals(contraseña1)){
                             
                          opcion2=JOptionPane.showInputDialog("LOG IN\n"
                            + "a.listar mis datos\n"
                            + "b.listar casos \n"
                            + "c.registro de casos\n"
                            + "d.modificar casos\n"
                            + "e.mensajes"
                            + "f.Log out");
                       if(opcion2.equals("a")){
                           String p="";
                           for (Object t : lista) {
                               if(t instanceof detectives){
                                   p+=lista.indexOf(t)+ " "+((detectives)t)+"\n";
                               }
                           }
                           JOptionPane.showMessageDialog(null, p);
//                                
                           }
                       
                   if(opcion2.equals("b")){
                      String p="";
                           for (Object t : lista) {
                               if(t instanceof casos){
                                   p+=lista.indexOf(t)+ " "+((casos)t)+"\n";
                               }
                           }
                           JOptionPane.showMessageDialog(null, p);
                       
                   }
                   if(opcion2.equals("c")){
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
                   if(opcion2.equals("d")){//modificar casos
                       int pos1=Integer.parseInt(JOptionPane.showInputDialog("MODIFICAR \n"
                        + "posicion a modificar[lugar,descripcion, tipo, detective,estado,cantidad de evidencia"
                               + ",nombre de la evidencia,descrpcion de la evidencia, nivel de evidencia]"));
                        if(pos1>=0 && pos1<lista.size() &&lista.get(pos1) instanceof casos){
                           if(pos1==0){
                               String lugar=JOptionPane.showInputDialog("nuevo lugar");
                                 ((casos)lista.get(pos1)).setLugar(lugar);
                           }
                           if(pos1==1){
                               String descripcion=JOptionPane.showInputDialog("nueva descripcion");
                                 ((casos)lista.get(pos1)).setDescripcion(descripcion);
                           }
                           if(pos1==2){
                               String tipo=JOptionPane.showInputDialog("nuevo tipo(homicidio, robo, secuestro, violacion)");
                                 ((casos)lista.get(pos1)).setTipo(tipo);
                           }
                           if(pos1==3){
                               String detective=JOptionPane.showInputDialog("nuevo detective ");
                                 ((casos)lista.get(pos1)).setDetective(detective);
                           }
                           if(pos1==4){
                               String estado=JOptionPane.showInputDialog("nuevo estado(en proceso,resuelto)");
                                 ((casos)lista.get(pos1)).setEstado(estado);
                           }
                           if(pos1==5){
                               String cantidadevi=JOptionPane.showInputDialog("nueva cantidad de evidencia");
                                 ((casos)lista.get(pos1)).setCantidadevi(cantidadevi);
                           }
                           if(pos1==6){
                               String nombreevi=JOptionPane.showInputDialog("nuevo nombre de la evidencia");
                                 ((casos)lista.get(pos1)).setNombreevi(nombreevi);
                           }
                           if(pos1==7){
                               String descevi=JOptionPane.showInputDialog("nueva descripcion de la evidencia");
                                 ((casos)lista.get(pos1)).setDescevi(descevi);
                           }
                           if(pos1==8){
                               String nivelevi=JOptionPane.showInputDialog("nuevo nivel de evidencia");
                                 ((casos)lista.get(pos1)).setNivelevi(nivelevi);
                           }
                        }
                   }
                           
                   
                    if(opcion2.equals("e")){//enviar mensajes
                        
                       mensajes=mensajeria(usuario1);
                       
                   }
                   
                    }
                }
                     break;
            
            }
         }
    }
    }
    public void mensajeria(String usuario){
        int opcion;
        String mensajes= "";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("CHAT:\n"
                    + "1) ESCRIBE MENSAJES\n"
                    + "2) MENSAJERIA\n"
                    + "0) SALIR"));
            switch(opcion) {
                case 1:
                    enviarMensaje(usuario);
                    break;
                case 2:
                    mensajes = "";
                    for (int i = 3; i > 0; i--)
                        mensajes += mostrarMensajes(usuario, i);
                    JOptionPane.showMessageDialog(null, mensajes);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida!");
                    break;
            }
        } while (opcion != 0);
    }
     public static String mostrarMensajes(String receptor, int importancia){
        String output = "";
        for (mensajes msj: bmensajes){
            if (msj.getReceptor().equals(receptor) && msj.getImportancia() == importancia){
                output += msj + "\n";
            }
        }
        return output;
    }
    
    public static void enviarMensaje(String emisor){
        ArrayList<String> usuariosAgregados = new ArrayList<>(); 
        String detective = "";
        Iterable<mensajes> baseMensaje = new ArrayList<>();
        for (mensajes usuario: baseMensaje){
            if (!emisor.equals(usuario.getUsuario()) && !usuariosAgregados.contains(usuario.getUsuario())
                    && detectives(emisor, usuario.getUsuario())) {
                usuariosAgregados.add((String) usuario.getUsuario());
                detective += usuario + "\n";
            }
        }
        String usuario = " ";
        String receptor = JOptionPane.showInputDialog("A que usuario le quiere enviar un mensaje?\n" + usuario);
        mensajes msj = new mensajes(emisor, receptor);
        msj.nuevoMensaje();
        bmensajes.add(msj);
        
    }
}//fin
                   
           

                 
         