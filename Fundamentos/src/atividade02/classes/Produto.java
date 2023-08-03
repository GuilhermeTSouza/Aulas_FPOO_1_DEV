
package atividade02.classes;


public class Produto {
private String nome;
private double valor;
private int qtde;
private String pagamento;



    public Produto(String nome, String pagamento, double valor, int qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtde() {
        return qtde;
    }
    public String getPagamento(){
        return pagamento;
    }

    
}
