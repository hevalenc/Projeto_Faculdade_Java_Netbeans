package Gestao.Controle;

import java.sql.*;
import javax.swing.JOptionPane;
        
public class ConexaoBancoDados {
    
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/SoftGestaoJava";
    private String usuario = "postgres";
    private String senha = "12345";
    
    public void Conecta(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados: " + ex.getMessage());
        }
    }
    
    public void executaSql(String sql) {
        
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao executar o SQL: " + ex.getMessage());
        }
    }
    
    public void Desconecta(){
        
        try {
            con.close();
            //JOptionPane.showMessageDialog(null,"Desconexão realizada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com o banco de dados:\n" + ex.getMessage());
        }
    }
}
