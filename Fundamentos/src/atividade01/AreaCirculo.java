
package atividade01;

import java.util.Scanner;


public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        int raio = scanner.nextInt();
        double pi = 3.14;
        double area = pi*raio*raio;            
        
        
        System.out.println("A area e: " + area);
        
    }
}
