
package aularevisao;

import aularevisao.classes.Energia;
import java.util.Scanner;


public class ConsumoEnergia {
    public static void main(String[] args) {
        Energia energia1 = new Energia();
        Scanner scanner = new Scanner(System.in);
        energia1.setTipoConsumo("I");
        energia1.setKW(scanner.nextDouble());
        if( energia1.getTipoConsumo()== "R" && energia1.getKW()<= 500){
            double valorFinal= 0.4 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        }else if( energia1.getTipoConsumo()== "R" && energia1.getKW() > 500){
            double valorFinal= 0.65 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        } if( energia1.getTipoConsumo()== "C" && energia1.getKW()<= 1000){
            double valorFinal= 0.55 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        }else if( energia1.getTipoConsumo()== "C" && energia1.getKW() > 1000){
            double valorFinal= 0.60 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        }
        if( energia1.getTipoConsumo()== "I" && energia1.getKW()<= 5000){
            double valorFinal= 0.55 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        }else if( energia1.getTipoConsumo()== "I" && energia1.getKW() > 5000){
            double valorFinal= 0.60 * energia1.getKW();
            System.out.println("O valor da conta e: " + valorFinal);
        }
    }
}
