/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodedados;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisvan Oliveira
 * 4.Escreva um programa em Java que simula um jogo de dados. O programa deve solicitar ao usuário quantos jogadores vão jogar e quantas rodadas serão jogadas. 
 * Em cada rodada, o programa deve gerar um número aleatório para cada jogador e imprimir o jogador vencedor.
 */
public class JogoDeDados {

    /**
     * Realiza a leitura do números de jogadores e a quanditade de rodadas, ambas informada pelo usuário. O programa também valida se o valor informado é inteiro e positivo
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Random rand = new Random();
        int numPlayers;
        int numRound;
        
        try{
            System.out.println("Quantos irão jogar? ");
            numPlayers = reading.nextInt();

            System.out.println("Quantas rodadas serão jogadas? ");
            numRound = reading.nextInt();
            
            if(numPlayers < 1 || numRound < 1){
                System.out.println("Erro: você digitou algum valor menor que 1. O programa foi encerrado!");
            }else{
                for(int round = 1; round <= numRound; round++){
                    System.out.println("Rodada " + round);
                    int bigPoint = 0;
                    int playerWin = 0;

                    for(int player = 1; player <= numPlayers; player++){
                        int point = rand.nextInt(6) + 1;
                        System.out.println("Jogador " + player + " jogou o dado e obteve " + point);

                        if(point > bigPoint){
                            bigPoint = point;
                            playerWin = player;
                        }//end if
                    }//end for

                    System.out.println("O jogador " + playerWin + " venceu a rodada!");
                    System.out.println();

                }//end for
                
            }
            
        }catch(InputMismatchException e){
            System.out.println("Erro: você não digitou um número inteiro. O programa foi encerrado!");
        }       
        
    }
    
}
