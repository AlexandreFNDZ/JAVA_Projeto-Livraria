package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.ClienteDAO;
import model.bean.Cliente;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ControleCliente {
    
    public boolean insereCliente(String nome, String cpf, String telefone_cel, String telefone, String cidade, String estado, String cep, String bairro, String rua, String numero, String email) throws SQLException, ClassNotFoundException{
        Cliente cli = new Cliente(nome, cpf, telefone_cel, telefone, cidade, estado, cep, bairro, rua, numero, email);
        ClienteDAO cliDAO = new ClienteDAO();
        boolean inseriu = cliDAO.inserir(cli);
        return inseriu;
    }
    
    public ArrayList<Cliente> buscarCliente() throws SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        return (cliDAO.buscarCliente());
    }
}
