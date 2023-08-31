package orientacaoobjetos.atividades;

public interface ClassificacaoPost {
    int ESTRELA_1 = 1;
    int ESTRELA_3= 3;
    int ESTRELA_5= 5;
    
    public boolean classificarPostComum(int estrelas);
    public boolean classificarPostBom(int estrelas);
    public boolean classificarPostMuitoBom(int estrelas);
    
}
