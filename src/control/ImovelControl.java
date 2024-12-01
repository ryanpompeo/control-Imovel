package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.ImovelDAO;
import model.Imovel;

public class ImovelControl {

//   adiciona na array, trocas veiculo pelo objeto do Imovel
    public void addImovel(int id, double precoDiaria, String descricao, String tipo) throws ClassNotFoundException, SQLException {
        Imovel imovel = new Imovel(id, precoDiaria, descricao, tipo);
        ImovelDAO imovelDao = new ImovelDAO();
        imovelDao.addImovel(imovel);
    }

    //remove
    public void remove(int id) throws ClassNotFoundException, SQLException {
        ImovelDAO imovelDAO = new ImovelDAO();
        imovelDAO.removeImovel(id);
    }
    
    //buscar apenas
    public ArrayList<Imovel> searchImovel() throws ClassNotFoundException, SQLException {
        ImovelDAO imovelDao = new ImovelDAO();
        return (imovelDao.buscarImovel());
    }

    
    //Busca objeto pela entra no campo
    public ArrayList<Imovel> buscarTipo(String tipoBuscar) throws ClassNotFoundException, SQLException {
        ImovelDAO imovelDao = new ImovelDAO();
        return (imovelDao.buscarTipo(tipoBuscar));
    }

}