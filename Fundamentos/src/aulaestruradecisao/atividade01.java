
package aulaestruradecisao;

import java.util.Scanner;


public class atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA SUA PROFISSAO");
        System.out.println("DIGITE 1 PARA GERENTE");
        System.out.println("DIGITE 2 PARA SUPERVISOR");
        System.out.println("DIGITE 3 PARA TECNICO");
        System.out.println("DIGITE 4 PARA AUXILIAR");
        int profissao= scanner.nextInt();
        double salarioGerente = 5590;
        double salarioSupervisor= 4128;
        double salarioTecnico = 3789;
        double salarioAuxiliar = 2345;
        double inssG = 0.08 * salarioGerente;
        double inssS= 0.07 * salarioSupervisor;
        double inssT= 0.04 * salarioTecnico;
        double inssA= 0.02 * salarioAuxiliar;
        double descontoG = inssG + 289;
        double descontoS = inssS + 239;
        double descontoT = inssT + 189;
        double descontoA = inssA + 156;
        
        if (profissao == 1) {
            double salario = salarioGerente - descontoG;
            System.out.println("O SEU SALARIO E: " + salario);            
        }else if (profissao == 2) {
            double salario = salarioSupervisor - descontoS;
            System.out.println("O SEU SALARIO E: " + salario);
        }else if (profissao == 3) {
            double salario = salarioTecnico - descontoT;
            System.out.println("O SEU SALARIO E: " + salario);
        }else if (profissao == 4) {
            double salario = salarioAuxiliar - descontoA;
            System.out.println("O SEU SALARIO E: " + salario);
        }
    }

}
