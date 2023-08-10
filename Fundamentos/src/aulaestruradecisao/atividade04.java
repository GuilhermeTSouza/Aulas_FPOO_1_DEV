
package aulaestruradecisao;

import java.util.Scanner;


public class atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA O PRODUTO");
        System.out.println("DIGITE 1 PARA NOTEBOOK");
        System.out.println("DIGITE 2 PARA CELULAR MOTO G 22");
        System.out.println("DIGITE 3 PARA HB20");
        System.out.println("DIGITE 4 PARA APARTAMENTO");
        int produto = scanner.nextInt();
        
        double preçoNotebook = 3299;
        double preçoCelMG22= 1789;
        double preçoHB20 = 68000;
        double preçoApartamento= 180000;
        
        double parcelaN = preçoNotebook * 0.05;
        double parcelaC = preçoCelMG22 * 0.1;
        double parcelaH = preçoHB20 * 0.02;
        double parcelaA = preçoApartamento * 0.01;
        
        if (produto == 1) {
            double mes = preçoNotebook / parcelaN;
            System.out.println("A QUANTIDADE DE MESES SAO: " + mes);
        } else if (produto == 2) {
            double mes = preçoCelMG22 / parcelaC;
            System.out.println("A QUANTIDADE DE MESES SAO: " + mes);
        } else if (produto == 3) {
            double mes = preçoHB20 / parcelaH;
            System.out.println("A QUANTIDADE DE MESES SAO: " + mes);
        } else if (produto == 4) {
            double mes = preçoApartamento/ parcelaA;
            System.out.println("A QUANTIDADE DE MESES SAO: " + mes);
        }
        
    }
}
