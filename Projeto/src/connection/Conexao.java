package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexandre / Elias / Elzio
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/cl18462";
        String usuario = "cl18462";
        String senha = "cl*19101999";
        try{
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException ex){
            throw new RuntimeException("Erro de conexão", ex);
        }
    }
}
