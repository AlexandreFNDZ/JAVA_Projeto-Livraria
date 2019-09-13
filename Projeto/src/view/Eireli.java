
package view;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class Eireli extends javax.swing.JFrame {

    /**
     * Creates new form menuBar
     */
    public Eireli() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        btnMenuOpe = new javax.swing.JButton();
        btnMenuCad = new javax.swing.JButton();
        jPanelEscondidoCad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastroCliente = new javax.swing.JLabel();
        cadastroProduto = new javax.swing.JLabel();
        consultaCliente = new javax.swing.JLabel();
        consultaProduto = new javax.swing.JLabel();
        jPanelEscondidoVendas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cadastroVendas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookStore - Java");
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 153));

        btnMenuOpe.setBackground(new java.awt.Color(51, 0, 102));
        btnMenuOpe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenuOpe.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuOpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/application_form_magnify.png"))); // NOI18N
        btnMenuOpe.setText("Operações");
        btnMenuOpe.setBorder(null);
        btnMenuOpe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuOpe.setMaximumSize(new java.awt.Dimension(81, 17));
        btnMenuOpe.setMinimumSize(new java.awt.Dimension(81, 17));
        btnMenuOpe.setPreferredSize(new java.awt.Dimension(67, 21));
        btnMenuOpe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuOpeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuOpeMouseExited(evt);
            }
        });

        btnMenuCad.setBackground(new java.awt.Color(51, 0, 102));
        btnMenuCad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMenuCad.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/application_add.png"))); // NOI18N
        btnMenuCad.setText("Cadastros");
        btnMenuCad.setBorder(null);
        btnMenuCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuCad.setPreferredSize(new java.awt.Dimension(67, 21));
        btnMenuCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuCadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuCadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnMenuOpe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnMenuCad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 564, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuOpe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnMenuCad, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 60);

        jPanelEscondidoCad.setBackground(new java.awt.Color(102, 0, 153));
        jPanelEscondidoCad.setPreferredSize(new java.awt.Dimension(170, 180));
        jPanelEscondidoCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelEscondidoCadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelEscondidoCadMouseExited(evt);
            }
        });
        jPanelEscondidoCad.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produto");
        jPanelEscondidoCad.add(jLabel1);
        jLabel1.setBounds(10, 100, 115, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente");
        jPanelEscondidoCad.add(jLabel2);
        jLabel2.setBounds(10, 10, 102, 33);

        cadastroCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        cadastroCliente.setText("Cadastro");
        cadastroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroClienteMouseEntered(evt);
            }
        });
        jPanelEscondidoCad.add(cadastroCliente);
        cadastroCliente.setBounds(30, 40, 70, 30);
        cadastroCliente.getAccessibleContext().setAccessibleName(" Cadastro ");

        cadastroProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        cadastroProduto.setText("Cadastro");
        cadastroProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroProdutoMouseEntered(evt);
            }
        });
        jPanelEscondidoCad.add(cadastroProduto);
        cadastroProduto.setBounds(30, 130, 70, 30);

        consultaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        consultaCliente.setText("Consulta");
        consultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaClienteMouseEntered(evt);
            }
        });
        jPanelEscondidoCad.add(consultaCliente);
        consultaCliente.setBounds(30, 70, 80, 30);

        consultaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        consultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        consultaProduto.setText("Consulta");
        consultaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaProdutoMouseEntered(evt);
            }
        });
        jPanelEscondidoCad.add(consultaProduto);
        consultaProduto.setBounds(30, 160, 80, 30);

        jPanel1.add(jPanelEscondidoCad);
        jPanelEscondidoCad.setBounds(10, 50, 170, 10);

        jPanelEscondidoVendas.setBackground(new java.awt.Color(102, 0, 153));
        jPanelEscondidoVendas.setPreferredSize(new java.awt.Dimension(140, 100));
        jPanelEscondidoVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelEscondidoVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelEscondidoVendasMouseExited(evt);
            }
        });
        jPanelEscondidoVendas.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vendas");
        jPanelEscondidoVendas.add(jLabel4);
        jLabel4.setBounds(10, 10, 102, 33);

        cadastroVendas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cadastroVendas.setForeground(new java.awt.Color(255, 255, 255));
        cadastroVendas.setText("Cadastro");
        cadastroVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroVendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroVendasMouseEntered(evt);
            }
        });
        jPanelEscondidoVendas.add(cadastroVendas);
        cadastroVendas.setBounds(10, 50, 120, 30);

        jPanel1.add(jPanelEscondidoVendas);
        jPanelEscondidoVendas.setBounds(140, 50, 140, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 220, 700, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 80, 240, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(714, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuOpeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuOpeMouseEntered
        jPanelEscondidoVendas.setSize(140, 100);
    }//GEN-LAST:event_btnMenuOpeMouseEntered

    private void btnMenuOpeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuOpeMouseExited
        jPanelEscondidoVendas.setSize(0, 0);
    }//GEN-LAST:event_btnMenuOpeMouseExited

    private void jPanelEscondidoCadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEscondidoCadMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_jPanelEscondidoCadMouseEntered

    private void jPanelEscondidoCadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEscondidoCadMouseExited
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_jPanelEscondidoCadMouseExited

    private void btnMenuCadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuCadMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_btnMenuCadMouseEntered

    private void btnMenuCadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuCadMouseExited
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_btnMenuCadMouseExited

    private void jPanelEscondidoVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEscondidoVendasMouseEntered
        jPanelEscondidoVendas.setSize(140, 100);
    }//GEN-LAST:event_jPanelEscondidoVendasMouseEntered

    private void jPanelEscondidoVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEscondidoVendasMouseExited
        jPanelEscondidoVendas.setSize(0, 0);
    }//GEN-LAST:event_jPanelEscondidoVendasMouseExited

    private void cadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroClienteMouseClicked
        new Cad_Cli().setVisible(true);
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_cadastroClienteMouseClicked

    private void consultaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaClienteMouseClicked
        new ConsultaCliente().setVisible(true);
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_consultaClienteMouseClicked

    private void cadastroProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroProdutoMouseClicked
        new Cad_Prod().setVisible(true);
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_cadastroProdutoMouseClicked

    private void consultaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaProdutoMouseClicked
        new ConsultaProduto().setVisible(true);
        jPanelEscondidoCad.setSize(0, 0);
    }//GEN-LAST:event_consultaProdutoMouseClicked

    private void cadastroVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroVendasMouseClicked
        new Cad_Venda().setVisible(true);
        jPanelEscondidoVendas.setSize(0, 0);
    }//GEN-LAST:event_cadastroVendasMouseClicked

    private void cadastroClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroClienteMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_cadastroClienteMouseEntered

    private void consultaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaClienteMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_consultaClienteMouseEntered

    private void cadastroProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroProdutoMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_cadastroProdutoMouseEntered

    private void consultaProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaProdutoMouseEntered
        jPanelEscondidoCad.setSize(170, 200);
    }//GEN-LAST:event_consultaProdutoMouseEntered

    private void cadastroVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroVendasMouseEntered
        jPanelEscondidoVendas.setSize(140, 100);
    }//GEN-LAST:event_cadastroVendasMouseEntered

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
            java.util.logging.Logger.getLogger(Eireli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eireli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eireli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eireli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eireli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuCad;
    private javax.swing.JButton btnMenuOpe;
    private javax.swing.JLabel cadastroCliente;
    private javax.swing.JLabel cadastroProduto;
    private javax.swing.JLabel cadastroVendas;
    private javax.swing.JLabel consultaCliente;
    private javax.swing.JLabel consultaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEscondidoCad;
    private javax.swing.JPanel jPanelEscondidoVendas;
    // End of variables declaration//GEN-END:variables
}
