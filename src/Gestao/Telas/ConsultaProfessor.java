package Gestao.Telas;

import Gestao.Controle.ConexaoBancoDados;
import Gestao.Modelos.Disciplina;
import Gestao.Modelos.Professor;
import Gestao.Modelos.Curso;
import Gestao.Modelos.TabelaModelo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaProfessor extends javax.swing.JFrame {
   
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    Professor professor = new Professor();
    Disciplina disciplina = new Disciplina();
    Curso curso = new Curso();
        
    String professorPesquisado;
    ArrayList<String> disciplinas = new ArrayList<>();
    ArrayList<String> lista = new ArrayList<>();
            
    public ConsultaProfessor() {
        
        initComponents();
        setLocationRelativeTo(null);
        fld_nome_professor.setEnabled(false);
                
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_menu_principal = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        fld_pesquisa = new javax.swing.JTextField();
        fld_nome_professor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_consulta_professor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACULDADES INTEGRADAS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CONSULTAR DISCIPLINAS POR PROFESSOR");

        jLabel2.setText("Consulta:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestao/Imagens/professor.jpg"))); // NOI18N

        jLabel4.setText("Professor:");

        btn_menu_principal.setText("MENU PRINCIPAL");
        btn_menu_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_principalActionPerformed(evt);
            }
        });

        btn_consultar.setText("IR");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        fld_nome_professor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tbl_consulta_professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_consulta_professor.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbl_consulta_professor);
        tbl_consulta_professor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fld_nome_professor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(fld_pesquisa))
                        .addGap(35, 35, 35)
                        .addComponent(btn_consultar)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_menu_principal)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btn_menu_principal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fld_nome_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_principalActionPerformed
        
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_menu_principalActionPerformed
    
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        
        conexao.Conecta();
        
        disciplinas.clear();
        lista.clear();
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Disciplina", "Curso"};
        
        professor.setPesquisar(fld_pesquisa.getText());
        try {
            conexao.executaSql("SELECT nome FROM professor WHERE nome LIKE'%" + professor.getPesquisar() + "%'");
            conexao.rs.first();
            professor.setNome(conexao.rs.getString("nome"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o professor!!" + ex);
        }
        professorPesquisado = professor.getNome();
        fld_nome_professor.setText(professorPesquisado);
        
        disciplina.setPesquisar(professorPesquisado);
        try {
            conexao.executaSql("SELECT nome FROM disciplina WHERE professores LIKE'%" + professorPesquisado + "%'");
            while(conexao.rs.next()){
                disciplina.setNome(conexao.rs.getString("nome"));
                disciplinas.add(disciplina.getNome());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar as dsiciplinas!!" + ex);
        }
                
        int i = 0;
        do {
            lista = new ArrayList<>();
            curso.setPesquisar(disciplinas.get(i));
            try {
                conexao.executaSql("SELECT nome FROM curso WHERE disciplinas LIKE'%" + disciplinas.get(i) + "%'");
                while(conexao.rs.next()){
                    curso.setNome(conexao.rs.getString("nome"));
                    lista.add(curso.getNome());
                }
                dados.add(new Object[]{disciplinas.get(i), lista});
                i++;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar os cursos!!" + ex);
            }
        }while(i < disciplinas.size());
        
        conexao.Desconecta();
        
        TabelaModelo tabela = new TabelaModelo(dados, colunas);
        tbl_consulta_professor.setModel(tabela);
        tbl_consulta_professor.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_consulta_professor.getColumnModel().getColumn(0).setResizable(true);
        tbl_consulta_professor.getColumnModel().getColumn(1).setPreferredWidth(400);
        tbl_consulta_professor.getColumnModel().getColumn(1).setResizable(true);
        tbl_consulta_professor.getTableHeader().setReorderingAllowed(false);
        tbl_consulta_professor.setAutoResizeMode(tbl_consulta_professor.AUTO_RESIZE_OFF);
        tbl_consulta_professor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                      
    }//GEN-LAST:event_btn_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_menu_principal;
    private javax.swing.JTextField fld_nome_professor;
    private javax.swing.JTextField fld_pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_consulta_professor;
    // End of variables declaration//GEN-END:variables
}
