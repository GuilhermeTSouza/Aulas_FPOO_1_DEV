/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) {
        Redes rede1 = new Redes(EnumRedeSocial.CONVERSA.getRedeSocial());
        System.out.println(rede1);
        Redes rede2 = new Redes(EnumRedeSocial.NOTICIAS.getRedeSocial());
        System.out.println(rede2);
        Redes rede3 = new Redes(EnumRedeSocial.ENTRETENIMENTO.getRedeSocial());
        System.out.println(rede3);
    }
}
