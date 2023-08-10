
package aulaestruradecisao;

import java.util.Scanner;


public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA SUA IDADE:");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Voce pode entrar na festa");
        } else{
            System.out.println("Voce nao pode entrar na festa");
        }
    }

}
