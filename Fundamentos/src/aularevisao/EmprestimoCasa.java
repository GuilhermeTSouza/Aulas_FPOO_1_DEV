
package aularevisao;

import aularevisao.classes.Emprestimo;
import java.util.Scanner;


public class EmprestimoCasa {
    public static void main(String[] args) {
        System.out.println("Insira o Valor do emprestimo, salario e n parcelas: ");
        Scanner scanner = new Scanner(System.in);
        Emprestimo emprestimo1 = new Emprestimo(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
        double valorParc = emprestimo1.getValorCasa() / emprestimo1.getPrestAnos();
        if (valorParc / emprestimo1.getSalarioPessoa() > 0.3 ) {
            System.out.println("Nao e possivel fazer o emprestimo");
        }else{
            System.out.println("Emprestimo aprovado");
        }
        
    }
}
