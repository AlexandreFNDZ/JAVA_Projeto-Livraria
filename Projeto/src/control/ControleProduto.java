package control;

import java.sql.SQLException;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class ControleProduto {
    public boolean insereProduto(int cod_prod, String titulo, String autor, String genero, String editora, float precoUni) throws SQLException{
        Produtos prod = new Produtos(cod_prod, titulo, autor, genero, editora, precoUni);
        ProdutosDAO prodDAO = new ProdutosDAO();
        boolean inseriu = prodDAO.inserirProduto(prod);
        return inseriu;
    }
}
