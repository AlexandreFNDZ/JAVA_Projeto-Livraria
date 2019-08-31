package model.dao;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Produtos;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ProdutosDAO {
    
    Connection con = null;
    
    public boolean inserirProduto(Produtos prod) throws SQLException {
        
        boolean inseriu = false;
        
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO produto (cod_produto, titulo, autor, genero, editora, precoUni) values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, prod.getCod_prod());
            stmt.setString(2, prod.getTitulo());
            stmt.setString(3, prod.getAutor());
            stmt.setString(4, prod.getGenero());
            stmt.setString(5, prod.getEditora());
            stmt.setFloat(6,prod.getPrecoUni());
            stmt.execute();
            stmt.close();
            inseriu = true;
        } catch (MySQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Produto já Cadastrado!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return inseriu;
    }
    
    public boolean excluirProduto(Produtos prod) throws SQLException {
        
        boolean excluiu = false;
        
        try {
            con = new Conexao().getConnection();
            String sql = "DELETE FROM produto WHERE cod_produto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, prod.getCod_prod());
            stmt.execute();
            stmt.close();
            excluiu = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return excluiu;
    }
    
    public ArrayList<Produtos> buscarProduto() throws SQLException {
        ResultSet rs = null;
        ArrayList<Produtos> listaProd = new ArrayList<Produtos>();
        
        try {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Produtos prod = new Produtos();
                prod.setCod_prod(rs.getInt("cod_produto"));
                prod.setTitulo(rs.getString("titulo"));
                prod.setAutor(rs.getString("autor"));
                prod.setGenero(rs.getString("genero"));
                prod.setEditora(rs.getString("editora"));
                prod.setPrecoUni(rs.getFloat("precoUni"));
       
                listaProd.add(prod);
            }
            
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return listaProd;
    }
    
    public boolean atualizarProduto(Produtos prod) throws SQLException {
        
        boolean atualizou = false;
        
        try {
            con = new Conexao().getConnection();
            String sql = "UPDATE produto SET titulo = ?,autor = ?,genero = ?, editora = ?, precoUni = ? WHERE cod_produto = " + prod.getCod_prod();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prod.getTitulo());
            stmt.setString(2, prod.getAutor());
            stmt.setString(3, prod.getGenero());
            stmt.setString(4, prod.getEditora());
            stmt.setFloat(5,prod.getPrecoUni());
            stmt.execute();
            stmt.close();
            atualizou = true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return atualizou;
    }
}
