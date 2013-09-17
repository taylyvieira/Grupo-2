 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.util.Util;
import javax.swing.JOptionPane;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastroCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroCliente
     */
    public JDialogCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfCodigo.setEditable(false);
        tfNome.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnRotulo = new javax.swing.JPanel();
        lbRotulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbNascimento = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfDataNascimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        pnRotulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRotulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotulo.setText("Cadastro de Cliente");
        pnRotulo.add(lbRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 5, -1, -1));

        getContentPane().add(pnRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.setMaximumSize(new java.awt.Dimension(790, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(795, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNome.setText("Nome:");
        jPanel2.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lbCPF.setText("CNPJ/CPF:");
        jPanel2.add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbId.setText("Código:");
        jPanel2.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lbNascimento.setText("Nasc:");
        jPanel2.add(lbNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel2.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 25));
        jPanel2.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 390, 25));
        jPanel2.add(tfDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 25));

        jLabel1.setText("Tipo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Jurídico");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Físico");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });
        jPanel2.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clientes.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jTabbedPane1.addTab("Dados Pessoais", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTipoLogradouro.setText("Tipo Logradouro:");
        jPanel3.add(lbTipoLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lbLogradouro.setText("Logradouro:");
        jPanel3.add(lbLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lbNumero.setText("N°:");
        jPanel3.add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        lbComplemento.setText("Complemento:");
        jPanel3.add(lbComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lbCep.setText("Cep:");
        jPanel3.add(lbCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        lbBairro.setText("Bairro:");
        jPanel3.add(lbBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        lbCidade.setText("Cidade:");
        jPanel3.add(lbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        lbEstado.setText("Estado:");
        jPanel3.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        cbTipoLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rua", "Avenida", "Estrada" }));
        jPanel3.add(cbTipoLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, -1));
        jPanel3.add(tfLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, -1));
        jPanel3.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 90, -1));
        jPanel3.add(tfComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 120, -1));
        jPanel3.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 130, -1));
        jPanel3.add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 110, -1));
        jPanel3.add(tfResidencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, -1));

        lbTelefone.setText("Telefone:");
        jPanel3.add(lbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lbCelular.setText("Celular:");
        jPanel3.add(lbCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));
        jPanel3.add(tfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 120, -1));

        jLabel13.setText("E-mail:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        jPanel3.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 400, -1));

        jTabbedPane1.addTab("Endereço", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 390));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/save01.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 50, 40));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/clear.png"))); // NOI18N
        btCancelar.setToolTipText("Cancelar");
        btCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 50, 40));

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/delete.png"))); // NOI18N
        btDeletar.setToolTipText("Apagar");
        btDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(btDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 50, 40));

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/close_1.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
       Util.imprimirConfirmacao("Deseja Fechar?");
       dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        // TODO add your handling code here:
        if(!Util.isCPF(jFormattedTextField1.getText())){
            JOptionPane.showMessageDialog(lbComplemento, "CPF inválido!!");
        }
    }//GEN-LAST:event_jFormattedTextField1FocusLost

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
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroCliente dialog = new JDialogCadastroCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbTipoLogradouro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfResidencial;
    // End of variables declaration//GEN-END:variables
}
