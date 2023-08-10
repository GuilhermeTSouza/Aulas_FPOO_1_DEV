
package aulaestruradecisao;

import java.util.Scanner;


public class ifelse02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA TEMPERATURA");
        int temperatura= scanner.nextInt();
        if (temperatura == 15) {
            System.out.println("esta frio");
        }else if (temperatura == 20) {
            System.out.println("esta confortavel");
        }else if (temperatura == 30) {
            System.out.println("esta calor");
            
        }
        switch (temperatura){
        case 15:
            System.out.println("frio");
            break;
        case 20:
            System.out.println("confortavel");
            break;
        case 30:
            System.out.println("calor");
            break;
        default:
                System.out.println("Nao identifiquei a temperatura");
            break;
    }
    }
    
}
