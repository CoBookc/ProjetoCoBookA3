/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.VisualizadorDeLivros;

/**
 *
 * @author Gustavo
 */
public class TabelaDAO {
  
    /* CÓDIGO DA AULA11(professor)*/
    public VisualizadorDeLivros[] obter() {
        Connection connection = new ConnectionMVC().getConnection();
        
        
        try {
            /* alterada linha 29 String sql */
            String sql = "select l.*, avg(a.nota) as nota from livro l join avaliacoes a where l.cod_livro = a.cod_livro group by a.cod_livro order by avg(a.nota) DESC,count(a.nota) DESC, l.titulo ASC";
            PreparedStatement pStatement = connection.prepareStatement(sql,
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pStatement.executeQuery();
            int total = rs.last() ? rs.getRow() : 0;
            VisualizadorDeLivros[] lista = new VisualizadorDeLivros[total] ;
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                String titulo = rs.getString("titulo");
                double nota = rs.getDouble("nota");
                VisualizadorDeLivros vl = new VisualizadorDeLivros(titulo, nota);
                lista[contador++] = vl;
            }
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
  
    }    
    
}