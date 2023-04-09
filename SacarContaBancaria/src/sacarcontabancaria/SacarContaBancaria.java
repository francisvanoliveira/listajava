/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sacarcontabancaria;

import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 12.Crie uma classe "ContaBancaria" com os atributos "titular", "saldo" e "limite". 
 * Escreva um método que permita sacar dinheiro da conta, considerando que o saldo não pode ficar negativo e que o valor do saque não pode ser maior que o saldo mais o limite.
 */
public class SacarContaBancaria {

    /**
     * Foi definido ja no programa os valores para titular, saldo e limite e mostra na tela o resultado do saque.
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