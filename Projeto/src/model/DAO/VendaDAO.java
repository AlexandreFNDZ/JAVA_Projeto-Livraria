/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.Venda;

/**
 *
 * @author aluno
 */
public class VendaDAO {
    Connection con = null;
    
    public boolean inserir(Venda venda) throws SQLException, ClassNotFoundException{
        
        boolean inseriu = false;
        
        try{
            con = (Connection) new Conexao().getConnection();
            String sql = "INSERT INTO venda (cod_venda,date_time,id_cliente) VALUES (default, now(), ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda.getIdCliente());
            stmt.execute();
            stmt.close();
            inseriu = true;
            
        } catch (MySQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Venda já cadastrada");
        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return inseriu;
    }
    
    public ArrayList<Venda> buscar() throws SQLException {
        ResultSet rs = null;
        ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "SELECT * FROM venda";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Venda vend = new Venda();
                vend.setCodVenda(rs.getInt("cod_venda"));
                vend.setDataVenda(rs.getString("date_time"));
                vend.setIdCliente(rs.getInt("id_cliente"));
                
                listaVenda.add(vend);
            }
            
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return listaVenda;
    }
    
    public Venda buscar(String coluna, int value) throws SQLException {
        ResultSet rs = null;
        Venda vendaCriada = new Venda();
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "SELECT * FROM venda WHERE " + coluna + " = " + value;
            PreparedStatement stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Venda vend = new Venda();
                vend.setCodVenda(rs.getInt("cod_venda"));
                vend.setDataVenda(rs.getString("date_time"));
                vend.setIdCliente(rs.getInt("id_cliente"));
                
                vendaCriada = vend;
            }
            
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return vendaCriada;
    }
        
    public boolean excluir(int codVenda) throws SQLException {
        boolean excluiu = false;
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "DELETE FROM venda WHERE cod_venda = " + codVenda;
            PreparedStatement stmt = con.prepareStatement(sql);
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
}
