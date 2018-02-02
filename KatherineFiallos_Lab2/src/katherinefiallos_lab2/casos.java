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
public class casos {
String lugar;
String descripcion;
String tipo;
String detective;
String estado;
String cantidadevi;
String nombreevi;
String descevi;
String nivelevi;

    public casos() {
    }
    
    public casos(String lugar,String descripcion,String tipo,String detective,String estado,String cantidadevi,String nombreevi,String descevi,String nivelevi){
        this.lugar=lugar;
        this.descripcion=descripcion;
        this.tipo=tipo;
        this.detective=detective;
        this.estado=estado;
        this.cantidadevi=cantidadevi;
        this.nombreevi=nombreevi;
        this.descevi=descevi;
        this.nivelevi=nivelevi;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantidadevi(String cantidadevi) {
        this.cantidadevi = cantidadevi;
    }

    public void setNombreevi(String nombreevi) {
        this.nombreevi = nombreevi;
    }

    public void setDescevi(String descevi) {
        this.descevi = descevi;
    }

    public void setNivelevi(String nivelevi) {
        this.nivelevi = nivelevi;
    }

    public String getLugar(String lugar) {
        return lugar;
    }

    public String getDescripcion(String descripcion) {
        return descripcion;
    }

    public String getTipo(String tipo) {
        return tipo;
    }

    public String getDetective( String detective) {
        return detective;
    }

    public String getEstado(String estado) {
        return estado;
    }

    public String getCantidadevi(String cantidadevi) {
        return cantidadevi;
    }

    public String getNombreevi(String nombreevi) {
        return nombreevi;
    }

    public String getDescevi(String descevi) {
        return descevi;
    }

    public String getNivelevi(String nivelevi) {
        return nivelevi;
    }
//    this.lugar=lugar;
//        this.descripcion=descripcion;
//        this.tipo=tipo;
//        this.detective=detective;
//        this.estado=estado;
//        this.cantidadevi=cantidadevi;
//        this.nombreevi=nombreevi;
//        this.descevi=descevi;
//        this.nivelevi=nivelevi;
    public String toString(){
        return "CASOS\n lugar:"+lugar+" descripcion:"+descripcion+" tipo:"+tipo+" detective:"+detective+" estado:"+estado+" cantidad de evidencia"+cantidadevi+
                " nombre de la evidencia:"+cantidadevi+" descripcion de la evidencia:"+descevi+" nivel de la evidencia:"+nivelevi;
    }
}
