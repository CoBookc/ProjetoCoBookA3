/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.ExceptionDAO;
import dao.LivroDAO;

/**
 *
 * @author Guilherme
 */
public class Livro {
    private Integer codLivro;

    private String nomeLivro;
    private String titulo;
    private String autor;
    private Integer nota;
    
     public Livro () {
        
    }
    public Livro(String nomeLivro, String titulo, String autor, Integer nota){

        this.nomeLivro = nomeLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.nota = nota;
    }
    
    public Integer getCodLivro() {
    return codLivro;
    }

    public Integer getNota() {
        return nota;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public void setCodLivro(Integer codLivro) {
        this.codLivro = codLivro;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public void cadastrarLivro(Livro livro) throws ExceptionDAO{
      new LivroDAO().cadastrarLivro(livro);
      
    }
}
