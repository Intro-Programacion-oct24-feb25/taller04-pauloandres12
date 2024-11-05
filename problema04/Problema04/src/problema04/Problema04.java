    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double valorTotal;
        
        System.out.println("Ingrese el nombre completo del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        pantalla = entrada.nextDouble();
        
        valorTotal = cpu+teclado+raton+pantalla;
        System.out.printf("Reporte:\nNombres del cliente: %s\n"
        +"Valores iniciales:\nCPU: $ %.2f\nTeclado: $ %.2f\n"
                + "Raton: $ %.2f\nPantalla: $ %.2f\n\n"
                + "Valor a cancelar: %.2f",
                nombre,
                cpu,
                teclado,
                raton,
                pantalla,
                valorTotal
                );
        
    }
    
}
