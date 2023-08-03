
package atividade01.classes;


public class Emprestimo {
private double valorCasa;
private double salarioPessoa;
private int prestAnos;

    public Emprestimo(double valorCasa, double salarioPessoa, int prestAnos) {
        this.valorCasa = valorCasa;
        this.salarioPessoa = salarioPessoa;
        this.prestAnos = prestAnos;
    }

    public double getValorCasa() {
        return valorCasa;
    }

    public double getSalarioPessoa() {
        return salarioPessoa;
    }

    public int getPrestAnos() {
        return prestAnos;
    }

}
