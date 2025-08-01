package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://mysql-connection/meubanco";
    private static final String user = "root";
    private static final String password = "12345678";

    private static Connection conn;

    public static Connection getConexao(){
        try{
            if (conn == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
}
