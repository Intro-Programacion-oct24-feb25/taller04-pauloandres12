/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double minutos;
        double costo;
        String direccion;
        String nombre;
        
        System.out.println("Ingrese el numero de minutos consumidos en el mes");
        minutos = entrada.nextDouble();
        System.out.println("Ingrese el costo por minutos consumidos");
        costo = entrada.nextDouble();
        System.out.println("Ingrese la direccion del domicilio");
        entrada.nextLine();
        direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre completo del dueño de la linea");
        nombre = entrada.nextLine();
        double valorTotal = (minutos * costo);
        System.out.printf("Reporte:\nNombres completos: %s\n\tDireccion: %s\n"
        +"Costo por minuto: %.2f\n\tNumero de minutos consumidos: "
        +" %.2f\n\t\tValor a cancelar: $ %.2f\n",
        nombre,
        direccion,
        costo,
        minutos,
        valorTotal);
             
    }
    
}
