/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.gui;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogPesquisarCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisarCliente
     */
    public JDialogPesquisarCliente(java.awt.Frame parent, boolean modal) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnRotulo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfRG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnRotulo1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        pnRotulo2 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        btFechar = new javax.swing.JButton();
        btFechar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));
        setPreferredSize(new java.awt.Dimension(600, 328));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 430, 684, 10));

        pnRotulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnRotulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pesquisar Cliente");
        pnRotulo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 490, 50));

        getContentPane().add(pnRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 67));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(790, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(795, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNome.setText("Nome:");
        jPanel2.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        lbCPF.setText("CNPJ/CPF:");
        jPanel2.add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lbRG.setText("IE/RG:");
        jPanel2.add(lbRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lbId.setText("Código:");
        jPanel2.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel2.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, 25));
        jPanel2.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 390, 25));
        jPanel2.add(tfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 170, 25));
        jPanel2.add(tfRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar por:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 812, 320));

        pnRotulo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnRotulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/PesquisarPadrao.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(37, 37));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(37, 37));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(37, 37));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        pnRotulo1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, 40));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/save01.png"))); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnRotulo1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, 40));

        pnRotulo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnRotulo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/PesquisarPadrao.png"))); // NOI18N
        jToggleButton5.setMaximumSize(new java.awt.Dimension(37, 37));
        jToggleButton5.setMinimumSize(new java.awt.Dimension(37, 37));
        jToggleButton5.setPreferredSize(new java.awt.Dimension(37, 37));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        pnRotulo2.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 60, 50));

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/save01.png"))); // NOI18N
        jToggleButton6.setSelected(true);
        pnRotulo2.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 60, 50));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clear.png"))); // NOI18N
        jToggleButton7.setText("clear");
        pnRotulo2.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/close_24.png"))); // NOI18N
        pnRotulo2.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        pnRotulo1.add(pnRotulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 810, 111));

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        pnRotulo1.add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 50, 40));

        btFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close.png"))); // NOI18N
        btFechar1.setToolTipText("Fechar");
        btFechar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFechar1ActionPerformed(evt);
            }
        });
        pnRotulo1.add(btFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 50, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clear.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnRotulo1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 50, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close_.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(37, 37));
        jButton2.setMinimumSize(new java.awt.Dimension(37, 37));
        pnRotulo1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 50, 40));

        getContentPane().add(pnRotulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 810, 111));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        Util.imprimirConfirmacao("Deseja Fechar?");
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFechar1ActionPerformed
        Util.imprimirConfirmacao("Deseja Fechar?");
        dispose();
    }//GEN-LAST:event_btFechar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogPesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPesquisarCliente dialog = new JDialogPesquisarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btFechar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JPanel pnRotulo;
    private javax.swing.JPanel pnRotulo1;
    private javax.swing.JPanel pnRotulo2;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRG;
    // End of variables declaration//GEN-END:variables
}