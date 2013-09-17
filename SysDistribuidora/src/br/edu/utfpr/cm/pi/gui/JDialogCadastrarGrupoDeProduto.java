/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.gui.JDialogCadastrarGrupoDeProduto;
import br.edu.utfpr.cm.pi.util.Util;
/**
 *
 * @author TAYLY
 */
public class JDialogCadastrarGrupoDeProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastrarGrupoDeProduto
     */
    public JDialogCadastrarGrupoDeProduto(java.awt.Frame parent, boolean modal) {
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

        jLabelImagemGP = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCadGPImagem = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldCadGPDescricao = new javax.swing.JTextField();
        jTextFieldCadGPCodigo = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(665, 280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagemGP.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImagemGP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagemGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/name/CadGrpoDeProduto.png"))); // NOI18N
        jLabelImagemGP.setMaximumSize(new java.awt.Dimension(740, 80));
        jLabelImagemGP.setMinimumSize(new java.awt.Dimension(740, 80));
        jLabelImagemGP.setPreferredSize(new java.awt.Dimension(740, 80));
        getContentPane().add(jLabelImagemGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 390, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 740, 5));

        jSeparator1.setMaximumSize(new java.awt.Dimension(665, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(665, 1));
        jSeparator1.setPreferredSize(new java.awt.Dimension(665, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 217, 665, 1));

        jLabelCadGPImagem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadGPImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/AltGroupProduct.png"))); // NOI18N
        getContentPane().add(jLabelCadGPImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 130, 120));

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 60, 40));

        jButtonApagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/trash.png"))); // NOI18N
        jButtonApagar.setToolTipText("Apagar");
        getContentPane().add(jButtonApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButtonSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/save01.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jTextFieldCadGPDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldCadGPDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadGPDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadGPDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, -1));

        jTextFieldCadGPCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldCadGPCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, -1));

        jButtonPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/DocumentIconAd.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar");
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(24, 24));
        getContentPane().add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCodigo.setText("Código:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabelDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDescricao.setText("Descrição:");
        getContentPane().add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        setSize(new java.awt.Dimension(681, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadGPDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadGPDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadGPDescricaoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCadastrarGrupoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarGrupoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarGrupoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastrarGrupoDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastrarGrupoDeProduto dialog = new JDialogCadastrarGrupoDeProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCadGPImagem;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelImagemGP;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCadGPCodigo;
    private javax.swing.JTextField jTextFieldCadGPDescricao;
    // End of variables declaration//GEN-END:variables
}
