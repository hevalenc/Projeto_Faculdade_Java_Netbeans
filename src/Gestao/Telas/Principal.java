package Gestao.Telas;

import Gestao.Controle.ConexaoBancoDados;

public class Principal extends javax.swing.JFrame {

    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        conexao.Conecta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cadastro_professor = new javax.swing.JButton();
        btn_cadastro_aluno = new javax.swing.JButton();
        btn_cadastro_curso = new javax.swing.JButton();
        btn_cadastro_disciplina = new javax.swing.JButton();
        btn_disciplina_professor = new javax.swing.JButton();
        btn_disciplina_aluno = new javax.swing.JButton();
        btn_desligar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACULDADES INTEGRADAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cadastro_professor.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastro_professor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastro_professor.setText("CADASTRO PROFESSOR");
        btn_cadastro_professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_cadastro_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastro_professorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro_professor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, 50));

        btn_cadastro_aluno.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastro_aluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cadastro_aluno.setText("CADASTRO ALUNO");
        btn_cadastro_aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_cadastro_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastro_alunoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 200, 50));

        btn_cadastro_curso.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastro_curso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastro_curso.setText("CADASTRO CURSO");
        btn_cadastro_curso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_cadastro_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastro_cursoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 50));

        btn_cadastro_disciplina.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastro_disciplina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cadastro_disciplina.setText("CADASTRO DISCIPLINA");
        btn_cadastro_disciplina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_cadastro_disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastro_disciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro_disciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 200, 50));

        btn_disciplina_professor.setBackground(new java.awt.Color(255, 255, 255));
        btn_disciplina_professor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_disciplina_professor.setText("CONSULTAR DISCIPLINAS POR PROFESSOR");
        btn_disciplina_professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_disciplina_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_disciplina_professorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_disciplina_professor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 460, 50));

        btn_disciplina_aluno.setBackground(new java.awt.Color(255, 255, 255));
        btn_disciplina_aluno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_disciplina_aluno.setText("CONSULTAR DISCIPLINAS POR ALUNO");
        btn_disciplina_aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_disciplina_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_disciplina_alunoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_disciplina_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 460, 50));

        btn_desligar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestao/Imagens/desligar_0.png"))); // NOI18N
        btn_desligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desligarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_desligar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestao/Imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 5, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("SISTEMA DE GESTÃO UNIVERSITÁRIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MENU PRINCIPAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestao/Imagens/background_escola.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastro_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastro_cursoActionPerformed
        
        CadastroCurso curso = new CadastroCurso();
        curso.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_cadastro_cursoActionPerformed

    private void btn_cadastro_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastro_professorActionPerformed
        
        CadastroProfessor professor = new CadastroProfessor();
        professor.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_cadastro_professorActionPerformed

    private void btn_cadastro_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastro_alunoActionPerformed
        
        CadastroAluno aluno = new CadastroAluno();
        aluno.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_cadastro_alunoActionPerformed

    private void btn_cadastro_disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastro_disciplinaActionPerformed
        
        CadastroDisciplina disciplina = new CadastroDisciplina();
        disciplina.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_cadastro_disciplinaActionPerformed

    private void btn_desligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desligarActionPerformed
        
        conexao.Desconecta();
        System.exit(0);
        
    }//GEN-LAST:event_btn_desligarActionPerformed

    private void btn_disciplina_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_disciplina_professorActionPerformed
        
        ConsultaProfessor consulta_professor = new ConsultaProfessor();
        consulta_professor.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_disciplina_professorActionPerformed

    private void btn_disciplina_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_disciplina_alunoActionPerformed
        
        ConsultaAluno consulta_aluno = new ConsultaAluno();
        consulta_aluno.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_disciplina_alunoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro_aluno;
    private javax.swing.JButton btn_cadastro_curso;
    private javax.swing.JButton btn_cadastro_disciplina;
    private javax.swing.JButton btn_cadastro_professor;
    private javax.swing.JButton btn_desligar;
    private javax.swing.JButton btn_disciplina_aluno;
    private javax.swing.JButton btn_disciplina_professor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
