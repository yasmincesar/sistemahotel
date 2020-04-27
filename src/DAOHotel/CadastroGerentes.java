
package DAOHotel;

import factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CadastroGe;


public class CadastroGerentes extends AbstractTableModel{

    private List<model.CadastroCli> dados;
    private String[] colunas = {"Nome","Endereco","ID","Telefone"};
    private final Connection connection;

     public CadastroGerentes(){ 
        this.dados = new ArrayList<>();
        this.connection = new Factory().getConnection();
    } 
     
     public void adiciona(CadastroGe cadastroge){ 
        String sql = "INSERT INTO gerente (nome_g_1, endereco_g_1, id_1, telefone_g_1) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastroge.getNomeg());
            stmt.setString(2, cadastroge.getEndereco());
            stmt.setString(3, cadastroge.getID());
            stmt.setString(4, cadastroge.getTelefone());
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
                return dados.get(linha).getNumquartos();
            case 3: 
                return dados.get(linha).getTipos();
        }
        
        return null;
        
    }
    
    public void addRow(model.CadastroCli c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public void addRow(CadastroGe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}