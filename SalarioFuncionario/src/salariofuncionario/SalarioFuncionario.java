/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariofuncionario;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class SalarioFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = reading.nextLine();
        
        System.out.print("Informe o cargo: ");
        String cargo = reading.nextLine();
        
        System.out.print("Informe o salário:  ");
        double salario = reading.nextDouble();       
        
        Funcionario funcionario = new Funcionario(nome, salario, cargo);
        
        System.out.println("CALCULO IMPOSTO");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Calculo: " + funcionario.calculaImposto());
        
    }
    
}
