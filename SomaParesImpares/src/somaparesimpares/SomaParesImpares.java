/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somaparesimpares;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 11.Escreva um programa que leia uma sequência de números inteiros e imprima a soma dos números pares e a soma dos números ímpares. Utilize um loop for e estruturas condicionais.
 */
public class SomaParesImpares {

    /**
     * Recebe o valor informado pelo usuário e realiza a soma dos valores que são pares e os que são impares. O programa também valida se o valor informado é inteiro e positivo.
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int n, num, somaPares=0, somaImpares=0;
        
        try{
            System.out.print("Digite a quantidade de números para sequência: ");
            n = reading.nextInt();
            
            if(n < 0){
                System.out.println("Erro: você digitou um valor negativo. O programa foi encerrado!");
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
