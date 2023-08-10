
package aulaestruradecisao;

import java.util.Scanner;


public class atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA SUA MISTURA");
        System.out.println("DIGITE 1 PARA BIFE ACEBOLADO");
        System.out.println("DIGITE 2 PARA FILE DE FRANGO");
        System.out.println("DIGITE 3 PARA BRAJOLA");
        int prato = scanner.nextInt();
        System.out.println("INSIRA A QUNATIDADE DE PESSOAS");
        int pessoas = scanner.nextInt();
        if (prato == 1) {
            double valor = 19.99 * pessoas;
            System.out.println("O VALOR E: R$" + valor);
        }else if (prato == 2) {
            double valor = 18.99 * pessoas;
            System.out.println("O VALOR E: R$" + valor);
        }else if (prato == 3) {
            double valor = 23.99 * pessoas;
            System.out.println("O VALOR E: R$" + valor);
        }
    }
}
