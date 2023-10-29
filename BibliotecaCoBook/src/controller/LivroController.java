/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Livro;

/**
 *
 * @author Gustavo
 */
public class LivroController {
    public boolean cadastrarLivro(Integer codLivro, Integer nota, String nomeLivro, String titulo, String autor){
        
        if(codLivro != null && codLivro > 0 &&  nomeLivro != null && titulo.length() > 0 && titulo != null && titulo.length() > 0 && autor != null && autor.length() > 0){
            Livro livro = new Livro(codLivro, nota, nomeLivro, titulo, autor);
            
    }
        return false;
}
     public boolean validarNota(String nota){
          int notaTeste = Integer.parseInt(nota);
         
        if( notaTeste >= 0  ||  notaTeste <= 10){
            return false;   
        }
            return true;
            }
}