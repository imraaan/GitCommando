package imran.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost:3306/ecommerce_cart?user=root&password=root&useUnicode=true&characterEncoding=UTF-8";
            connection=DriverManager.getConnection(connectionString);
            System.out.print("connected");
        }
        return connection;
    }
}