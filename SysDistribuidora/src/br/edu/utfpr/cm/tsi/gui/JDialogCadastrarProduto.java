/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.gui;

import br.edu.utfpr.cm.pi.util.Util;

/**
 *
 * @author TAYLY
 */
public class JDialogCadastrarProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarProduto
     */
    public JDialogCadastrarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabelCadProdImage = new javax.swing.JLabel();
        jSeparatorCadProdut = new javax.swing.JSeparator();
        jLabelCadProdCodigo = new javax.swing.JLabel();
        jTextFieldCadProdCodigo = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldCadProdProduto = new javax.swing.JTextField();
        jLabelCadProdProduto = new javax.swing.JLabel();
        jLabelCadProdGP = new javax.swing.JLabel();
        jTextFieldCadProdGP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadProdFechar = new javax.swing.JButton();
        jButtonCadProdExcluir = new javax.swing.JButton();
        jButtonCadProdLimpar = new javax.swing.JButton();
        jButtonCadProdSalvar = new javax.swing.JButton();
        jSeparatorCadProd = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(681, 333));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadProdImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadProdImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadProdImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/name/CadProduto.png"))); // NOI18N
        jLabelCadProdImage.setMaximumSize(new java.awt.Dimension(740, 70));
        jLabelCadProdImage.setMinimumSize(new java.awt.Dimension(740, 70));
        jLabelCadProdImage.setPreferredSize(new java.awt.Dimension(740, 70));
        getContentPane().add(jLabelCadProdImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 350, 60));

        jSeparatorCadProdut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorCadProdut.setMaximumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProdut.setMinimumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProdut.setPreferredSize(new java.awt.Dimension(740, 1));
        getContentPane().add(jSeparatorCadProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 1));

        jLabelCadProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadProdCodigo.setText("Código:");
        getContentPane().add(jLabelCadProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jTextFieldCadProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldCadProdCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadProdCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 116, -1));

        jButtonPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/DocumentIconAd.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar");
        jButtonPesquisar.setBorder(null);
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(24, 24));
        getContentPane().add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jTextFieldCadProdProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldCadProdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadProdProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadProdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 319, -1));

        jLabelCadProdProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadProdProduto.setText("Produto:");
        getContentPane().add(jLabelCadProdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabelCadProdGP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadProdGP.setText("Grupo de Produto:");
        getContentPane().add(jLabelCadProdGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTextFieldCadProdGP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldCadProdGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Product.png"))); // NOI18N
        jLabel2.setToolTipText("Cadastro de Produto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 110));

        jButtonCadProdFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close_.png"))); // NOI18N
        jButtonCadProdFechar.setToolTipText("Fachar");
        jButtonCadProdFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadProdFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, 40));

        jButtonCadProdExcluir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/trash.png"))); // NOI18N
        jButtonCadProdExcluir.setToolTipText("");
        getContentPane().add(jButtonCadProdExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jButtonCadProdLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clear02.png"))); // NOI18N
        jButtonCadProdLimpar.setToolTipText("Limpar");
        getContentPane().add(jButtonCadProdLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButtonCadProdSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCadProdSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/save01.png"))); // NOI18N
        jButtonCadProdSalvar.setToolTipText("Salvar");
        getContentPane().add(jButtonCadProdSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jSeparatorCadProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorCadProd.setMaximumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProd.setMinimumSize(new java.awt.Dimension(740, 1));
        jSeparatorCadProd.setPreferredSize(new java.awt.Dimension(740, 10));
        getContentPane().add(jSeparatorCadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 216, 740, 20));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        setBounds(0, 0, 681, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadProdCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadProdCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadProdCodigoActionPerformed

    private void jTextFieldCadProdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadProdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadProdProdutoActionPerformed

    private void jButtonCadProdFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdFecharActionPerformed
       if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonCadProdFecharActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastrarProduto dialog = new JDialogCadastrarProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCadProdExcluir;
    private javax.swing.JButton jButtonCadProdFechar;
    private javax.swing.JButton jButtonCadProdLimpar;
    private javax.swing.JButton jButtonCadProdSalvar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadProdCodigo;
    private javax.swing.JLabel jLabelCadProdGP;
    private javax.swing.JLabel jLabelCadProdImage;
    private javax.swing.JLabel jLabelCadProdProduto;
    private javax.swing.JSeparator jSeparatorCadProd;
    private javax.swing.JSeparator jSeparatorCadProdut;
    private javax.swing.JTextField jTextFieldCadProdCodigo;
    private javax.swing.JTextField jTextFieldCadProdGP;
    private javax.swing.JTextField jTextFieldCadProdProduto;
    // End of variables declaration//GEN-END:variables
}
