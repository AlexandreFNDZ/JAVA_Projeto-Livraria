package control;

import java.sql.SQLException;
import model.DAO.ClienteDAO;
import model.bean.Cliente;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ControleCliente {
    
    public boolean insereCliente(int id_cliente, String nome, String cpf, String telefone_cel, String telefone, String cidade, String estado, String cep, String bairro, String rua, String numero, String email) throws SQLException, ClassNotFoundException{
        Cliente cli = new Cliente(id_cliente, nome, cpf, telefone_cel, telefone, cidade, estado, cep, bairro, rua, numero, email);
        ClienteDAO cliDAO = new ClienteDAO();
        boolean inseriu = cliDAO.inserir(cli);
        return inseriu;
    }
}
