package model.DAO;

import com.mysql.jdbc.Connection;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Cliente;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ClienteDAO {
    
    Connection con = null;
    
    public boolean inserir(Cliente cli) throws SQLException, ClassNotFoundException{
        
        boolean inseriu = false;
        
        try{
            con = (Connection) new Conexao().getConnection();
            String sql = "insert into cliente (id_cliente, nome, cpf, telefone_cel, telefone, cidade, estado, cep, bairro, rua, numero, email) values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getCpf());
            stmt.setString(3, cli.getTelefone_cel());
            stmt.setString(4, cli.getTelefone());
            stmt.setString(5, cli.getCidade());
            stmt.setString(6, cli.getEstado());
            stmt.setString(7, cli.getCep());
            stmt.setString(8, cli.getBairro());
            stmt.setString(9, cli.getRua());
            stmt.setString(10, cli.getNumero());
            stmt.setString(11, cli.getEmail());
            stmt.execute();
            stmt.close();
            inseriu = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return inseriu;
    }
    
    public ArrayList<Cliente> buscarCliente() throws SQLException {
        ResultSet rs = null;
        ArrayList<Cliente> listaCli = new ArrayList<Cliente>();
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "SELECT * FROM cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId_cliente(rs.getInt("id_cliente"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setTelefone_cel(rs.getString("telefone_cel"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));
                cli.setCep(rs.getString("cep"));
                cli.setBairro(rs.getString("bairro"));
                cli.setRua(rs.getString("rua"));
                cli.setNumero(rs.getString("numero"));
                cli.setEmail(rs.getString("email"));
                
                listaCli.add(cli);
            }
            
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return listaCli;
    }
    
    public ArrayList<Cliente> buscarCliente(String coluna, String frame) throws SQLException {
        ResultSet rs = null;
        ArrayList<Cliente> listaCli = new ArrayList<Cliente>();
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "SELECT * FROM cliente where " + coluna + " = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, frame);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId_cliente(rs.getInt("id_cliente"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setTelefone_cel(rs.getString("telefone_cel"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));
                cli.setCep(rs.getString("cep"));
                cli.setBairro(rs.getString("bairro"));
                cli.setRua(rs.getString("rua"));
                cli.setNumero(rs.getString("numero"));
                cli.setEmail(rs.getString("email"));
                
                listaCli.add(cli);
            }
            
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.close();
        }
        
        return listaCli;
    }
    
    public boolean excluirCliente(Cliente cli) throws SQLException {
        
        boolean excluiu = false;
        
        try {
            con = (Connection) new Conexao().getConnection();
            String sql = "DELETE FROM cliente WHERE id_cliente = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cli.getId_cliente());
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
