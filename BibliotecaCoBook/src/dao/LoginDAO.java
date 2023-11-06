/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.LoginDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author 820140489
 */
public class LoginDAO {
    Connection connection;
    
    public ResultSet autenticacaoUsuario(LoginDTO objLoginDto){
       connection = new ConnectionMVC().getConnection();
       try{ 
        String sql = "select * from usuarios where email = ? and senha = ?"; 
        PreparedStatement pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, objLoginDto.getEmail());
        pStatement.setString(2, objLoginDto.getSenha());
        
        ResultSet rs = pStatement.executeQuery();
        return rs;
        
       }catch (Exception e){
       JOptionPane.showMessageDialog(null,(e.getMessage()));
       return null;
       }
       
    }
}
