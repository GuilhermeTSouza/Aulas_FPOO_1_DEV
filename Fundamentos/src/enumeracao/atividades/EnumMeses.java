/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum EnumMeses {
    JANEIRO("Janeiro"), FEVEREIRO("Fevereiro"), MARCO("Março"), ABRIL(" Abril"), MAIO("Maio"), 
    JUNHO("Junho"), JULHO("JULHO"), AGOSTO("Agosto"), SETEMBRO("Setembro") , OUTUBRO("Outubro"), NOVEMBRO("Novembro")
    ,DEZEMBRO("Dezembro");
    private String mes;
    
    private EnumMeses (String mes){
        this.mes = mes;
    }
    public String getMes(){
        return this.mes;
    }
}
