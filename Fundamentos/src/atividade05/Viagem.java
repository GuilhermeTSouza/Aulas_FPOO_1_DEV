
package atividade05;

import atividade05.classes.Passagem;
import java.util.Scanner;


public class Viagem {
    public static void main(String[] args) {
        System.out.println("Insira o Km: ");
        Scanner scanner = new Scanner(System.in);
        Passagem passagem1 = new Passagem(scanner.nextDouble());
        if (passagem1.getKM() <= 200){
            double valor = passagem1.getKM() * 0.5;
            System.out.println("O valor da viagem sera: "+valor);
        }else if (passagem1.getKM() > 200){
            double valor = passagem1.getKM() * 0.45;
            System.out.println("O valor da viagem sera: "+valor);
        }
    }
}
