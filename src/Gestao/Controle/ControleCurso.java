package Gestao.Controle;

import Gestao.Modelos.Curso;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleCurso {
    
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    Curso curso = new Curso();
    
    public void Salvar(Curso curso){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "INSERT INTO curso (nome, duracao, disciplinas) values (?, ?, ?)");
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDuracao());
            pst.setString(3, curso.getDisciplinas());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Editar(Curso curso){
        
        conexao.Conecta();
        
         try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "UPDATE curso SET nome=?, duracao=?, disciplinas=? WHERE codigo=?");
            
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDuracao());
            pst.setString(3, curso.getDisciplinas());
            pst.setInt(4, curso.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Excluir(Curso curso){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM curso WHERE codigo=?");
            pst.setInt(1, curso.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public Curso PesquisarCurso(Curso curso){
        
        conexao.Conecta();
        
        conexao.executaSql("SELECT * FROM curso WHERE nome LIKE'%" + curso.getPesquisar() + "%'");
        try {
            conexao.rs.first();
            curso.setCodigo(conexao.rs.getInt("codigo"));
            curso.setNome(conexao.rs.getString("nome"));
            curso.setDuracao(conexao.rs.getString("duracao"));
            curso.setDisciplinas(conexao.rs.getString("disciplinas"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o aluno!!" + ex);
        }
                
        conexao.Desconecta();
        return curso;
    }
}
