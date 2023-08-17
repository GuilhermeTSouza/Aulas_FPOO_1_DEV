/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum EnumLivros {
    FANTASIA("Fantasia"), FICCAO_CIENTIFICA("Ficção Cientifica"), SUSPENSE("Suspense"),ACAO_AVENTURA("Ação e Aventura"), HORROR("Horror");
    private String categoriaLivros;

    private EnumLivros(String categoriaLivros) {
        this.categoriaLivros = categoriaLivros;
    }

    public String getCategoriaLivros() {
        return categoriaLivros;
    }
    
}
