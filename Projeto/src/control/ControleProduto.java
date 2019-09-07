package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ControleProduto {
    
    private static ControleProduto ctrl = null;
    
    public static ControleProduto getInstancia() {
        if (ctrl == null) {
            ctrl = new ControleProduto();
        }
        
        return ctrl;
    }
    
    public boolean insereProduto(String titulo, String autor, String genero, String editora, float precoUni) throws SQLException{
        Produtos prod = new Produtos(titulo, autor, genero, editora, precoUni);
        ProdutosDAO prodDAO = new ProdutosDAO();
        boolean inseriu = prodDAO.inserirProduto(prod);
        return inseriu;
    }
    
    public boolean excluiProduto(int cod_produto) throws SQLException{
        Produtos prod = new Produtos(cod_produto);
        ProdutosDAO prodDAO = new ProdutosDAO();
        boolean excluiu = prodDAO.excluirProduto(prod);
        return excluiu;
    }
    
    public ArrayList<Produtos> buscaProduto() throws SQLException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProduto());
    }
    
    public ArrayList<Produtos> buscarProdutoCod(int cod_produto) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoCod(cod_produto));
    }
    
    public ArrayList<Produtos> buscarProdutoEditora(String editora) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoEditora(editora));
    }
    
    public ArrayList<Produtos> buscarProdutoTitulo(String titulo) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoTitulo(titulo));
    }
    
    public ArrayList<Produtos> buscarProdutoAutor(String autor) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoAutor(autor));
    }
    
    public ArrayList<Produtos> buscarProdutoPreco(float preco) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoPreco(preco));
    }
    
    public ArrayList<Produtos> buscarProdutoGenero(String genero) throws SQLException, ClassNotFoundException{
        ProdutosDAO prodDAO = new ProdutosDAO();
        return (prodDAO.buscarProdutoGenero(genero));
    }
}
