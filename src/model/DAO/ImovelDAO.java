package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Imovel;

public class ImovelDAO {

       Connection con;

    public void addImovel(Imovel imovel) throws ClassNotFoundException, SQLException {
        con = new Conexao().getConnection();
        String sql = "Insert into Imovel(id, precoDiaria, descricao, tipo) values (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, imovel.getId());
        stmt.setDouble(2, imovel.getPrecoDiaria());
        stmt.setString(3, imovel.getDescricao());
        stmt.setString(4, imovel.getTipo());
        stmt.execute();
        stmt.close();
        con.close();

    }
     

    public void removeImovel(int id) throws ClassNotFoundException, SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Imovel WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        con.close();
    }

    public ArrayList<Imovel> buscarImovel() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        ArrayList<Imovel> lista = new ArrayList<>();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Imovel";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            double precoDiaria = rs.getDouble("precoDiaria");
            String descricao  = rs.getString("descricao");
            String tipo = rs.getString("tipo");
            Imovel imovel = new Imovel(id, precoDiaria, descricao, tipo);
            lista.add(imovel);
        }
        stmt.close();
        con.close();
        return lista;
    }
  public ArrayList<Imovel> buscarTipo(String tipoUser) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        ArrayList<Imovel> lista = new ArrayList<>();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Imovel WHERE tipo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, tipoUser);
        rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            double precoDiaria = rs.getDouble("precoDiaria");
            String descricao = rs.getString("descricao");
            String tipo = rs.getString("tipo");

            Imovel veiculo = new Imovel(id, precoDiaria, descricao, tipo);
            lista.add(veiculo);
        }
        stmt.close();
        con.close();
        return lista;
    }



}
    
    
    
    
    


