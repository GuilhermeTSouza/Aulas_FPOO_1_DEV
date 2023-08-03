
package atividade01.classes;


public class Multa {
private double velocidade;
private double velocidadePermitida;
private double valorMultaKM;

    public Multa(double velocidade, double velocidadePermitida, double valorMultaKM) {
        this.velocidade = velocidade;
        this.velocidadePermitida = velocidadePermitida;
        this.valorMultaKM = valorMultaKM;
    }

    public double getVelocidade() {
        return velocidade;
    }

    

    public double getVelocidadePermitida() {
        return velocidadePermitida;
    }

    public double getValorMultaKM() {
        return valorMultaKM;
    }

}
