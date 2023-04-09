/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosmarandache;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 69.Escreva um programa que leia um número inteiro e determine se ele é um número de Smarandache. 
 * Um número de Smarandache é um número inteiro positivo que é divisível pela quantidade de seus divisores.
 */
public class NumeroSmarandache {

    /**
     * Realiza a leitura do valor informado pelo usuário e verifica se o valor inteiro é divisível pela quantidade de seus divisores.
     * O programa também valida se o valor informado é inteiro e positivo.
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num, div=0, i;
        
        try{
            System.out.print("Digite um número inteiro positivo: ");
            num = reading.nextInt();
            
            if(num < 0){
                System.out.println("Erro: você digitou um número negativo. O programa foi encerrado!");
            }else{
                for(i = 1; i <= num; i++){
                    if(num % i == 0){
                        div++;
                    }//end if
                }//end for

                if(num % div == 0){
                    System.out.println(num + " é um número de Smarandache.");
                }else{
                    System.out.println(num + " não é um número de Smarandache.");
                }
            }//end if/else
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
        
    }
    
}
