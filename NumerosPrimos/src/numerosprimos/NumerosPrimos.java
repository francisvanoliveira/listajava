/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num1, num2, i;
        
        System.out.println("Digite o primeiro número: ");
        num1 = reading.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = reading.nextInt();
        
        for(i = num1; i<= num2; i++){
            if(isPrimo(i)){
                System.out.println(i + " é primo");
            }//end if
        }//end for
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
