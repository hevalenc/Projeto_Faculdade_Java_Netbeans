package Gestao.Controle;

import Gestao.Modelos.Disciplina;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleDisciplina {
    
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    Disciplina disciplina = new Disciplina();
    
    public void Salvar(Disciplina disciplina){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "INSERT INTO disciplina (nome, carga_horaria, professores) values (?, ?, ?)");
            
            pst.setString(1, disciplina.getNome());
            pst.setInt(2, disciplina.getCargaHoraria());
            pst.setString(3, disciplina.getProfessores());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Editar(Disciplina disciplina){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "UPDATE disciplina SET nome=?, carga_horaria=?, professores=? WHERE codigo=?");
            
            pst.setString(1, disciplina.getNome());
            pst.setInt(2, disciplina.getCargaHoraria());
            pst.setString(3, disciplina.getProfessores());
            pst.setInt(4, disciplina.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Excluir(Disciplina disciplina){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM disciplina WHERE codigo=?");
            pst.setInt(1, disciplina.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public Disciplina PesquisarDisciplina(Disciplina disciplina){
        
        conexao.Conecta();
        
        conexao.executaSql("SELECT * FROM disciplina WHERE nome LIKE'%" + disciplina.getPesquisar() + "%'");
        try {
            conexao.rs.first();
            disciplina.setCodigo(conexao.rs.getInt("codigo"));
            disciplina.setNome(conexao.rs.getString("nome"));
            disciplina.setCargaHoraria(conexao.rs.getInt("carga_horaria"));
            disciplina.setProfessores(conexao.rs.getString("professores"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o aluno!!" + ex);
        }
                
        conexao.Desconecta();
        return disciplina;
    }
}
