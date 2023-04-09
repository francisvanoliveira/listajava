/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroperfeito;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class NumeroPerfeito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num, i, div=0;
        
        try{
            System.out.print("Digite um número inteiro positivo: ");
            num = reading.nextInt();
            if(num < 0){
                System.out.println("Erro: você digitou um número negativo. O programa foi encerrado!");
            }else{
                for(i = 1; i < num; i++) {
                    if (num % i == 0) {
                        div += i;
                    }
                }

                if(div == num){
                    System.out.println(num + " é um número perfeito.");
                }else{
                    System.out.println(num + " não é um número perfeito.");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
               
    }
    
}
