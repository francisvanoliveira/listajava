/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipotriangulo;

/**
 * @author Francisvan Oliveira Pessoa
 * 22.Crie uma classe "Triangulo" com os atributos "lado1", "lado2" e "lado3". Escreva um método que determine se o triângulo é equilátero, isósceles ou escaleno.
 */
public class TipoTriangulo {

    /**
     * Ja foi definido no programa os valores dos triangulos para cada um ser equilátero, isósceles ou escaleno.
     */
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 5, 5);
        t1.determinarTipoTriangulo(); // O triângulo é equilátero.

        Triangulo t2 = new Triangulo(3, 4, 4);
        t2.determinarTipoTriangulo(); // O triângulo é isósceles.

        Triangulo t3 = new Triangulo(3, 4, 5);
        t3.determinarTipoTriangulo(); // O triângulo é escaleno.
    }
    
}
