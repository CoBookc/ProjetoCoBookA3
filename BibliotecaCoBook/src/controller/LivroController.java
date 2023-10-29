/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.ExceptionDAO;
import model.Livro;

/**
 *
 * @author Gustavo
 */
public class LivroController {
    
    public boolean cadastrarLivro(String titulo, String tipoLivro,  String autor, Integer nota) throws ExceptionDAO{
        
        if(titulo != null && titulo.length() > 0 && tipoLivro != null && tipoLivro.length() > 0 &&  autor != null && autor.length() > 0 && nota != null && nota >= 0 || nota <= 10){
            Livro livro = new Livro(titulo, tipoLivro, autor, nota);
            livro.cadastrarLivro(livro);
            return true;
    }
        return false;
    }

 }