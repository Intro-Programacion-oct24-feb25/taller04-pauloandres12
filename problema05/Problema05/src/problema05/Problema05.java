/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
       
        System.out.println("Ingrese el valor a pagar de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Youtube");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor a pagar de Spotify");
        spotify = entrada.nextDouble();
        
        double netflixDesc = netflix - (netflix * 0.23);
        double youtubeDesc = youtube - (youtube * 0.23);
        double dropboxDesc = dropbox - (dropbox * 0.45);
        double valorTotal = netflixDesc+youtubeDesc+dropboxDesc+spotify;
        
        System.out.println("El valor de Netflix y Youtube tiene un descuento "
                + "del 25%"+"\n"+
                "El valor de Dropbox tiene un descuento del 45%"+"\n"+
                "El valor de Spotify no varia"+"\n"+
                "El valor total a pagar es:"+" "+valorTotal+"\n");
        
    
    }
    
}
