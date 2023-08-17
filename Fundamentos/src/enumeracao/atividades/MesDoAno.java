/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class MesDoAno {
    public static void main(String[] args) {
        Mes mes1 = new Mes(EnumMeses.JANEIRO.getMes());
        System.out.println(mes1);
        Mes mes2 = new Mes(EnumMeses.FEVEREIRO.getMes());
        System.out.println(mes2);
        Mes mes3 = new Mes(EnumMeses.MARCO.getMes());
        System.out.println(mes3);
        
    }
}
