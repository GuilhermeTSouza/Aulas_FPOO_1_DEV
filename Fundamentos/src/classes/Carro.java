package classes;


public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int qtdeRodas;

    public Carro(String modelo, String marca, String cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + '}';
    }
    
}
