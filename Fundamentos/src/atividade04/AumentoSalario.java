
package atividade04;

import atividade04.classes.Salario;
import java.util.Scanner;


public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu salario: ");
        Salario salario1 = new Salario(scanner.nextDouble());
        if( salario1.getSalario() <= 1350 ){
            double novoSalario = salario1.getSalario() * 1.5;
            System.out.println("Seu novo salario e: " + novoSalario);
        }else if( salario1.getSalario() > 1350){
            double novoSalario = salario1.getSalario() *1.1;
            System.out.println("Seu novo salario e: " + novoSalario);
        }
    }
}
