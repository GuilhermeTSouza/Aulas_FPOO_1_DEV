
package classes.atividades;


public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;
    private String statusComputador;

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.statusComputador = statusComputador;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + '}';
    }
    
    public boolean verificarProjetor(){            
        return this.temProjetor = temProjetor;
    }
    public void ligarComputador(){
        this.statusComputador = "Computadores estão ligados";
        System.out.println(statusComputador);
    }
        
}
