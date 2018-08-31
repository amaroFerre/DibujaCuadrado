/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4adaboletin3;

// Importo el paquete java.util.* para poder utilizar la clase Scanner
import java.util.*;

/**
 *
 * @author Amarico
 */
public class Ejercicio4AdaBoletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Creo el objeto entrada
        Scanner entrada = new Scanner(System.in);

        // Creo dos variables de tipo entero
        int lado1;

        // Pido por teclado el  lado
        System.out.println("Introduce el  lado");

        lado1 = entrada.nextInt();

        // Creo el bucle
        for (int i = 1; i <= lado1; i++) {

            for (int j = 1; j <= lado1; j++) {
                System.out.print("* ");
            }

            System.out.println("");

        }

    }

}
