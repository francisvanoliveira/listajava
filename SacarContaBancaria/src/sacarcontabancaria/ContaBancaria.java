/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacarcontabancaria;

/**
 * Classe que recebe os valores do titular, saldo, limite e valor para realizar a operação de sacar o dinheiro da conta.
 */
public class ContaBancaria {
    
    private String titular;
    private double saldo;
    private double limite;
    private double valor;
    
    public ContaBancaria(String titular, double saldo, double limite, double valor) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.valor = valor;
    }
    
    public String sacar() {
        if (valor > saldo + limite) {
            return ("Saque não permitido. Valor do saque excede o limite disponível.");
            //System.out.println("Saque não permitido. Valor do saque excede o limite disponível.");
        } else if (valor > saldo) {
            return ("Saque não permitido. Valor do saque excede o saldo disponível.");
            //System.out.println("Saque não permitido. Valor do saque excede o saldo disponível.");
        } else {
            saldo -= valor;
            return ("Saque realizado com sucesso. Novo saldo: " + saldo);
            //System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        }
    }
    
    // getters e setters
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
