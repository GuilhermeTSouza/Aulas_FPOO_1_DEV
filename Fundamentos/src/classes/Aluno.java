
package classes;



public class Aluno {
    private String nome;
    private String email;
    private int ra;
    private boolean ativo;
    private String curso;
    private String status;
    

    public Aluno(String nome, String email, int ra , boolean ativo, String curso) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.ativo = ativo;
        this.curso = curso;
        this.status = "Descansando";
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", ativo=" + ativo + ", curso=" + curso + ", status=" + status + '}';
    }

    
    
     public void Estudando(){
         this.status = "Estudando";
     }
     public void Intervalo(){
         this.status = "Intervalo";
     }
    
}
