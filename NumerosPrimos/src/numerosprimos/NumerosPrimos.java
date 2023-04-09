/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 8.Escreva um programa em Java que recebe dois números inteiros do usuário e imprime todos os números primos no intervalo entre eles.
 */
public class NumerosPrimos {

    /**
     * Realiza a leitura de dois valores informado pelo usuário e imprime os números primos do intervalo. O programa também valida se o valor informado é inteiro e positivo.
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num1, num2, i;
        
        try{
            System.out.println("Digite o primeiro número: ");
            num1 = reading.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = reading.nextInt();
            
            if(num1 < 1 || num2 < 1){
                System.out.println("Erro: você digitou algum valor menor que 1. O programa foi encerrado!");
            }
            if(num1 > num2){
                int aux = num2;
                num2 = num1;
                num1 = aux;
                
                for(i = num1; i<= num2; i++){
                    if(isPrimo(i)){
                        System.out.println(i + " é primo");
                    }//end if
                }//end for
            }else{
                for(i = num1; i<= num2; i++){
                    if(isPrimo(i)){
                        System.out.println(i + " é primo");
                    }//end if
                }//end for
            }//end if/else
                       
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }
        
    }
    
    public static boolean isPrimo(int num){
        if(num <= 1){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }//end if
        }//end for
        
        return true;
    }
    
}
