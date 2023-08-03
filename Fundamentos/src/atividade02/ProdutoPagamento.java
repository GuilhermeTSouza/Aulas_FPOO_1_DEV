
package atividade02;

import atividade02.classes.Produto;
import java.util.Scanner;


public class ProdutoPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira nome, forma de pagamento D para debito C para credito, valor e a quantidade: ");
        Produto prod1 = new Produto(scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());            
        double valorTotal = prod1.getValor() * prod1.getQtde();
        if (prod1.getPagamento() == "D" && valorTotal<=100) {
            double valorD100 = valorTotal *0.95;
            System.out.println("Valor final e: "+ valorD100);
        }
    
        
    }
    
}
