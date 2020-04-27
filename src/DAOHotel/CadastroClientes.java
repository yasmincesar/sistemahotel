
package DAOHotel;

import factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CadastroCli;


public class CadastroClientes extends AbstractTableModel{

    private List<model.CadastroCli> dados;
    private String[] colunas = {"Nome","Telefone","Selecionar","Cod"};
    private final Connection connection;

     public CadastroClientes(){ 
        this.dados = new ArrayList<>();
        this.connection = new Factory().getConnection();
    } 
     
     public void adiciona(CadastroCli cadastrocli){ 
        String sql = "INSERT INTO cliente (nome_cli_1, telefone_cli_1, selecionar_1, cod_quarto_1) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastrocli.getNome());
            stmt.setString(2, cadastrocli.getTelefone());
            stmt.setString(3, cadastrocli.getNumquartos());
            stmt.setString(4, cadastrocli.getTipos());
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

   
}