package classes;


public class ImprimirClasses {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Onix", "Chevrolet", CorEnum.PRETO, 2007, 4);
        Carro carro2 = new Carro("Cruze", "Chevrolet", CorEnum.VERMELHO, 2012, 4);
        
        carro1.trocarDeMarcha(MarchaEnum.PRIMEIRA);
        carro1.trocarDeMarcha(MarchaEnum.TERCEIRA);
        
        
        
        System.out.println(carro1);
        System.out.println(carro2);
        
        
        Aluno aluno1 = new Aluno("José", "jose@aluno.com", 562763, true, "DEV");
        Aluno aluno2 = new Aluno("Maria", "maria@aluno.com", 297034, true, "Informatica");
        aluno1.Intervalo();
        aluno2.Estudando();
        System.out.println(aluno1);
        System.out.println(aluno2);           
    }
}
