/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Usuarios; 


/**
 *
 * @author 819220488
 */
public class UsuariosController {
    
        public boolean cadastrarUsuarios(String nome, String email, String cpf, Integer idade, String sexo, String tipoLivroPreferido1, String tipoLivroPreferido2){
            if(nome != null && nome.length() > 0   && email != null && email.length()>0  && cpf != null && cpf.length() > 0 && validarCPF(cpf) && idade != null && idade > 0 && sexo != null && sexo.length() > 0 && tipoLivroPreferido1 != null && tipoLivroPreferido1.length() > 0 && tipoLivroPreferido2 != null && tipoLivroPreferido2.length() > 0){
                Usuarios usuarios = new Usuarios(nome, email, cpf, idade, sexo, tipoLivroPreferido1, tipoLivroPreferido2 );
                usuarios.cadastrarUsuarios(usuarios);
                return true;
                
                
            }
            return false;
        }
      public boolean validarCPF(String cpf){
            for(int i=0; i < cpf.length(); i++){
                if(!Character.isDigit(cpf.charAt(i))){
                    if(!( i == 3 || i == 7 || i == 11 )){
                    return false;   
                    }   
                }
            }
            return true; 
        }
          //Ola mundo  
}
