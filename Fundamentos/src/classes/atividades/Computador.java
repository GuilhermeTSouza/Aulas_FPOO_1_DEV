package classes.atividades;


public class Computador {
    private String tipoMemoria;
    private int qtdeMemoria;
    private ProcessadorEnum processador;
    private int capacidadeDisco;
    private String so;
    private String status;

    public Computador(String tipoMemoria,int qtdeMemoria, ProcessadorEnum processador, int capacidadeDisco, String so) {
        this.tipoMemoria = tipoMemoria;
        this.qtdeMemoria = qtdeMemoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        this.so = so;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Computador{" + "tipoMemoria=" + tipoMemoria + ", processador=" + processador + ", capacidadeDisco=" + capacidadeDisco + ", so=" + so + ", status=" + status + '}';
    }

    
    public void verSistemaOperacional(){
        System.out.println(so);
    }
    public void ligarPc(){
        this.status = "Ligando o PC";
        System.out.println(status);
    }
    
    
}
