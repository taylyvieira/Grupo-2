/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.gui;

/**
 *
 * @author TAYLY
 */
public class JDialogCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form JDialogCadastroProduto
     */
    public JDialogCadastroProduto() {
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

        jMenu1 = new javax.swing.JMenu();
        pnRotulo = new javax.swing.JPanel();
        lbRotulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbNascimento = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome1 = new javax.swing.JTextField();
        tfDataNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        lbTipoLogradouro = new javax.swing.JLabel();
        lbLogradouro = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        cbTipoLogradouro = new javax.swing.JComboBox();
        tfLogradouro = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        tfBairro = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        tfResidencial = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 555));
        setPreferredSize(new java.awt.Dimension(800, 348));

        pnRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        pnRotulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRotulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotulo.setText("Cadastro de Produto");
        pnRotulo.add(lbRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 5, -1, -1));

        jLabel1.setText("Código");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Nome:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Grupo de Produtos : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel3.setMaximumSize(new java.awt.Dimension(790, 200));
        jPanel3.setMinimumSize(new java.awt.Dimension(790, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(795, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNome.setText("Nome:");
        jPanel3.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lbCPF.setText("CNPJ/CPF:");
        jPanel3.add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbId.setText("Código:");
        jPanel3.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lbNascimento.setText("Nasc:");
        jPanel3.add(lbNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel3.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 25));
        jPanel3.add(tfNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 390, 25));
        jPanel3.add(tfDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 25));

        jLabel5.setText("Tipo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jRadioButton1.setText("Jurídico");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jRadioButton2.setText("Físico");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, 30));

        jTabbedPane1.addTab("Dados Pessoais", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTipoLogradouro.setText("Tipo Logradouro:");
        jPanel4.add(lbTipoLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lbLogradouro.setText("Logradouro:");
        jPanel4.add(lbLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lbNumero.setText("N°:");
        jPanel4.add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        lbComplemento.setText("Complemento:");
        jPanel4.add(lbComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lbCep.setText("Cep:");
        jPanel4.add(lbCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        lbBairro.setText("Bairro:");
        jPanel4.add(lbBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        lbCidade.setText("Cidade:");
        jPanel4.add(lbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        lbEstado.setText("Estado:");
        jPanel4.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        cbTipoLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rua", "Avenida", "Estrada" }));
        jPanel4.add(cbTipoLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, -1));
        jPanel4.add(tfLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, -1));
        jPanel4.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 90, -1));
        jPanel4.add(tfComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 120, -1));
        jPanel4.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, -1));
        jPanel4.add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 110, -1));
        jPanel4.add(tfResidencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, -1));

        lbTelefone.setText("Telefone:");
        jPanel4.add(lbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lbCelular.setText("Celular:");
        jPanel4.add(lbCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));
        jPanel4.add(tfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 120, -1));

        jLabel13.setText("E-mail:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        jPanel4.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 400, -1));

        jTabbedPane1.addTab("Endereço", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/save01.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 50, 40));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clear.png"))); // NOI18N
        btCancelar.setToolTipText("Cancelar");
        btCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 50, 40));

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/delete.png"))); // NOI18N
        btDeletar.setToolTipText("Apagar");
        btDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.add(btDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 50, 40));

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel2.add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        Util.imprimirConfirmacao("Deseja Fechar?");
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialogCadastroProduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbTipoLogradouro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRotulo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTipoLogradouro;
    private javax.swing.JPanel pnRotulo;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfDataNascimento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNome1;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfResidencial;
    // End of variables declaration//GEN-END:variables
}
