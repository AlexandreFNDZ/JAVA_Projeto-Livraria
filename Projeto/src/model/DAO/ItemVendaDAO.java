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
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.ItemVenda;
import model.bean.Venda;

/**
 *
 * @author Alexandre / Elzio / Elias
 */
public class ItemVendaDAO {
    
    Connection con = null;
    
    public boolean inserir(ItemVenda item) throws SQLException, ClassNotFoundException{
        
        boolean inseriu = false;
        
        try{
            con = (Connection) new Conexao().getConnection();
            String sql = "INSERT INTO itens_venda (cod_produto,cod_venda,preco_unitario,quantidade) VALUES (?, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, item.getCodProd());
            stmt.setInt(2, item.getCodVenda());
            stmt.setFloat(3, item.getPrecoUnit());
            stmt.setInt(4, item.getQtd());
            stmt.execute();
            stmt.close();
            inseriu = true;
            
        } catch (MySQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Item já cadastrado");
        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return inseriu;
    }
    
}
