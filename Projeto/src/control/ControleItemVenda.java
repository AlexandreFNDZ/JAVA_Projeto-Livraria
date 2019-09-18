/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import model.DAO.ItemVendaDAO;
import model.bean.ItemVenda;
import model.bean.Venda;

/**
 *
 * @author Alexandre / Elzio / Elias
 */
public class ControleItemVenda {
    
    public boolean inserirItemVenda(ArrayList<ItemVenda> listItem) {
        ItemVenda item = new ItemVenda();
        ItemVendaDAO vendaSQL = new ItemVendaDAO();
        boolean inseriu = false;
        
        Iterator it = listItem.iterator();
        
        while (it.hasNext()) {
            item = (ItemVenda) it.next();
            try {
                inseriu = vendaSQL.inserir(item);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
         
        return inseriu;
    }
    
    public ArrayList<ItemVenda> buscaItem(int codVenda) throws SQLException, ClassNotFoundException {
        ArrayList<ItemVenda> itens = new ArrayList<>();
        ItemVendaDAO itemSQL = new ItemVendaDAO();
        
        return itemSQL.buscarItens(codVenda);
    }
}
