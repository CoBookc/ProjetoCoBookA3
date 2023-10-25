/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuarios;


/**
 *
 * @author Gustavo
 */
public class UsuariosDAO {
    public void cadastrarUsuarios (Usuarios usuarios) throws ExceptionDAO {
        String sql = "Insert into (nome, email, cpf, idade, sexo, tipo_livro_preferido1, tipo_livro_preferido2 ) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, usuarios.getNome());
            pStatement.setString(2, usuarios.getEmail());
            pStatement.setString(3, usuarios.getCpf());
            pStatement.setInt(4, usuarios.getIdade());
            pStatement.setString(5, usuarios.getSexo());
            pStatement.setString(6, usuarios.getTipoLivroPreferido1());
            pStatement.setString(7, usuarios.getTipoLivroPreferido2());
            pStatement.execute();
            
   
        }catch (SQLException e){
            throw new ExceptionDAO ("Erro ao cadastrar Cliente: " + e);
            
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ap fechar o Statement: " + e);
            }
            
            try {
                if (connection != null) {connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
    }
}
}