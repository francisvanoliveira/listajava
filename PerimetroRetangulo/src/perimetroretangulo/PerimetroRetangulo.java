/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetroretangulo;

import java.util.Scanner;

/**
 * @author Francisvan Oliveira Pessoa
 * 26.Crie uma classe "Retangulo" com os atributos "largura" e "altura". Escreva um método que calcule a área do retângulo e outro método que calcule o perímetro.
 */
public class PerimetroRetangulo {

    /**
     * Metodo onde o usuário informa a largura e altura e imprime na tela a áerea e perímetro. O programa também valida se o valor informado é positivo.
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        System.out.println("Informe a largura: ");
        double largura = reading.nextDouble();
        
        System.out.println("Informe a altura ");
        double altura = reading.nextDouble();
        
        if(largura < 0 || altura < 0){
            System.out.println("Erro: você digitou algum valor negativo. O programa foi encerrado!");
        }else{
            Retangulo retangulo = new Retangulo(largura, altura);
        
            System.out.println("Área do retangulo: " + retangulo.calcularArea());
            System.out.println("Perímetro do retangulo: " + retangulo.calcularPerimetro());
            
        }       
        
    }
    
}
