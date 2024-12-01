package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.3:3306/cl203420";
        String usuario = "cl203420";
        String senha = "cl*09082007";
        Class.forName(driver);
        return (Connection) DriverManager.getConnection(url, usuario, senha);
    }

}
