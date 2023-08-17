/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class ProdutoCantina {
    public static void main(String[] args) {
        Cantina produto1 =new Cantina(EnumCantina.COXINHA.getProdutoCantina());
        System.out.println(produto1);
        Cantina produto2 =new Cantina(EnumCantina.CROISSANT.getProdutoCantina());
        System.out.println(produto2);
        Cantina produto3 =new Cantina(EnumCantina.SALGADO_PERSUNTO_QUEIJO.getProdutoCantina());
        System.out.println(produto3);
        
    }
}
