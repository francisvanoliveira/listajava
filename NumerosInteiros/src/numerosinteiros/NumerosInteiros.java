/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosinteiros;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class NumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        int num, qtdPositivos = 0, qtdNegativos = 0, qtdZeros = 0;
        
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
        
        //sc.close();
        
    }
}
    
