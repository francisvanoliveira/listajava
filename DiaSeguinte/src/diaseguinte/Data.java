/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diaseguinte;
import java.time.LocalDate;
/**
 *
 * @author franc
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        LocalDate hoje = LocalDate.now();
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }
    
    public void diaSeguinte() {
        int ultimoDiaDoMes = LocalDate.of(ano, mes, 1).lengthOfMonth();
        
        if (dia == ultimoDiaDoMes) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                ano++;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
        
        System.out.printf("O dia seguinte é: %02d/%02d/%04d\n", dia, mes, ano);
    }
}
