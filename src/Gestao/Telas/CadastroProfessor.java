package Gestao.Telas;

import Gestao.Controle.ConexaoBancoDados;
import Gestao.Controle.ControleProfessor;
import Gestao.Modelos.Professor;
import Gestao.Modelos.TabelaModelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.ListSelectionModel;

public class CadastroProfessor extends javax.swing.JFrame {

    Professor professor = new Professor();
    ControleProfessor controle = new ControleProfessor();
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    int flag = 0;
    
    public CadastroProfessor() {
        
        initComponents();
        setLocationRelativeTo(null);
        Inicio();
        PreencherTabela("SELECT * FROM professor ORDER BY nome");
        
    }

    public void Inicio() {
    
        fld_codigo.setText("");
        fld_nome.setText("");
        fld_endereco.setText("");
        fld_telefone.setText("");
        fld_cpf.setText("");
        fld_salario.setText("");
        fld_titulacao.setText("");
        fld_area_pesquisa.setText("");
        fld_nome.setEnabled(false);
        fld_endereco.setEnabled(false);
        fld_telefone.setEnabled(false);
        fld_cpf.setEnabled(false);
        fld_salario.setEnabled(false);
        fld_titulacao.setEnabled(false);
        fld_area_pesquisa.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_consultar.setEnabled(true);
    
    }
    
    public void CamposLiberados(){
        
        fld_nome.setEnabled(true);
        fld_endereco.setEnabled(true);
        fld_telefone.setEnabled(true);
        fld_cpf.setEnabled(true);
        fld_salario.setEnabled(true);
        fld_titulacao.setEnabled(true);
        fld_area_pesquisa.setEnabled(true);
                
    }
    
    public void CamposSalvar(){
        
        professor.setNome(fld_nome.getText());
        professor.setEndereco(fld_endereco.getText());
        professor.setTelefone(fld_telefone.getText());
        professor.setCpf(fld_cpf.getText());
        professor.setSalario(fld_salario.getText());
        professor.setTitulacao(fld_titulacao.getText());
        professor.setAreaPesquisa(fld_area_pesquisa.getText());
            
    }
    
    public void PreencherTabela(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Código", "Nome", "Endereço", "Telefone", "CPF", "Salário", "Titulação", "Área de Pesquisa"};
        conexao.Conecta();
        
        conexao.executaSql(Sql);
        try{
            conexao.rs.first();
            do{
                dados.add(new Object[]{conexao.rs.getInt("codigo"),
                    conexao.rs.getString("nome"),
                    conexao.rs.getString("endereco"),
                    conexao.rs.getString("telefone"),
                    conexao.rs.getString("cpf"),
                    conexao.rs.getString("salario"),
                    conexao.rs.getString("titulacao"),
                    conexao.rs.getString("area_pesquisa")});
            }while (conexao.rs.next());
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a lista!!" +ex);
        }
        
        TabelaModelo tabela = new TabelaModelo(dados, colunas);
        
        tbl_professor.setModel(tabela);
        tbl_professor.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbl_professor.getColumnModel().getColumn(0).setResizable(true);
        tbl_professor.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_professor.getColumnModel().getColumn(1).setResizable(true);
        tbl_professor.getColumnModel().getColumn(2).setPreferredWidth(200);
        tbl_professor.getColumnModel().getColumn(2).setResizable(true);
        tbl_professor.getColumnModel().getColumn(3).setPreferredWidth(70);
        tbl_professor.getColumnModel().getColumn(3).setResizable(true);
        tbl_professor.getColumnModel().getColumn(4).setPreferredWidth(70);
        tbl_professor.getColumnModel().getColumn(4).setResizable(true);
        tbl_professor.getColumnModel().getColumn(5).setPreferredWidth(70);
        tbl_professor.getColumnModel().getColumn(5).setResizable(true);
        tbl_professor.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbl_professor.getColumnModel().getColumn(6).setResizable(true);
        tbl_professor.getColumnModel().getColumn(7).setPreferredWidth(100);
        tbl_professor.getColumnModel().getColumn(7).setResizable(true);
        tbl_professor.getTableHeader().setReorderingAllowed(false);
        tbl_professor.setAutoResizeMode(tbl_professor.AUTO_RESIZE_OFF);
        tbl_professor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conexao.Desconecta();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fld_nome = new javax.swing.JTextField();
        fld_endereco = new javax.swing.JTextField();
        fld_telefone = new javax.swing.JTextField();
        fld_cpf = new javax.swing.JTextField();
        fld_salario = new javax.swing.JTextField();
        fld_titulacao = new javax.swing.JTextField();
        fld_area_pesquisa = new javax.swing.JTextField();
        fld_codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_menu_principal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_professor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        fld_pesquisa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_atualizar_tabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACULDADES INTEGRADAS");

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Salário:");

        jLabel6.setText("Titulação:");

        jLabel7.setText("Área de Pesquisa:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestao/Imagens/professor.jpg"))); // NOI18N

        jLabel11.setText("Codigo:");

        fld_codigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fld_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fld_endereco)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fld_titulacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(fld_area_pesquisa)
                            .addComponent(fld_salario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_telefone)
                            .addComponent(fld_cpf, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fld_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(fld_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fld_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fld_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fld_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_titulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fld_area_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CADASTRO DO PROFESSOR");

        btn_novo.setText("NOVO");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_excluir.setText("EXCLUIR");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_menu_principal.setText("MENU PRINCIPAL");
        btn_menu_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_principalActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(454, 405));

        tbl_professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_professor);

        btn_consultar.setText("IR");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquisar por professor:");

        btn_atualizar_tabela.setText("ATUALIZAR A TABELA");
        btn_atualizar_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizar_tabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(fld_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_consultar)
                .addGap(96, 96, 96)
                .addComponent(btn_atualizar_tabela)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar)
                    .addComponent(jLabel10)
                    .addComponent(fld_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizar_tabela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(149, 149, 149)
                        .addComponent(btn_menu_principal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btn_menu_principal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excluir)))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_principalActionPerformed
        
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_menu_principalActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        if(flag == 1){
            CamposSalvar();
            controle.Salvar(professor);
            Inicio();
        } else {
            CamposSalvar();
            controle.Editar(professor);
            Inicio();
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        
        Inicio();
        CamposLiberados();
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_novo.setEnabled(false);
        btn_consultar.setEnabled(false);
        flag = 1;
                
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        Inicio();
        JOptionPane.showMessageDialog(rootPane, "Operação cancelada!!");
                  
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        
        professor.setPesquisar(fld_pesquisa.getText());
        Professor pesquisaProfessor = controle.PesquisarProfessor(professor);
        fld_codigo.setText(String.valueOf(pesquisaProfessor.getCodigo()));
        fld_nome.setText(pesquisaProfessor.getNome());
        fld_endereco.setText(pesquisaProfessor.getEndereco());
        fld_telefone.setText(pesquisaProfessor.getTelefone());
        fld_cpf.setText(pesquisaProfessor.getCpf());
        fld_salario.setText(pesquisaProfessor.getSalario());
        fld_titulacao.setText(pesquisaProfessor.getTitulacao());
        fld_area_pesquisa.setText(pesquisaProfessor.getAreaPesquisa());
        btn_excluir.setEnabled(true);
        btn_editar.setEnabled(true);
        
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        
        CamposLiberados();
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_novo.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_consultar.setEnabled(false);
        flag = 2;
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir os dados?");
        if(resposta == JOptionPane.YES_OPTION){
            professor.setCodigo(Integer.parseInt(fld_codigo.getText()));
            controle.Excluir(professor);
        }
        Inicio();
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_atualizar_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizar_tabelaActionPerformed
        
        PreencherTabela("SELECT * FROM professor ORDER BY nome");
        
    }//GEN-LAST:event_btn_atualizar_tabelaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar_tabela;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_menu_principal;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField fld_area_pesquisa;
    private javax.swing.JTextField fld_codigo;
    private javax.swing.JTextField fld_cpf;
    private javax.swing.JTextField fld_endereco;
    private javax.swing.JTextField fld_nome;
    private javax.swing.JTextField fld_pesquisa;
    private javax.swing.JTextField fld_salario;
    private javax.swing.JTextField fld_telefone;
    private javax.swing.JTextField fld_titulacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_professor;
    // End of variables declaration//GEN-END:variables
}
