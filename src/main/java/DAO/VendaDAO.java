
package DAO;

import bean.Venda;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class VendaDAO {
    public void inserir(Venda venda) {
        String sql = "INSERT INTO venda (dataVenda, desconto, id_cliente, id_funcionario, valor_total) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1,venda.getDataVenda());
            stmt.setDouble(2,venda.getDesconto());
            stmt.setInt(3, venda.getId_cliente());
            stmt.setInt(4, venda.getId_funcionario());
            stmt.setDouble(5, venda.getDesconto());
              
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar venda " + e.getMessage());
        }
    }
     public void excluirVenda(int idVenda) { String sql = "DELETE FROM venda WHERE id_venda = ?"; 
     try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) { stmt.setInt(1, idVenda); 
             int linhasAfetadas = stmt.executeUpdate(); 
             if (linhasAfetadas > 0) { JOptionPane.showMessageDialog( null, "Venda excluída com sucesso!" );
             } else { JOptionPane.showMessageDialog( null, "Venda não encontrada!" ); 
             } 
     } catch (SQLException e) { e.printStackTrace(); JOptionPane.showMessageDialog( null, "Erro ao excluir venda: " + e.getMessage() ); } 
   }
    
}
