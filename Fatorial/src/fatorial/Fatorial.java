/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num, i;
        
        try{
            System.out.print("Digite um número inteiro positivo: ");
            num = reading.nextInt();
            
            if(num < 0){
                System.out.println("Erro: você digitou um número negativo. O programa foi encerrado!");
            }else{
                BigInteger fatorial = BigInteger.ONE;
                
                for (i = 1; i <= num; i++) {
                    fatorial = fatorial.multiply(BigInteger.valueOf(i));
                }
                
                System.out.println(num + "! = " + fatorial.toString());
            }//end if/else
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
    }
    
}
