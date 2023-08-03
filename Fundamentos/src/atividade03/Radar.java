
package atividade03;

import atividade03.classes.Multa;
import java.util.Scanner;


public class Radar {
    public static void main(String[] args) {
        System.out.println("Insira a velocidade: ");
        Scanner scanner = new Scanner(System.in);
        Multa multa1 = new Multa(scanner.nextDouble(), 80, 5);
        if (multa1.getVelocidade() <= multa1.getVelocidadePermitida() ) {
            System.out.println("Tudo ok!");
        }else if (multa1.getVelocidade() > multa1.getVelocidadePermitida() ) {
            double valorMulta = multa1.getValorMultaKM() * (multa1.getVelocidade()-multa1.getVelocidadePermitida()); 
            System.out.println("Voce foi multado em: " + valorMulta);
        }
    }
}
