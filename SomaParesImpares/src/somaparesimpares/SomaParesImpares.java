/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somaparesimpares;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class SomaParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int n, num, somaPares=0, somaImpares=0;
        
        try{
            System.out.print("Digite a quantidade de números para sequência: ");
            n = reading.nextInt();
            
            if(n < 1){
                System.out.println("Erro: você digitou um valor menor que 1. O programa foi encerrado!");
            }else{
                
                for (int i = 0; i < n; i++) {
                    try{
                        System.out.print("Digite um número inteiro: ");
                        num = reading.nextInt();
            
                        if (num % 2 == 0) {
                            somaPares += num;
                        } else {
                            somaImpares += num;
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
                        break;
                    }
                }//fim for
        
                System.out.println("Soma dos números pares: " + somaPares);
                System.out.println("Soma dos números ímpares: " + somaImpares);
            }//end if/else
            
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
    }
    
}
