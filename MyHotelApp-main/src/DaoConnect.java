import java.sql.*;

public class DaoConnect {
    public  static void main(String[]args){
        Connection connection = DbConnect.getConnection();

        try {
            Statement statement = connection.createStatement();
            //region Criando tabela de Hotel
            statement.execute("CREATE TABLE IF NOT EXISTS ROOMS(id VARCHAR(1), " +
                    "name VARCHAR(35)," +
                    "stars INTEGER(1)," +
                    "rating DOUBLE," +
                    "price DOUBLE)");

            Rooms quarto = new Rooms("1","Duplo Superior", 2, 7.7, 342.0);
            Rooms quarto2 = new Rooms("2","Suite Junior", 3, 8.0, 942.0);
            Rooms quarto3 = new Rooms("3","Suite Master", 4, 8.1, 1342.0);
            Rooms quarto4 = new Rooms("4","Suite Premium", 4, 8.9, 2342.0);
            Rooms quarto5 = new Rooms("5","Suite Presidencial", 5, 9.9, 7342.0);

            // quartos
            PreparedStatement insertRoom = connection.prepareStatement(
                    "INSERT INTO ROOMS(id, name, stars, rating, price)VALUES(?, ?, ?, ?, ?)");
            insertRoom.setString(1, quarto.getId());
            insertRoom.setString(2, quarto.getName());
            insertRoom.setInt(3, quarto.getStars());
            insertRoom.setDouble(4, quarto.getRating());
            insertRoom.setDouble(5, quarto.getPrice());
            //insertRoom.execute();
            //endregion


            //chamando os itens da tabela de quartos para instanciá-los
            RoomsRent quarto1 = new RoomsRent(1, "Duplo Superior", 0, 342.2);
            PreparedStatement showResevation = connection.prepareStatement("SELECT * FROM RESERVAS");
            ResultSet allresevation = showResevation.executeQuery();


            System.out.println("*************************************************************");
            System.out.println("*************************************************************");
            System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");

            while (allresevation.next()){
                Integer id = allresevation.getInt("id");
                String name = allresevation.getString("name");
                Integer dias = allresevation.getInt("dias");
                Double price = allresevation.getDouble("price");




                RoomsRent resevation = new RoomsRent(id, name, dias, price);
                System.out.println(resevation.toString());
                System.out.println("_____________________________________________________________");
            }
            System.out.println("*************************************************************");
            System.out.println("*************************************************************");
            System.out.println("*************************************************************");


            //region Criando tabela de reservas
            statement.execute("CREATE TABLE IF NOT EXISTS RESERVAS(id VARCHAR(1), " +
                    "name VARCHAR(30)," +
                    "dias INTEGER(2)," +
                    "price DOUBLE)");
        } catch (SQLException e) {
           System.out.println(e);
        }
    }
}
