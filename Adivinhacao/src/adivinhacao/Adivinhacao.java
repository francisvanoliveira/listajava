/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinhacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Adivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner reading = new Scanner(System.in);
        
        int numeroAleatorio = gerador.nextInt(100) + 1;
        int tentativas = 0;
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        
        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = reading.nextInt();
            tentativas++;
            
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!");
                System.out.println("Número de tentativas: " + tentativas);
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        
    }
    
}
