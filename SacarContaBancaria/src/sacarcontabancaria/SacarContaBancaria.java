/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sacarcontabancaria;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class SacarContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        String titular = "Francisvan";
        double saldo = 5000;
        double limite = 1000;
        
        System.out.print("Informe o valor do saque: ");
        double valor = reading.nextDouble();
        
        ContaBancaria contabancaria = new ContaBancaria(titular, saldo, limite, valor);
        
        System.out.println("Saque: " + contabancaria.sacar());
        
    }
    
}