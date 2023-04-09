/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primosmenoresiguais;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 13.Escreva um programa que leia um número inteiro positivo e imprima todos os números primos menores ou iguais a ele. Utilize um loop while e estruturas condicionais.
 */
public class PrimosMenoresIguais {

    /**
     * Realiza a leitura do valor informado pelo usuário e imprime na tela os números primos menores que ele. O programa também valida se o valor informado é inteiro e positivo.
     */
    public static void main(String[] args) {
       Scanner reading = new Scanner(System.in);
       int n, i;
       
       try{
           System.out.print("Digite um número inteiro positivo: ");
           n = reading.nextInt();
           i = 2;
           if(n < 0){
                System.out.println("Erro: você digitou um número negativo. O programa foi encerrado!");
           }else{
                while (i <= n) {
                    boolean ehPrimo = true;
                    int j = 2;
                    while (j <= i / 2) {
                        if (i % j == 0) {
                            ehPrimo = false;
                            break;
                        }
                        j++;
                    }//end while
                    if (ehPrimo) {
                        System.out.print(i + " ");
                    }
                    i++;
                }//end while
           }//end if/else
           
       }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
       }
       
   }
}
