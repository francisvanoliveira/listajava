/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariofuncionario;

import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 10.Crie uma classe "Funcionario" com os atributos "nome", "salario" e "cargo". Escreva um método que determine o imposto de renda a ser pago pelo funcionário, considerando que a alíquota é de 10% para salários até R$ 1.500,00 e de 20% para salários acima disso.
 */
public class SalarioFuncionario {

    /**
     * Recebe os valores informado pelo usuário (nome, cargo e salário) e imprime na tela o resultado do imposto. O progama verifica se o salário é nagativo
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = reading.nextLine();
        
        System.out.print("Informe o cargo: ");
        String cargo = reading.nextLine();
        
        System.out.print("Informe o salário:  ");
        double salario = reading.nextDouble();  
        
        if(salario < 0){
            System.out.println("Erro: você digitou um valor negativo. O programa foi encerrado!");
        }else{
            Funcionario funcionario = new Funcionario(nome, salario, cargo);
        
            System.out.println("CALCULO IMPOSTO");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Calculo: " + funcionario.calculaImposto());
            
        }
        
    }
    
}
