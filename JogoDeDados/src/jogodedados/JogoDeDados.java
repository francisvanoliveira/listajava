/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodedados;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GR7 SITES
 */
public class JogoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Random rand = new Random();
        int numPlayers;
        int numRound;
        
        System.out.println("Quantos irão jogar? ");
        numPlayers = reading.nextInt();
        
        System.out.println("Quantas rodadas serão jogadas? ");
        numRound = reading.nextInt();
        
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
        
        reading.close();
        
    }
    
}
