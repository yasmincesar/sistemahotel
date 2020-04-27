
package DAOHotel;

import factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Conta;


public class Contad extends AbstractTableModel{

    private List<model.Conta> dados;
    private String[] colunas = {"Serv","Preco","Cod"};
    private final Connection connection;

     public Contad(){ 
        this.dados = new ArrayList<>();
        this.connection = new Factory().getConnection();
    } 
     
     public void adiciona(Conta conta){ 
        String sql = "INSERT INTO serviços (serv, preco_serviço, cod_serv) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, conta.getServ());
            stmt.setString(2, conta.getPreco());
            stmt.setString(3, conta.getCod());
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
                return dados.get(linha).getServ();
            case 1:
                return dados.get(linha).getPreco();
            case 2: 
                return dados.get(linha).getCod();
        
        }
        
        return null;
        
    }
    
    public void addRow(model.Conta c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

   
}