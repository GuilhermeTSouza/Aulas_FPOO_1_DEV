
package aulaestruradecisao;

import java.util.Scanner;


public class atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA OS KM RODADOS");
        int KMRodados = scanner.nextInt();
        System.out.println("INSIRA O CARRO UTILIZADO");
        System.out.println("DIGITE 1 PARA ARGO");
        System.out.println("DIGITE 2 PARA MOBI");
        System.out.println("DIGITE 3 PARA HB20");
        int carro =scanner.nextInt();
        
        if (carro == 1) {
            double preço = KMRodados * 2.39 + 98;
            System.out.println("O PREÇO A SER PAGO E: "+ preço);
        } else if (carro == 2) {
            double preço = KMRodados * 1.99 + 79;
            System.out.println("O PREÇO A SER PAGO E: "+ preço);
        } else if (carro == 3) {
            double preço = KMRodados * 2.99 + 102;
            System.out.println("O PREÇO A SER PAGO E: "+ preço);
        }
       
    }
}
