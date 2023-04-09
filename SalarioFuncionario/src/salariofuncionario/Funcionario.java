/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salariofuncionario;

/**
 * Classe fucnionario que recebe os valores de nome, salario e cargo e realiza a opereação de calculat o imposto sobre o salarioinformado.
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public double calculaImposto() {
        if (salario <= 1500.0) {
            return salario * 0.1;
        } else {
            return salario * 0.2;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
