/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es"+" "+area);         
    }
    
}
