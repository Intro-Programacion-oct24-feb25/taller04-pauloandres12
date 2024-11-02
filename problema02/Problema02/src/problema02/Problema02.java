/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1;
        String nombre2;
        String nombre3;
        double gastos1;
        double gastos2;
        double gastos3;
        double total;
        System.out.println("Ingrese el nombre del hijo 1");
        nombre1 = entrada.nextLine();
        System.out.println("Ingrese los gastos del hijo 1");
        gastos1 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del hijo 2");
        entrada.nextLine();
        nombre2 = entrada.nextLine();
        System.out.println("Ingrese los gastos del hijo 2");
        gastos2 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del hijo 3");
        entrada.nextLine();
        nombre3 = entrada.nextLine();
        System.out.println("Ingrese los gastos del hijo 3");
        gastos3 = entrada.nextDouble();
        total = gastos1+gastos2+gastos3;
        System.out.println("Hijo 1:"+" "+nombre1+"\n"+"Hijo 2:"+" "+
                nombre2+"\n"+"Hijo 3:"+" "+nombre3+"\n"+"El gasto total es:"
                +" "+total);
       
    }
    
}
