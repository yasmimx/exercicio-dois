/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercico2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
      
      double num, soma = 0;
      int cont = 0;
      
      do{
          System.out.println("Digite um número: ");
          num = entrada.nextDouble();
          
          if(num >= 0){
             soma += num;
             cont++;
          }
      
      } while(num >= 0);{
        
        System.out.println("A média dos números digitados é: " + soma / cont);
    }
    
   }
}
