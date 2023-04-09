/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetroretangulo;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class PerimetroRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        
        System.out.println("Informe a largura: ");
        double largura = reading.nextDouble();
        
        System.out.println("Informe a altura ");
        double altura = reading.nextDouble();
        
        Retangulo retangulo = new Retangulo(largura, altura);
        
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retangulo: " + retangulo.calcularPerimetro());
    }
    
}
