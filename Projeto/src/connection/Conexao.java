
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de Conexão
 * @author Elias /  Elzio
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/cl18462";
        String usuario = "cl18462";
        String senha = "cl*19101999";
        try { // Try-Catch para tratar o retorno do método 'getConnection' da classe DriverManager joga uma excessão
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) { // Tipo de Excessão recebida pelo método 'getConnection'
            throw new RuntimeException("Erro de conexao", ex);
        }
    }
}
