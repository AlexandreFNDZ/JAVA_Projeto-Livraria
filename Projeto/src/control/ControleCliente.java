package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import model.DAO.ClienteDAO;
import model.bean.Cliente;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ControleCliente {
    
    private static ControleCliente ctrl = null;
    
    public static ControleCliente getInstancia() {
        if (ctrl == null) {
            ctrl = new ControleCliente();
        }
        
        return ctrl;
    }
    
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
    
    public ArrayList<Cliente> buscarCliente(String coluna, String frame) throws SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        return (cliDAO.buscarCliente(coluna, frame));
    }
    
    public Cliente buscarCliente(String coluna, int idCli) throws SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        ArrayList listCli = new ArrayList<>();
        Cliente resultCli = new Cliente();
        
        listCli = cliDAO.buscarCliente(coluna, String.valueOf(idCli));
        Iterator it = listCli.iterator();
        while (it.hasNext()) {
            resultCli = (Cliente) it.next();
        }
        
        return resultCli;
    }
    
    public boolean excluirCliente(int id_cliente) throws SQLException{
        Cliente cli = new Cliente();
        ClienteDAO cliDAO = new ClienteDAO();
        boolean excluiu = cliDAO.excluirCliente(id_cliente);
        return excluiu;
    }
    
    public boolean atualizarCliente(String nome, String cpf, String telefone_cel, String telefone, String cidade, String estado, String cep, String bairro, String rua, String numero, String email) throws SQLException, ClassNotFoundException{
        Cliente cli = new Cliente();
        ClienteDAO cliDAO = new ClienteDAO();
        boolean atualizou = cliDAO.atualizarCliente(nome, cpf, telefone_cel, telefone, cidade, estado, cep, bairro, rua, numero, email);
        return atualizou;
    }
}
