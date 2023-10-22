/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Usuarios {
    private Integer codUsuarios;
    private Integer idade;
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String tipoLivroPreferido1;
    private String tipoLivroPreferido2;
    private ArrayList<Cargos> cargos = new ArrayList<Cargos>();
    private ArrayList<Telefone> telefones = new ArrayList<Telefone>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
}
