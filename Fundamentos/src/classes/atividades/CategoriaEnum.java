/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    TI ("Tecnologia da informação"), ARTES("Artes"), CIENCIA_E("Ciências exastas"), ADM("Administração");
    private String categoria;

    private CategoriaEnum(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "CategoriaEnum{" + "categoria=" + categoria + '}';
    }

    public String getCategoria() {
        return categoria;
    }
    
}
