
package model.DAO;

import com.mysql.jdbc.Connection;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
