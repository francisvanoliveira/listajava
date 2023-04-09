/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosinteiros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 27.Escreva um programa que leia uma sequência de números inteiros e imprima o número de números positivos, negativos e zeros. Utilize um loop while e estruturas condicionais.
 */
public class NumerosInteiros {

    /**
     * Realiza a leitura do número informado pelo usuário e contabiliza, positivos, negativos e zero. O programa também valida se o valor informado é inteiro.
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        int num, qtdPositivos = 0, qtdNegativos = 0, qtdZeros = 0;
        
        try{
            System.out.print("Digite um número inteiro (ou 0 para encerrar): ");
            num = reading.nextInt();

            while (num != 0) {
                if (num > 0) {
                    qtdPositivos++;
                } else if (num < 0) {
                    qtdNegativos++;
                } else {
                    qtdZeros++;
                }

                System.out.print("Digite outro número inteiro (ou 0 para encerrar): ");
                num = reading.nextInt();
            }

            System.out.println("Quantidade de números positivos: " + qtdPositivos);
            System.out.println("Quantidade de números negativos: " + qtdNegativos);
            System.out.println("Quantidade de zeros: " + qtdZeros);
            
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }   
    }
}
    
