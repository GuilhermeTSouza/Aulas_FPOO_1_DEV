/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum EnumRedeSocial {
    NOTICIAS("Notícias"), CONVERSA("Conversa"), ENTRETENIMENTO("Entretenimento");
    private String redeSocial;

    private EnumRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getRedeSocial() {
        return redeSocial;
    }
    
}
