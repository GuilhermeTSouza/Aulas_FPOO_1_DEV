
package classes;

public enum MarchaEnum {
    PRIMEIRA("Primeira marcha", 1), SEGUNDA("Segunda marcha",2), TERCEIRA("Terceira marcha",3), QUARTA("Quarta marcha",4), QUINTA("Quinta marcha",5), RE("Marcha Ré",-1), NEUTRO("Neutro",0);
    private String marcha;
    private int numeroMarcha;

    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha= numeroMarcha;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }
    
    
}
