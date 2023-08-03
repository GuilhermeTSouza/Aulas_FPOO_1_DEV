
package atividade09;


public class Media {
    public static void main(String[] args) {
        double resultado = media (10,5,1,2,45,5);
        System.out.println("O resultado é: " + resultado);
       
    }
    public static int media(double ... valor){
        int resultado = 0;
        for (int i = 0; i < valor.length; i++) {
            double numero=valor[i];
            resultado += numero/valor.length;
        }
        return resultado;
    }
}
