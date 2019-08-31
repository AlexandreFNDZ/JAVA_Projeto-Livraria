

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
 * @author Elias / Elzio
 */
public class ProdutosDAO {
    
    Connection con = null;
    
    public boolean inserirProduto(Produtos prod) throws SQLException {
        
        boolean inseriu = false;
        
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO produto (cod_produto, nome_produto, descricao, unidade, preco) values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, prod.getCod_prod());
            stmt.setString(2, prod.getNome_prod());
            stmt.setString(3, prod.getDescrição());
            stmt.setString(4, prod.getUnidade());
            stmt.setFloat(5,prod.getPrecoUni());
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
                prod.setNome_prod(rs.getString("nome_produto"));
                prod.setDescrição(rs.getString("descricao"));
                prod.setUnidade(rs.getString("unidade"));
                prod.setPrecoUni(rs.getFloat("preco"));
       
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
            String sql = "UPDATE produto SET nome_produto = ?,descricao = ?,unidade = ?,preco = ? WHERE cod_produto = " + prod.getCod_prod();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prod.getNome_prod());
            stmt.setString(2, prod.getDescrição());
            stmt.setString(3, prod.getUnidade());
            stmt.setFloat(4,prod.getPrecoUni());
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
