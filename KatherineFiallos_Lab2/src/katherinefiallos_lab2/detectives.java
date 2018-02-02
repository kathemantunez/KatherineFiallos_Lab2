/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katherinefiallos_lab2;

/**
 *
 * @author KATHERINE
 */
public class detectives {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int años;
    private int nivel;
    private Object listacasos;
    private String buzon;
    private String usuario;
    private String contraseña;
    
    public detectives(){
        
    }
    public detectives(String nombre, int edad, String nacionalidad,int años, int nivel,Object listacasos,String buzon,String usuario,String contraseña){
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
        this.años=años;
        this.nivel=nivel;
        this.listacasos=listacasos;
        this.buzon=buzon;
        this.usuario=usuario;
        this.contraseña=contraseña;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setListacasos(Object listacasos) {
        this.listacasos = listacasos;
    }

    public void setBuzon(String buzon) {
        this.buzon = buzon;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAños() {
        return años;
    }

    public int getNivel() {
        return nivel;
    }

    public int getListacasos() {
        return (int) listacasos;
    }

    public String getBuzon() {
        return buzon;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    public String toString(){
        return"\nDETECTIVES\nNombre:"+nombre+" Edad:"+edad+" Nacionalidad:"+nacionalidad+" Años Laborales:"+años +" Nivel:"+nivel+
                " Lista de casos:"+listacasos+" Buzón:"+buzon+" Usuario:"+usuario+" Contraseña:"+contraseña;
    }
    
    
    
}
