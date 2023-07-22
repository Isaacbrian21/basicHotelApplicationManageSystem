import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoC {
    public static void main(String[] args) {
        Connection connection = DbConnect.getConnection();

        try {
            Statement statement = connection.createStatement();
            //region Criando tabela com o único hotel existente

            statement.execute("CREATE TABLE IF NOT EXISTS HOTEL(" +
                    "id INTEGER, " +
                    "title VARCHAR(30)," +
                    "stars INTEGER(1)," +
                    "rating INTEGER(1))");
            //endregion

            //region Criando tabela com nome dos quartos neste hotel
            statement.execute("CREATE TABLE IF NOT EXISTS ROOMS(" +
                    "id INTEGER(1), " +
                    "name VARCHAR(30)," +
                    "disp BOOLEAN," +
                    "rating INTEGER(10)," +
                    "price DOUBLE )");
            //endregion

            //region Inserindo quartos
            Rooms quarto = new Rooms("1","Quarto duplo", 8, 7.2, 435.0);
            Rooms quarto2 = new Rooms("2","Suite Junior",8, 7.7, 679.0);
            Rooms quarto3 = new Rooms("3", "Suite Executive", 8, 8.1,1065.0);
            Rooms quarto4 = new Rooms("4", "Suite Master", 9, 8.5,1424.0);
            Rooms quarto5 = new Rooms("5", "Suite Presidential", 9, 9.8,7441.0);


            //endregion

            //region Inserindo dados do único hotel existente
            Hotel hotel = new Hotel("1", "Windsor Hotel", 5, 9.9,0.);
            statement.execute("INSERT INTO HOTEL(id, title, stars, rating) VALUES (" +
                   hotel.getId()+ "," +
                    "'" + hotel.getTitle() + "'" +"," +
                    hotel.getStars() +"," +
                    hotel.getRating()+ "" +
                    ")");
            //endregion
        } catch (SQLException err){
            System.out.println(err);
        }
    }
}
