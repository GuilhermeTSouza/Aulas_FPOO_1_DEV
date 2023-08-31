package orientacaoobjetos.atividades;

public class Post implements ClassificacaoPost{
    private String titulo;
    private String legenda;
    private int qtdeComnetarios;
    private int estrelas;

    @Override
    public boolean classificarPostComum(int estrelas) {
        
        if (estrelas == ESTRELA_1) {
            System.out.println("O post é comum");
            return true;
        } else {
            System.out.println("O post não é comum");
            return false;
        }
    }

    @Override
    public boolean classificarPostBom(int estrelas) {
        if (estrelas == ESTRELA_3) {
            System.out.println("O post é legal");
            return true;
        } else {
            System.out.println("O post não é legal");
            return false;
        }
    }

    @Override
    public boolean classificarPostMuitoBom(int estrelas) {
        if (estrelas == ESTRELA_5) {
            System.out.println("O post é muito bom");
            return true;
        } else {
            System.out.println("O post não é muito bom");
            return false;
        }
    }

    public Post(String titulo, String legenda, int qtdeComnetarios, int estrelas) {
        this.titulo = titulo;
        this.legenda = legenda;
        this.qtdeComnetarios = qtdeComnetarios;
        this.estrelas = estrelas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLegenda() {
        return legenda;
    }

    public int getQtdeComnetarios() {
        return qtdeComnetarios;
    }

    public int getEstrelas() {
        return estrelas;
    }

    @Override
    public String toString() {
        return "Post{" + "titulo=" + titulo + ", legenda=" + legenda + ", qtdeComnetarios=" + qtdeComnetarios + ", estrelas=" + estrelas + '}';
    }
    
}
