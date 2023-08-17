/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class CategoriaLivros {
    public static void main(String[] args) {
        Livros livro1 = new Livros(EnumLivros.ACAO_AVENTURA.getCategoriaLivros());
        System.out.println(livro1);
        Livros livro2 = new Livros(EnumLivros.FICCAO_CIENTIFICA.getCategoriaLivros());
        System.out.println(livro2);
        Livros livro3 = new Livros(EnumLivros.FANTASIA.getCategoriaLivros());
        System.out.println(livro3);
    }
}
