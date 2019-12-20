/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        int Num;

        System.out.println("Digite un número: ");
        Num = Teclado.nextInt();
        
        
        int Contador=1, Result=0;
        while(Contador<10){
        
             if((Num%Contador)==0)
                {
                  Result++;
                }
            Contador++;
        }
             
          if((Result==1)|| (Result == 2))
            {
                if(Num!=1)
                System.out.println("El numero es primo");
                else
                System.out.println("El numero no es primo");    
            }
          else
                System.out.println("El numero no es primo");
    }
    
}
