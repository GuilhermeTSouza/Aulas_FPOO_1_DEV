
package classes.atividades;


public class Curso {
    private String nome;
    private String descricao;
    private String categoria;
    private boolean ativo;

    public Curso(String nome, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    
    public void ativarCurso(){
        this.ativo = true;
    }
    public void desativarCurso(){
        this.ativo = false;
    }
    
}
