/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.ExceptionDAO;
import java.util.ArrayList;
import dao.UsuariosDAO;
import dao.ExceptionDAO;


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
    
    public Usuarios () {
        
    }
    
    public Usuarios(String nome, String email, String cpf, Integer idade, String sexo, String tipoLivroPreferido1, String tipoLivroPreferido2){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.tipoLivroPreferido1 = tipoLivroPreferido1;
        this.tipoLivroPreferido2 = tipoLivroPreferido2;
    }
    
    public Integer getCodUsuarios() {
        return codUsuarios;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoLivroPreferido1() {
        return tipoLivroPreferido1;
    }

    public String getTipoLivroPreferido2() {
        return tipoLivroPreferido2;
    }
    public void setCodUsuarios(Integer codUsuarios){
        this.codUsuarios = codUsuarios;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoLivroPreferido1(String tipoLivroPreferido1) {
        this.tipoLivroPreferido1 = tipoLivroPreferido1;
    }

    public void setTipoLivroPreferido2(String tipoLivroPreferido2) {
        this.tipoLivroPreferido2 = tipoLivroPreferido2;
    }
    public void cadastrarUsuarios(Usuarios usuarios) throws ExceptionDAO {
        new UsuariosDAO().cadastrarUsuarios(usuarios);
    }
}
