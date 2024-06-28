/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg2.semana.pkg6;

/**
 *
 * @author fran1
 */
public class QUIZ2Semana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //  Instancia de la cancion
        claseSpotify cancionfav = new claseSpotify ("20231408", "Narcotics", "Dei V y Bryant Myers", "2:53", "2023");
        



//llamados de los getters
    System.out.println("id de la cancion: " + cancionfav.idCancion);
    System.out.println("Titulo de la cancion: " + cancionfav.titulo);
    System.out.println("Duracion de la cancion: " + cancionfav.duracion);
    System.out.println("Anio de creacion de la cancion: " + cancionfav.aniodecreacion);
    
    }
    
}
