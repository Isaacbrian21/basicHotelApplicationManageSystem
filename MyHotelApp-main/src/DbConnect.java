import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public  static Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WINDSORHOTEL",
                    "root",
                    "Ib812290"); //ESTA SENHA ESTÁ ERRADA
            System.out.println("Connected");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println(e);

        }
        return connection;
    }
}
