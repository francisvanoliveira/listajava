/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 9.Escreva um programa que leia um número inteiro e imprima a sequência de Fibonacci até o número informado. Utilize um loop while e estruturas condicionais.
 */
public class Fibonacci {

    /**
     * Realiza a operação de ler o valor informado pelo usuário e imprime a sequencia Fibonacci. O programa também valida se o valor informado é inteiro e positivo
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num, num1=0, num2=1, soma;        
        
        try{
            System.out.println("Digite um número inteiro: ");
            num = reading.nextInt();
            if(num < 0){
                System.out.println("Erro: você digitou um número negativo. O programa foi encerrado!");
            }else{
                while(num1 <= num){
                    System.out.print(num1 + " ");
            
                    soma = num1 + num2;
                    num1 = num2;
                    num2 = soma;
                }//end while
                System.out.println();
            }//ens if/else
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
        
    }
    
}
