

package DAOHotel;

import factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CadFu;


public class CadastroFuncionario extends AbstractTableModel{

    private List<model.CadFu> dados;
    private String[] colunas = {"Nome","Telefone","CPF"};
    private final Connection connection;

     public CadastroFuncionario(){ 
        this.dados = new ArrayList<>();
        this.connection = new Factory().getConnection();
    } 
     
     public void adiciona(CadFu cadFu){ 
        String sql = "INSERT INTO funcionario (nome_fun_1, telefone_fun_1, cpf_fun_1) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadFu.getNome());
            stmt.setString(2, cadFu.getTelefone());
            stmt.setString(3, cadFu.getCPF ());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getTelefone();
            case 2: 
                return dados.get(linha).getCPF();
           
        }
        
        return null;
        
    }
    
    public void addRow(model.CadFu c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

   /* public void addRow(CadFu c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   */
}