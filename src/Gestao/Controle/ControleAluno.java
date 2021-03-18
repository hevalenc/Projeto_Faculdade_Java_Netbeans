package Gestao.Controle;

import Gestao.Modelos.Aluno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleAluno {
    
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    Aluno aluno = new Aluno();
    
    public void Salvar(Aluno aluno){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "INSERT INTO aluno (nome, cpf, curso) values (?, ?, ?)");
            
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getCpf());
            pst.setString(3, aluno.getCurso());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Editar(Aluno aluno){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "UPDATE aluno SET nome=?, cpf=?, curso=? WHERE matricula=?");
            
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getCpf());
            pst.setString(3, aluno.getCurso());
            pst.setInt(4, aluno.getMatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Excluir(Aluno aluno){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM aluno WHERE matricula=?");
            pst.setInt(1, aluno.getMatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public Aluno PesquisarAluno(Aluno aluno){
        
        conexao.Conecta();
        
        conexao.executaSql("SELECT * FROM aluno WHERE nome LIKE'%" + aluno.getPesquisar() + "%'");
        try {
            conexao.rs.first();
            aluno.setMatricula(conexao.rs.getInt("matricula"));
            aluno.setNome(conexao.rs.getString("nome"));
            aluno.setCpf(conexao.rs.getString("cpf"));
            aluno.setCurso(conexao.rs.getString("curso"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o aluno!!" + ex);
        }
                
        conexao.Desconecta();
        return aluno;
    }
}
