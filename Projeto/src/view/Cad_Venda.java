/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import control.ControleCliente;
import control.ControleProduto;
import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.ItemVenda;
import model.bean.Produtos;
import model.bean.Venda;

/**
 *
 * @author Alexandre / Elzio / Elias
 */
public class Cad_Venda extends javax.swing.JFrame {

    ControleCliente ctrlCli;
    ControleProduto ctrlProd;
    ArrayList<Produtos> listProd;
    ArrayList<Cliente> listCli;
    
    float preco = (float) 0.0;
    
    Cliente cliSelecionado;
    Venda venda;
    ItemVenda item;
    
    DefaultTableModel model;
    /** Creates new form Cad_Venda */
    public Cad_Venda() {
        initComponents();
        ctrlCli = ControleCliente.getInstancia();
        ctrlProd = ControleProduto.getInstancia();
        model = (DefaultTableModel) this.jTable1.getModel();
        
        try {
            listCli = ctrlCli.buscarCliente();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar lista de Clientes. Reinicie a janela!");
        }
        
        Iterator itCli = listCli.iterator();
        while (itCli.hasNext()) {
            if (this.cmbCliente.getComponentCount() == 0) {
                this.cmbCliente.addItem("Todos");
            }
            
            Cliente cli = (Cliente) itCli.next();
            this.cmbCliente.addItem(cli.getNome());
        }
        
        try {
            listProd = ctrlProd.buscarProduto();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao carregar lista de Produtos. Reinicie a janela!");
        }

        Iterator itProd = listProd.iterator();
        while (itProd.hasNext()) {
            if (this.cmbProduto.getComponentCount() == 0) {
                this.cmbProduto.addItem("Todos");
                System.out.println("1");
            }

            Produtos prod = (Produtos) itProd.next();
            this.cmbProduto.addItem(prod.getTitulo());
        }
        
        this.btnInserirCliente.setEnabled(false);
        this.cmbProduto.setEnabled(false);
        this.btnInserirProd.setEnabled(false);
        this.txtQtdProd.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbProduto = new javax.swing.JComboBox<>();
        lblProduto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCpfCli = new javax.swing.JLabel();
        lblNomeCli = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        txtCpfCli = new javax.swing.JTextField();
        lblCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        lblGeneroProd = new javax.swing.JLabel();
        txtGeneroProd = new javax.swing.JTextField();
        lblTituloProd = new javax.swing.JLabel();
        txtTituloProd = new javax.swing.JTextField();
        lblPrecoProd = new javax.swing.JLabel();
        lblQtdProd = new javax.swing.JLabel();
        txtQtdProd = new javax.swing.JTextField();
        btnInserirProd = new javax.swing.JButton();
        btnInserirCliente = new javax.swing.JButton();
        txtPrecoProd = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        lblTituloVenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProdutoItemStateChanged(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProduto.setText("Produto");

        lblCpfCli.setText("CPF / CNPJ:");

        lblNomeCli.setText("Nome:");

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cmbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClienteItemStateChanged(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCliente.setText("Cliente");

        txtNomeCli.setEditable(false);
        txtNomeCli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtCpfCli.setEditable(false);
        txtCpfCli.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblCodProd.setText("Cód.:");

        txtCodProd.setEditable(false);
        txtCodProd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblGeneroProd.setText("Genero:");

        txtGeneroProd.setEditable(false);
        txtGeneroProd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblTituloProd.setText("Título:");

        txtTituloProd.setEditable(false);
        txtTituloProd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblPrecoProd.setText("Preço Unit.:");

        lblQtdProd.setText("Qtd.:");

        btnInserirProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInserirProd.setText("Inserir Produto");
        btnInserirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdActionPerformed(evt);
            }
        });

        btnInserirCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInserirCliente.setText("Inserir Cliente");
        btnInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirClienteActionPerformed(evt);
            }
        });

        txtPrecoProd.setEditable(false);
        txtPrecoProd.setBorder(null);
        txtPrecoProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtPrecoProd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecoProd.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(17, 17, 17)
                        .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCpfCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfCli))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCli))
                    .addComponent(btnInserirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGeneroProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTituloProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecoProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblQtdProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdProd)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCli)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCli)
                    .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInserirCliente)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProd)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneroProd)
                    .addComponent(txtGeneroProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloProd)
                    .addComponent(txtTituloProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoProd)
                    .addComponent(lblQtdProd)
                    .addComponent(txtQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserirProd)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloVenda.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblTituloVenda.setText("Tabela de Vendas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Título", "Qtd", "Preco Unit", "Preco Tot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(4).setMinWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");

        btnFinalizar.setBackground(new java.awt.Color(0, 204, 0));
        btnFinalizar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnFinalizar.setText("Finalizar");

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Selecione o Item para excluir");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Clique em finalizar para gerar a Nota de Venda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClienteItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            Cliente cliSelecionado = new Cliente();

            if (this.cmbCliente.getSelectedIndex() != 0) {
                cliSelecionado = listCli.get(this.cmbCliente.getSelectedIndex()-1);

                this.txtNomeCli.setText(cliSelecionado.getNome());
                this.txtCpfCli.setText(cliSelecionado.getCpf());
            } else {
                this.txtNomeCli.setText("");
                this.txtCpfCli.setText("");
            }

            this.btnInserirCliente.setEnabled(true);
        }     
    }//GEN-LAST:event_cmbClienteItemStateChanged

    private void cmbProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProdutoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            Produtos prodSelecionado = new Produtos();

            if (this.cmbProduto.getSelectedIndex() != 0) {
                prodSelecionado = listProd.get(this.cmbProduto.getSelectedIndex()-1);
                               
                this.txtCodProd.setText(String.valueOf(prodSelecionado.getCod_prod()));
                this.txtGeneroProd.setText(prodSelecionado.getGenero());
                this.txtTituloProd.setText(prodSelecionado.getTitulo());
                this.txtPrecoProd.setText(String.valueOf(prodSelecionado.getPrecoUni()));
                this.preco = prodSelecionado.getPrecoUni();
                     
                if (!"".equals(txtPrecoProd.getText())) {
                    BigDecimal preco = new BigDecimal(txtPrecoProd.getText().replace(",", "."));
                    NumberFormat formatoPreco = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));

                    String valorFormatado = formatoPreco.format(preco);
                    this.txtPrecoProd.setText(valorFormatado);
                } else {
                    this.txtPrecoProd.setValue(null);
                }
                
            } else {
                this.txtCodProd.setText("");
                this.txtGeneroProd.setText("");
                this.txtTituloProd.setText("");
                this.txtPrecoProd.setText("");
            }

            this.txtQtdProd.setEnabled(true);
            this.btnInserirProd.setEnabled(true);
        } 
    }//GEN-LAST:event_cmbProdutoItemStateChanged

    private void btnInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirClienteActionPerformed
        cliSelecionado = new Cliente();
        cliSelecionado = listCli.get(this.cmbCliente.getSelectedIndex()-1);
        
        venda = new Venda(cliSelecionado.getId_cliente());
        
        this.cmbProduto.setEnabled(true);
        
        this.cmbCliente.setEnabled(false);
        this.btnInserirCliente.setEnabled(false);
    }//GEN-LAST:event_btnInserirClienteActionPerformed

    private void btnInserirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdActionPerformed
               
        if(!"".equals(this.txtQtdProd.getText())){
            item = new ItemVenda();

            item.setCodProd(Integer.parseInt(this.txtCodProd.getText()));
            item.setPrecoUnit(this.preco);
            item.setQtd(Integer.parseInt(this.txtQtdProd.getText()));

            //declarando uma variável do tipo moeda aceito
            BigDecimal valor = new BigDecimal(preco);

            //criando uma variável NumberFormat para inserir o tipo de moeda local (R$ ##,##)
            NumberFormat valor2 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

            this.model.addRow(new Object[]{item.getCodProd(),this.txtTituloProd.getText(),item.getQtd(),valor2.format(item.getPrecoUnit()),valor2.format(item.getQtd()*item.getPrecoUnit())});

            this.txtCodProd.setText("");
            this.txtQtdProd.setText("");
            this.txtPrecoProd.setText("");
            this.txtGeneroProd.setText("");
            this.txtTituloProd.setText("");
            this.cmbProduto.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(null, "Informe a quantidade!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirProdActionPerformed

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
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInserirCliente;
    private javax.swing.JButton btnInserirProd;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblCpfCli;
    private javax.swing.JLabel lblGeneroProd;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblPrecoProd;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQtdProd;
    private javax.swing.JLabel lblTituloProd;
    private javax.swing.JLabel lblTituloVenda;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCpfCli;
    private javax.swing.JTextField txtGeneroProd;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JFormattedTextField txtPrecoProd;
    private javax.swing.JTextField txtQtdProd;
    private javax.swing.JTextField txtTituloProd;
    // End of variables declaration//GEN-END:variables

}
