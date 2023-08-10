
package aulaestruradecisao;

import java.util.Scanner;


public class atividade02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("INSIRA A AREA:");
        double area = scanner.nextDouble();
        if (area > 350) {
            double custo= area * 11.5;
            System.out.println("O custo sera de: "+ custo);
        }else if (area <= 250 ) {
            double custo = area *8.5;
            System.out.println("O custo sera de: "+ custo);            
        }else if (area <= 350 ) {
            double custo = area *9.5;
            System.out.println("O custo sera de: "+ custo);            
        }
    }
}
