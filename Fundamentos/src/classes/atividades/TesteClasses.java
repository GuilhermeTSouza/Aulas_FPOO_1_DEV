package classes.atividades;


public class TesteClasses {
    public static void main(String[] args) {
        Sala sala1 = new Sala(5, 5, 1, true, 5);
        Sala sala2 = new Sala(16,4 , 2, false, 16);
        sala1.verificarProjetor();
        
        sala1.ligarComputador();
        sala2.verificarProjetor();
        
        System.out.println(sala1);
        System.out.println(sala2);
        
        Computador computador1= new Computador(MemoriaEnum.DDR4.getTipoMemoria(), MemoriaEnum.DDR4.getQtdeMemora(), ProcessadorEnum.RYZEN9, 1000, "Windows 10");
        Computador computador2= new Computador(MemoriaEnum.DDR3.getTipoMemoria(), MemoriaEnum.DDR3.getQtdeMemora(), ProcessadorEnum.INTEL9, 1000, "Linux");
        computador1.ligarPc();
        computador2.verSistemaOperacional();
        System.out.println(computador1);
        System.out.println(computador2);
        
        Curso curso1= new Curso("DEV", "É um curso focado no desinvolvimento de sistemas para industrias e fabricas", CategoriaEnum.TI.getCategoria());
        Curso curso2 = new Curso("ADM", "Administração é um curso para ajudar a administrar empresas e projetos", CategoriaEnum.ADM.getCategoria());
        curso1.ativarCurso();
        curso2.desativarCurso();
        System.out.println(curso1);
        System.out.println(curso2);
        
    }
    
}
