/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipotriangulo;

/**
 *
 * @author franc
 */
public class TipoTriangulo {

    /**
     * @param args the command line arguments
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
