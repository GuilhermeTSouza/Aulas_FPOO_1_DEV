/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum EnumCantina {
    COXINHA("Coxinha"), X_SALADA("X Salada"), X_BURGUER("X Burguer"), ESFIHA("Esfiha"), SALGADO_PERSUNTO_QUEIJO("Salgado de Presunto e Queijo"), ENROLADO_SALSISHA("Enrolado de Salsisha"), CACHORRO_QUENTE("Cachorro Quente"), CROISSANT("Croissant");
    private String produtoCantina;

    private EnumCantina(String produtoCantina) {
        this.produtoCantina = produtoCantina;
    }

    public String getProdutoCantina() {
        return produtoCantina;
    }
    
}
