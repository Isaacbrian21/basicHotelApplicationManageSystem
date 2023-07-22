import java.sql.*;
import java.util.Scanner;

public class Actions {
    public static void main(String[] args) throws SQLException {
        //region ALL DECLARATIONS
        Hotel hotel = new Hotel("1", "Windsor", 5, 9.8, 0.);
        RoomsRent quarto = new RoomsRent(1, "Duplo Superior", 0, 342.5);
        RoomsRent quarto2 = new RoomsRent(2, "Suite Junior", 0, 942.5);
        RoomsRent quarto3 = new RoomsRent(3, "Suite Master", 0, 1342.5);
        RoomsRent quarto4 = new RoomsRent(4, "Suite Premium", 0, 2342.5);
        RoomsRent quarto5 = new RoomsRent(5, "Suite Presidencial", 0, 7342.5);
        //endregion

        // First step - MENU
        Scanner ask = new Scanner(System.in);
        Scanner dia = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo a área de reservas de quartos do " + hotel.getTitle());
        System.out.println("Escolha a opção desejada de acordo com os números abaixo");
        System.out.println("Digite 1 para reservar um quarto");
        System.out.println("Digite 2 para cancelar uma reserva");
        System.out.println("Digite 3 para ver o extrato de reservas");
        System.out.println("Digite 4 para sair");
        int escolha = ask.nextInt();
        if (escolha == 1) {
            System.out.println("Escolha a quantidade de dias em que deseja se hospedar em "
                    + hotel.getTitle());
            Integer diaria = dia.nextInt();
            System.out.println("Agora escolha o quarto desejado");
            System.out.println("1 - " + quarto.getName());
            System.out.println("2 - " + quarto2.getName());
            System.out.println("3 - " + quarto3.getName());
            System.out.println("4 - " + quarto4.getName());
            System.out.println("5 - " + quarto5.getName());
            int escolha2 = ask.nextInt();
            if (escolha2 == 1) {
                quarto.reservar(diaria);
                System.out.println("Boaaa!!!");
                System.out.println("O quarto " + quarto.getName() + " foi reservado por " + quarto.getDias() +
                        " dias." +
                        "Sua conta total ficou no valor de R$" + quarto.getTotalPrice());

                Connection connection = DbConnect.getConnection();

                try {
                    Statement reserva1 = connection.createStatement();
                    reserva1.execute("INSERT INTO RESERVAS(id, name, dias, price)VALUES(" +
                            "'" + quarto.getId() + "'" + "," +
                            "'" + quarto.getName() + "'" + "," +
                            quarto.getDias() + ", " +
                            quarto.getTotalPrice() + "" +
                            ")");

                } catch (SQLException e) {
                    System.out.println("Aconteceu isso " + e);
                }

            } else if (escolha2 == 2) {
                quarto2.reservar(diaria);
                System.out.println("Boaaa!!!");
                System.out.println("O quarto " + quarto2.getName() + " foi reservado por " + quarto2.getDias() +
                        " dias." +
                        "Sua conta total ficou no valor de R$" + quarto2.getTotalPrice());
                Connection connection = DbConnect.getConnection();

                try {
                    Statement reserva2 = connection.createStatement();
                    reserva2.execute("INSERT INTO RESERVAS(id, name, dias, price)VALUES(" +
                            "'" + quarto2.getId() + "'" + "," +
                            "'" + quarto2.getName() + "'" + "," +
                            quarto2.getDias() + ", " +
                            quarto2.getTotalPrice() + "" +
                            ")");

                } catch (SQLException e) {
                    System.out.println("Aconteceu isso " + e);
                }


            } else if (escolha2 == 3) {
                quarto3.reservar(diaria);
                System.out.println("Boaaa!!!");
                System.out.println("O quarto " + quarto3.getName() + " foi reservado por " + quarto3.getDias() +
                        " dias." +
                        "Sua conta total ficou no valor de R$" + quarto3.getTotalPrice());
                Connection connection = DbConnect.getConnection();

                try {
                    Statement reserva3 = connection.createStatement();
                    reserva3.execute("INSERT INTO RESERVAS(id, name, dias, price)VALUES(" +
                            "'" + quarto3.getId() + "'" + "," +
                            "'" + quarto3.getName() + "'" + "," +
                            quarto3.getDias() + ", " +
                            quarto3.getTotalPrice() + "" +
                            ")");

                } catch (SQLException e) {
                    System.out.println("Aconteceu isso " + e);
                }

            } else if (escolha2 == 4) {
                quarto4.reservar(diaria);
                System.out.println("Boaaa!!!");
                System.out.println("O quarto " + quarto4.getName() + " foi reservado por " + quarto4.getDias() +
                        " dias." +
                        "Sua conta total ficou no valor de R$" + quarto4.getTotalPrice());
                Connection connection = DbConnect.getConnection();

                try {
                    Statement reserva4 = connection.createStatement();
                    reserva4.execute("INSERT INTO RESERVAS(id, name, dias, price)VALUES(" +
                            "'" + quarto4.getId() + "'" + "," +
                            "'" + quarto4.getName() + "'" + "," +
                            quarto4.getDias() + ", " +
                            quarto4.getTotalPrice() + "" +
                            ")");

                } catch (SQLException e) {
                    System.out.println("Aconteceu isso " + e);
                }

            } else if (escolha2 == 5) {
                quarto5.reservar(diaria);
                System.out.println("Boaaa!!!");
                System.out.println("O quarto " + quarto5.getName() + " foi reservado por " + quarto5.getDias() +
                        " dias." +
                        "Sua conta total ficou no valor de R$" + quarto5.getTotalPrice());
                Connection connection = DbConnect.getConnection();

                try {
                    Statement reserva5 = connection.createStatement();
                    reserva5.execute("INSERT INTO RESERVAS(id, name, dias, price)VALUES(" +
                            "'" + quarto5.getId() + "'" + "," +
                            "'" + quarto5.getName() + "'" + "," +
                            quarto5.getDias() + ", " +
                            quarto5.getTotalPrice() + "" +
                            ")");

                } catch (SQLException e) {
                    System.out.println("Aconteceu isso " + e);
                }

            }
        } else if (escolha == 2) {
            System.out.println("Escolha através da lista qual reserva irá cancelar");
            Connection connection1 = DbConnect.getConnection();
            PreparedStatement showResevation1 = connection1.prepareStatement("SELECT * FROM RESERVAS");
            ResultSet allresevation1 = showResevation1.executeQuery();
            System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
            while (allresevation1.next()) {
                Integer id = allresevation1.getInt("id");
                String name = allresevation1.getString("name");
                Integer dias = allresevation1.getInt("dias");
                Double price = allresevation1.getDouble("price");

                RoomsRent resevation = new RoomsRent(id, name, dias, price);
            Connection connection = DbConnect.getConnection();
            PreparedStatement showResevation = connection.prepareStatement("SELECT * FROM RESERVAS");
            ResultSet allresevation = showResevation.executeQuery();

            System.out.println(resevation.toString());
                 }

            Scanner delete = new Scanner(System.in);
            Integer cancel = delete.nextInt();
            if (cancel == 1) {
                quarto.cancelarReserva();
                Connection connection = DbConnect.getConnection();
                try {
                    Statement cancelar1 = connection.createStatement();
                    cancelar1.execute("DELETE FROM RESERVAS WHERE id = 1");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Reserva cancelada");
                System.out.println("Veja a lista atualizada");

                Connection connection2 = DbConnect.getConnection();
                PreparedStatement showResevation2 = connection1.prepareStatement("SELECT * FROM RESERVAS");
                ResultSet allresevation2 = showResevation1.executeQuery();
                System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
                while (allresevation2.next()) {
                    Integer id = allresevation2.getInt("id");
                    String name = allresevation2.getString("name");
                    Integer dias = allresevation2.getInt("dias");
                    Double price = allresevation2.getDouble("price");

                    RoomsRent resevation = new RoomsRent(id, name, dias, price);
                    System.out.println(resevation.toString());
                }


            } else if (cancel == 2) {
                quarto2.cancelarReserva();

                Connection connection = DbConnect.getConnection();
                try {
                    Statement cancelar2 = connection.createStatement();
                    cancelar2.execute("DELETE FROM RESERVAS WHERE id = 2");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Reserva cancelada");
                System.out.println("Veja a lista atualizada");

                Connection connection2 = DbConnect.getConnection();
                PreparedStatement showResevation2 = connection1.prepareStatement("SELECT * FROM RESERVAS");
                ResultSet allresevation2 = showResevation1.executeQuery();
                System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
                while (allresevation2.next()) {
                    Integer id = allresevation2.getInt("id");
                    String name = allresevation2.getString("name");
                    Integer dias = allresevation2.getInt("dias");
                    Double price = allresevation2.getDouble("price");

                    RoomsRent resevation = new RoomsRent(id, name, dias, price);
                    System.out.println(resevation.toString());


                }


            } else if (cancel == 3) {
                quarto3.cancelarReserva();



                Connection connection = DbConnect.getConnection();
                try {
                    Statement cancelar3 = connection.createStatement();
                    cancelar3.execute("DELETE FROM RESERVAS WHERE id = 3");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Reserva cancelada");
                System.out.println("Veja a lista atualizada");

                Connection connection2 = DbConnect.getConnection();
                PreparedStatement showResevation2 = connection1.prepareStatement("SELECT * FROM RESERVAS");
                ResultSet allresevation2 = showResevation1.executeQuery();
                System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
                while (allresevation2.next()) {
                    Integer id = allresevation2.getInt("id");
                    String name = allresevation2.getString("name");
                    Integer dias = allresevation2.getInt("dias");
                    Double price = allresevation2.getDouble("price");

                    RoomsRent resevation = new RoomsRent(id, name, dias, price);
                    System.out.println(resevation.toString());


                }

            } else if (cancel == 4) {
                quarto4.cancelarReserva();

                Connection connection = DbConnect.getConnection();
                try {
                    Statement cancelar4 = connection.createStatement();
                    cancelar4.execute("DELETE FROM RESERVAS WHERE id = 4");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Reserva cancelada");
                System.out.println("Veja a lista atualizada");

                Connection connection2 = DbConnect.getConnection();
                PreparedStatement showResevation2 = connection1.prepareStatement("SELECT * FROM RESERVAS");
                ResultSet allresevation2 = showResevation1.executeQuery();
                System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
                while (allresevation2.next()) {
                    Integer id = allresevation2.getInt("id");
                    String name = allresevation2.getString("name");
                    Integer dias = allresevation2.getInt("dias");
                    Double price = allresevation2.getDouble("price");

                    RoomsRent resevation = new RoomsRent(id, name, dias, price);
                    System.out.println(resevation.toString());

            }
            } else if (cancel == 5) {
                quarto5.cancelarReserva();


                Connection connection = DbConnect.getConnection();
                try {
                    Statement cancelar5 = connection.createStatement();
                    cancelar5.execute("DELETE FROM RESERVAS WHERE id = 5");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Reserva cancelada");
                System.out.println("Veja a lista atualizada");

                Connection connection2 = DbConnect.getConnection();
                PreparedStatement showResevation2 = connection1.prepareStatement("SELECT * FROM RESERVAS");
                ResultSet allresevation2 = showResevation1.executeQuery();
                System.out.println("******************* RESERVAS WINDSOR HOTEL ******************");
                while (allresevation2.next()) {
                    Integer id = allresevation2.getInt("id");
                    String name = allresevation2.getString("name");
                    Integer dias = allresevation2.getInt("dias");
                    Double price = allresevation2.getDouble("price");

                    RoomsRent resevation = new RoomsRent(id, name, dias, price);
                    System.out.println(resevation.toString());

            }
            }else {

                System.out.println("Erro ao captar a resposta");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Escolha errada ou incompatível com nosso banco de dados");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Tentando conectar...");
                System.out.println();
                System.out.println("...");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("...");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Conectando...");
                System.out.println("Certo!");
                System.out.println("Por favor recomece o menu");
                System.out.println();
            }
        }
            else if (escolha == 3) {
            Connection connection = DbConnect.getConnection();
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

        } else if (escolha == 4) {
            System.out.println("Agradeçemos a sua visita");
        }
     //      Movimentacao movimentacao = new Movimentacao("Reserva", quarto4.getTotalPrice(), quarto4.getDias());
    //    System.out.println("*******************************************************");
     //   System.out.println(movimentacao.toString());

   }



}
