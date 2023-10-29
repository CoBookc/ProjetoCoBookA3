/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Guilherme
 */
public class Livro {
    private Integer codLivro;
    private Integer nota;
    private String nomeLivro;
    private String titulo;
    private String autor;
    private Usuarios usuarios;
    private TipoLivro tipoLivro;

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

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public TipoLivro getTipoLivro() {
        return tipoLivro;
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

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public void setTipoLivro(TipoLivro tipoLivro) {
        this.tipoLivro = tipoLivro;
    }
    
    public void cadastrarLivro(Livro livro){
        
    }
}
