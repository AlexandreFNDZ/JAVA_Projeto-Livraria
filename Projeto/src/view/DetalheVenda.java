/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControleCliente;
import control.ControleItemVenda;
import control.ControleProduto;
import control.ControleVenda;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.ItemVenda;
import model.bean.Produtos;
import model.bean.Venda;

/**
 *
 * @author aluno
 */
public class DetalheVenda extends javax.swing.JFrame {

    ControleVenda ctrlVenda;
    ControleItemVenda ctrlItemVenda;
    ControleProduto ctrlProd;
    ControleCliente ctrlCli;
    Venda venda;
    DefaultTableModel model;
    
    ArrayList<ItemVenda> itens;
    ArrayList<Produtos> listProd;
    Cliente cliente;
    
    //criando uma variável NumberFormat para inserir o tipo de moeda local (R$ ##,##)
    NumberFormat valor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    
    /**
     * Creates new form ConsultaVenda
     */
    public DetalheVenda() {
        initComponents();
    }
    
    public DetalheVenda(int codVenda) {
        initComponents();
        ctrlVenda = new ControleVenda();
        ctrlItemVenda = new ControleItemVenda();
        ctrlProd = ControleProduto.getInstancia();
        ctrlCli = ControleCliente.getInstancia();
        venda = ctrlVenda.buscaVenda("cod_venda", codVenda);
        itens = new ArrayList<>();
        listProd = new ArrayList<>();
        cliente = new Cliente();
        model = (DefaultTableModel) this.jTable1.getModel();
        
        try {
            itens = ctrlItemVenda.buscaItem(codVenda);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        float somaTotal = 0;
        
        Iterator it = itens.iterator();
        while (it.hasNext()) {
            ItemVenda itemVenda = new ItemVenda();
            itemVenda = (ItemVenda) it.next();
            Produtos prod = new Produtos();
            
            try {
                listProd = ctrlProd.buscarProduto("cod_produto", String.valueOf(itemVenda.getCodProd()));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            Iterator itProd = listProd.iterator();
            
            while (itProd.hasNext()) {
                prod = (Produtos) itProd.next();
            }
                      
            model.addRow(new Object[] {itemVenda.getQtd(),prod.getTitulo(),prod.getAutor(),valor.format(itemVenda.getPrecoUnit()), valor.format(itemVenda.getPrecoUnit()*itemVenda.getQtd())});
            
            somaTotal += (itemVenda.getPrecoUnit()*itemVenda.getQtd());
        }
        
        try {
            cliente = ctrlCli.buscarCliente("id_cliente", venda.getIdCliente());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        BigDecimal preco = new BigDecimal(String.valueOf(somaTotal));
        String valorFormatado = valor.format(preco);
        
        this.txtTotal.setText(valorFormatado);
        this.txtEmissao.setText(venda.getDataVenda());
        this.lblVendaId.setText("N° " + venda.getCodVenda());
        this.txtCpf.setText(cliente.getCpf());
        this.txtEndereco.setText(cliente.getRua() + ", " + cliente.getNumero() + " - " + cliente.getBairro() + " - " + cliente.getCidade() + "/" + cliente.getEstado());
        this.txtNome.setText(cliente.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmissao = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblVendaId = new javax.swing.JLabel();
        txtEmissao = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNomeLoja = new javax.swing.JLabel();
        lblTelLoja = new javax.swing.JLabel();
        lblCnpjLoja = new javax.swing.JLabel();
        lblEnderecoLoja = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblEmissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmissao.setText("Emissão:");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEndereco.setText("Endereço:");

        lblCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCpf.setText("CNPJ/CPF");

        lblVendaId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblVendaId.setText("Nº 000");

        txtEmissao.setEditable(false);
        txtEmissao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txtEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtEmissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmissao.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qtd", "Descrição", "Autor", "Valor Un", "Valor Tot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setMinWidth(90);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setMinWidth(75);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(75);
            jTable1.getColumnModel().getColumn(4).setMinWidth(75);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(75);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txtNome.setPreferredSize(new java.awt.Dimension(10, 20));

        txtEndereco.setEditable(false);
        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEndereco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txtEndereco.setPreferredSize(new java.awt.Dimension(10, 20));

        txtCpf.setEditable(false);
        txtCpf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("Valor Total da Nota: R$");

        lblNomeLoja.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomeLoja.setText("BookStore");

        lblTelLoja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelLoja.setText("TEL.: (19)1234-6588");

        lblCnpjLoja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCnpjLoja.setText("CNPJ: 11.589.324/0001-41");

        lblEnderecoLoja.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblEnderecoLoja.setText("Rua Ariovaldo da Silva Sauro, nº 123 - Jardim Manolo - CEP 13480000 - Limeira/SP");

        txtTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVendaId)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEnderecoLoja)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNomeLoja)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCnpjLoja, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTelLoja, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeLoja)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCnpjLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEnderecoLoja)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmissao)
                        .addComponent(txtEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblVendaId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblCpf)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalheVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalheVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalheVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalheVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalheVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCnpjLoja;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmissao;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEnderecoLoja;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeLoja;
    private javax.swing.JLabel lblTelLoja;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendaId;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtEmissao;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
