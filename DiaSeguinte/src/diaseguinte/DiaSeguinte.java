/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diaseguinte;

/**
 * @author Francisvan Oliveira Pessoa
 * 31.Crie uma classe "Data" com os atributos "dia", "mes" e "ano". 
 * Escreva um método que determine qual é o dia seguinte à data atual, 
 * considerando que fevereiro pode ter 28 ou 29 dias (em anos bissextos).
 */
public class DiaSeguinte {

    /**
     * Método ira mostar a data seguinte a data atual.
     */
    public static void main(String[] args) {
        Data dataAtual = new Data();
        dataAtual.diaSeguinte();
    }
    
}
