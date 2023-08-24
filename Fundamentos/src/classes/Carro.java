package classes;


public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int marcha;
    private int qtdeRodas;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.marcha = marcha;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", marcha=" + marcha + ", qtdeRodas=" + qtdeRodas + '}';
    }

    public void trocarDeMarcha(MarchaEnum novaMarcha){
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        }else{
            System.out.println("Voce não pode pular a marcha");
        }
        
    }
    }
    
    

