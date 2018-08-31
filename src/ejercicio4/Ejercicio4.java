/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.*;

/**
 *
 * @author SYSTEM
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        
        int numero1;
        
        int numero2;
        
        int numeroMenor;
        
        int numeroMayor = 0;
        
        int media ;
        
       
        
       do {
           System.out.println("Introduce un número positivo: ");
        
        numero1 = entrada.nextInt();
        
        System.out.println("Introduce un segundo número positivo: ");
        
        numero2 = entrada.nextInt();
        
        media = (numero1 / numero2);
           
           
           if (numero1 == numero2){
            
        
           System.out.println("Los números son iguales, introduce dos números distintos");
           }
           
           if (numero1 > numero2){
               
               numeroMayor = numero1;
           }else
               numeroMenor = numero2;
         
           
           
           
           
       } while (numero1 == numero2);
    }
    
}
