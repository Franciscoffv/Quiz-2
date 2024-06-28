/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg2.semana.pkg6;

/**
 *
 * @author fran1
 */
public class claseSpotify {
   //lo que pide spotify
    public String idCancion;
    public String titulo;
    public String autor;
    public String duracion;
    public String aniodecreacion;
//este es el constructor
    public claseSpotify(String idCancion, String titulo, String autor, String duracion, String aniodecreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.aniodecreacion = aniodecreacion;
    
        //getters 
    }

    public String getIdCancion() {
        return idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getAniodecreacion() {
        return aniodecreacion;
    }
//setters
    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setAniodecreacion(String aniodecreacion) {
        this.aniodecreacion = aniodecreacion;
    }
    
     
           
    
    
}
