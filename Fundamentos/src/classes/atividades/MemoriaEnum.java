package classes.atividades;


public enum MemoriaEnum {
    DDR5("DDR5", 8), DDR4("DDR4", 8), DDR3("DDR3", 8);
    private String tipoMemoria;
    private int qtdeMemora;

    private MemoriaEnum(String tipoMemoria, int qtdeMemora) {
        this.tipoMemoria = tipoMemoria;
        this.qtdeMemora = qtdeMemora;
    }

    @Override
    public String toString() {
        return "MemoriaEnum{" + "tipoMemoria=" + tipoMemoria + ", qtdeMemora=" + qtdeMemora + '}';
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public int getQtdeMemora() {
        return qtdeMemora;
    }
    
    
}
