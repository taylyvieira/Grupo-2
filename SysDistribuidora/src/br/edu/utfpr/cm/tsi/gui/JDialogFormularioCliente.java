package br.edu.utfpr.cm.tsi.gui;

import br.edu.utfpr.cm.pi.entidades.Cliente;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import br.edu.utfpr.cm.pi.daos.DaoCliente;
import br.edu.utfpr.cm.pi.daos.DaoEndereco;
import br.edu.utfpr.cm.pi.daos.DaoTelefone;
import br.edu.utfpr.cm.pi.entidades.Telefone;
import br.edu.utfpr.cm.pi.util.Util;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogFormularioCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogFormularioCliente
     */
    private List<Cliente> clientes;

    public JDialogFormularioCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarTabelaComClientes();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DefaultTableModel tmClientes = new DefaultTableModel(null, new String[]{"Códogo", "Nome", "Endeço", "Bairro", "Cidade", "UF", "CEP", "Telefone"});
    ListSelectionModel IsmClientes;
    List<Cliente> fornecedores;
    String tipoCadastro;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfUF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        ftfTelefone = new javax.swing.JFormattedTextField();
        btDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        setTitle("Cadastro de Clientes");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(tfPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 24, 472, -1));

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 23, -1, -1));

        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 304, -1, -1));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 324, 700, -1));

        jLabelEndereco.setText("Endereço:");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 350, -1, -1));
        getContentPane().add(tfLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 370, 426, -1));

        jLabelBairro.setText("Bairro:");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 350, -1, -1));
        getContentPane().add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 370, 256, -1));

        jLabelCidade.setText("Cidade:");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 396, -1, -1));
        getContentPane().add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 416, 238, -1));

        jLabel6.setText("UF:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 396, -1, -1));
        getContentPane().add(tfUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 416, 67, -1));

        jLabel7.setText("CEP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 396, -1, -1));
        getContentPane().add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 416, 101, -1));

        jLabel8.setText("Telefone:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 396, -1, -1));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Add.png"))); // NOI18N
        btNovo.setToolTipText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 70, 40));
        btNovo.getAccessibleContext().setAccessibleName("");

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/update.png"))); // NOI18N
        btAlterar.setToolTipText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clear.png"))); // NOI18N
        btCancelar.setToolTipText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/save01.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Close_.png"))); // NOI18N
        btFechar.setToolTipText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 60, 40));

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(ftfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 250, -1));

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/delete.png"))); // NOI18N
        btDeletar.setToolTipText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 700, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
//            dispose();
            dispose();
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //if (Util.imprimirMsgNaTela("Deseja Cancelar?")) {
        habilitarCampos();
//        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        tipoCadastro = "novo";
        novoCliente();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        listarClientes();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        tipoCadastro = "alteracao";
        alteraCliente();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        cadastrarCliente();
        carregarTabelaComClientes();

    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
    }//GEN-LAST:event_tfNomeActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        if (jTableCliente.getSelectedRow() == -1) {// se tabela selecionada
            Util.imprimirConfirmacao("Selecione Um Cliente");

        } else {
            tbClientesLinhaSelecionada(jTableCliente);  //carrega dados da tabela p/ tf
            if (Util.imprimirConfirmacao("Deseja Deletar Cliente")) {
                try {
                    deletaCliente();
                } catch (SQLException ex) {
                    Logger.getLogger(JDialogFormularioCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(JDialogFormularioCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                novoCliente();
                listarClientes();
            }
        }

        //        alteraCliente();
//        if (Util.imprimirMsgNaTela("Deseja deletar")) {
//            deletaCliente();
//            listarClientes();
//        }
    }//GEN-LAST:event_btDeletarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    protected javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    protected javax.swing.JTextField tfBairro;
    protected javax.swing.JTextField tfCep;
    protected javax.swing.JTextField tfCidade;
    protected javax.swing.JTextField tfLogradouro;
    protected javax.swing.JTextField tfNome;
    public javax.swing.JTextField tfPesquisar;
    protected javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables

    protected void listarClientes() {
        DaoCliente cli = new DaoCliente();
        // fornecedores = cli.listCliente("%" + tfPesquisar.getText().trim()+"%");
        mostrarClientes(fornecedores);
    }

    protected void mostrarClientes(List<Cliente> clientes) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Códogo", "Nome", "Endeço", "Bairro", "Cidade", "UF", "CEP"});

        if (clientes != null) {
            for (Cliente cliente : clientes) {
                model.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getEndereco().getLogradouro(), cliente.getEndereco().getBairro(), cliente.getEndereco().getCidade(), cliente.getEndereco().getUf(), cliente.getEndereco().getCep()});
            }
            jTableCliente.setModel(model);
        }
    }

    protected void tbClientesLinhaSelecionada(JTable tb) {
        if (tb.getSelectedRow() != -1) {
            tfNome.setText(fornecedores.get(tb.getSelectedRow()).getNome());
            tfLogradouro.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getLogradouro());
            tfCidade.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getCidade());
            tfBairro.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getBairro());
            tfUF.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getUf());
            tfCep.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getCep());
//            ftfTelefone.setText(fornecedores.get(tb.getSelectedRow()).getEndereco().getTelefone());
        } else {
            tfNome.setText("");
            tfLogradouro.setText("");
            tfCidade.setText("");
            tfBairro.setText("");
            tfUF.setText("");
            tfCep.setText("");
            ftfTelefone.setText("");
        }
    }

    protected void novoCliente() {
        habilitarCampos();
        tfNome.setText("");
        tfLogradouro.setText("");
        tfCidade.setText("");
        tfBairro.setText("");
        tfUF.setText("");
        tfCep.setText("");
        ftfTelefone.setText("");
    }

    protected void cadastrarCliente() {
        if (verificarCampos() && verificarUF()) {
            Cliente cliente = new Cliente();
            cliente.setNome(tfNome.getText().trim());
            Endereco end = new Endereco();
            end.setLogradouro(tfLogradouro.getText().trim());
            end.setBairro(tfBairro.getText().trim());
            end.setCidade(tfCidade.getText().trim());
            end.setUf(tfUF.getText().trim());
            end.setCep(tfCep.getText().trim());


            Telefone tel = new Telefone();
            tel.setNumero(ftfTelefone.getText());

            DaoTelefone daoT = new DaoTelefone();

            daoT.persist(tel);

            DaoEndereco daoE = new DaoEndereco();
            daoE.persist(end);


            cliente.setEndereco(end);
            DaoCliente c = new DaoCliente();
            c.persist(cliente);
            desabilitarCampos();

        }
    }

    protected void alterarCliente() {
        if (verificarCampos() && verificarUF()) {
            Cliente cliente = new Cliente();
            cliente.setId(fornecedores.get(jTableCliente.getSelectedRow()).getId());
            cliente.setNome(tfNome.getText().trim());
            Endereco end = cliente.getEndereco();
            end.setLogradouro(tfLogradouro.getText().trim());
            end.setBairro(tfBairro.getText().trim());
            end.setCidade(tfCidade.getText().trim());
            end.setUf(tfUF.getText().trim());
            end.setCep(tfCep.getText().trim());
            // end.setTelefone(ftfTelefone.getText().trim());
            DaoCliente c = new DaoCliente();
            c.persist(cliente);
            desabilitarCampos();
        } else {
            Util.dispayMsg("Informe o nome do cliente!");
            tfNome.requestFocus();
        }
    }

    protected void habilitarCampos() {
        tfNome.setEditable(true);
        tfLogradouro.setEditable(true);
        tfBairro.setEditable(true);
        tfCidade.setEditable(true);
        tfCep.setEditable(true);
        tfUF.setEditable(true);
        ftfTelefone.setEditable(true);
        btSalvar.setEnabled(true);
    }

    protected void desabilitarCampos() {
        tfNome.setEditable(false);
        tfLogradouro.setEditable(false);
        tfBairro.setEditable(false);
        tfCidade.setEditable(false);
        tfCep.setEditable(false);
        tfUF.setEditable(false);
        ftfTelefone.setEditable(false);
        btSalvar.setEnabled(false);
    }

    private void alteraCliente() {
        if (jTableCliente.getSelectedRow() != -1) {
            tbClientesLinhaSelecionada(jTableCliente);
            habilitarCampos();
        } else {
            Util.dispayMsg("Selecione um Cliente");
        }
    }

    protected boolean verificarUF() {
        if (tfUF.getText().length() > 2) {
            return false;

        }
        return true;
    }

    protected boolean verificarCampos() {
        if (!tfNome.getText().trim().equals("")) {
            return true;
        }
        return false;
    }

    protected void deletaCliente() throws SQLException, Exception {
        habilitarCampos();
        Cliente cliente = new Cliente();
        cliente.setId(fornecedores.get(jTableCliente.getSelectedRow()).getId());

        DaoCliente c = new DaoCliente();
        c.delete(cliente);
    }

    private Endereco PegarDadosEndereco() {
        Endereco end = new Endereco();

        end.setLogradouro(tfLogradouro.getText());
        end.setBairro(tfBairro.getText());

        return end;

    }

    private void carregarTabelaComClientes() {
        DaoCliente daoC = new DaoCliente();

        clientes = daoC.list();

        mostrarClientes(clientes);


    }
}
