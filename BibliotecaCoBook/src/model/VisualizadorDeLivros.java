/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gustavo
 */

/* CÓDIGO DA AULA11(professor)*/
public class VisualizadorDeLivros {
    
    private String titulo;
    private Double nota;

    public String getTitulo() {
        return titulo;
    }

    public Double getNota() {
        return nota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public VisualizadorDeLivros(String titulo, Double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }
    
    
}
