package Gestao.Controle;

import Gestao.Modelos.Professor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleProfessor {
    
    ConexaoBancoDados conexao = new ConexaoBancoDados();
    
    Professor professor = new Professor();
    
    public void Salvar(Professor professor){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "INSERT INTO professor (nome, endereco, telefone, cpf, salario, titulacao, area_pesquisa) values (?, ?, ?, ?, ?, ?, ?)");
            
            pst.setString(1, professor.getNome());
            pst.setString(2, professor.getEndereco());
            pst.setString(3, professor.getTelefone());
            pst.setString(4, professor.getCpf());
            pst.setString(5, professor.getSalario());
            pst.setString(6, professor.getTitulacao());
            pst.setString(7, professor.getAreaPesquisa());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Editar(Professor professor){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement(
                    "UPDATE professor SET nome=?, endereco=?, telefone=?, cpf=?, salario=?, titulacao=?, area_pesquisa=? WHERE codigo=?");
                        
            pst.setString(1, professor.getNome());
            pst.setString(2, professor.getEndereco());
            pst.setString(3, professor.getTelefone());
            pst.setString(4, professor.getCpf());
            pst.setString(5, professor.getSalario());
            pst.setString(6, professor.getTitulacao());
            pst.setString(7, professor.getAreaPesquisa());
            pst.setInt(8, professor.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public void Excluir(Professor professor){
        
        conexao.Conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM professor WHERE codigo=?");
            pst.setInt(1, professor.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!!" + ex);
        }
        
        conexao.Desconecta();
    }
    
    public Professor PesquisarProfessor (Professor professor){
     
        conexao.Conecta();
        
        conexao.executaSql("SELECT * FROM professor WHERE nome LIKE'%" + professor.getPesquisar() + "%'");
        try {
            conexao.rs.first();
            professor.setCodigo(conexao.rs.getInt("codigo"));
            professor.setNome(conexao.rs.getString("nome"));
            professor.setEndereco(conexao.rs.getString("endereco"));
            professor.setTelefone(conexao.rs.getString("telefone"));
            professor.setCpf(conexao.rs.getString("cpf"));
            professor.setSalario(conexao.rs.getString("salario"));
            professor.setTitulacao(conexao.rs.getString("titulacao"));
            professor.setAreaPesquisa(conexao.rs.getString("area_pesquisa"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o professor!!" + ex);
        }
        
        conexao.Desconecta();
        return professor;
    }
    
}
