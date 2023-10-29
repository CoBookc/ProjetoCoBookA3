/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Livro;
/**
 *
 * @author Guilherme
 */
public class LivroDAO {
        public void cadastrarLivro (Livro livro) throws ExceptionDAO {
        String sql = "Insert into livro (titulo, tipo_livro, autor, nota) values (?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, livro.getTitulo());
            pStatement.setString(2, livro.getTipoLivro());
            pStatement.setString(3, livro.getAutor());
            pStatement.setInt(4, livro.getNota());
            pStatement.execute();
            
   
        }catch (SQLException e){
            throw new ExceptionDAO ("Erro ao cadastrar Livro: " + e);
            
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            
            try {
                if (connection != null) {connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
    }
}
}
