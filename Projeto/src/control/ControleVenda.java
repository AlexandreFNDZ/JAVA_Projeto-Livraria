/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.VendaDAO;
import model.bean.Venda;

/**
 *
 * @author Alexandre / Elzio / Elias
 */
public class ControleVenda {
     public boolean insereVenda(int idCli) throws SQLException { 
         Venda venda = new Venda(idCli);
         VendaDAO vendaSQL = new VendaDAO();
         boolean inseriu = false;
         
         try {
             inseriu = vendaSQL.inserir(venda);
         } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
         }
         
         return inseriu;
     }
     
     public Venda buscaVenda(int idCli) {
         Venda venda = new Venda();
         VendaDAO vendaSQL = new VendaDAO();
         
         try {
            venda = vendaSQL.buscar(idCli);
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
         
         return venda;
     }
}
