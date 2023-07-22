import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     //region Instanciando classes
        Hotel hotel = new Hotel("1","Windsor",5, 9.8, 0.);
        Rooms quarto = new Rooms("1","Duplo Superior", 2, 7.7, 342.2);
        Rooms quarto2 = new Rooms("2","Suite Junior", 3, 8.0, 942.2);
        Rooms quarto3 = new Rooms("3","Suite Master", 4, 8.1, 1342.2);
        Rooms quarto4 = new Rooms("4","Suite Premium", 4, 8.9, 2342.2);
        Rooms quarto5 = new Rooms("5","Suite Presidencial", 5, 9.9, 7342.2);
    //endregion

    System.out.println("Bem vindo ao " + hotel.getTitle());
        System.out.println("Aqui vai nossas informações:");
        System.out.println(hotel.getTitle());
        System.out.println("Classificação: " + hotel.getStars());
        System.out.println("Avaliação dos usuários: " +hotel.getRating());
        System.out.println("Deseja ver nossos quartos ?");
        System.out.println("1 = SIM");
        System.out.println("2 = NÃO");
        Scanner ask = new Scanner(System.in);
        Scanner dia = new Scanner(System.in);
        int escolha = ask.nextInt();
        if(escolha == 1){
            System.out.println("1 - " + quarto.getName());
            System.out.println("2 - " + quarto2.getName());
            System.out.println("3 - " + quarto3.getName());
            System.out.println("4 - " + quarto4.getName());
            System.out.println("5 - " + quarto5.getName());
            System.out.println("Deseja saber mais informações sobre os quartos ?");
            System.out.println("Digite 1 para SIM ou 2 para NÃO");
            int escolha2 = ask.nextInt();
            if (escolha2 == 1){
                System.out.println("1 - Contatos");
                System.out.println("2 - Saber as classificações");
                System.out.println("3 - Consultar preçoes");
                System.out.println("4 - Sair");
                int escolha3 = ask.nextInt();
                if(escolha3 == 1){
                    System.out.println("Para WhatsApp: 21 999320927");
                    System.out.println("Para Email: Windsor.master@outlook.com");
                    System.out.println("Para Ligaçoes convencionais: 21 22334455");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Obrigado, volte sempre ao " + hotel.getTitle());
                } else if (escolha3 == 2) {
                    System.out.println("Classificações dos quartos " + hotel.getTitle());
                    System.out.println("1 - " + quarto.getName() + ": " + quarto.getRating() );
                    System.out.println("2 - " + quarto2.getName() + ": " + quarto2.getRating() );
                    System.out.println("3 - " + quarto3.getName() + ": " + quarto3.getRating() );
                    System.out.println("4 - " + quarto4.getName() + ": " + quarto4.getRating() );
                    System.out.println("5 - " + quarto5.getName() + ": " + quarto5.getRating() );
                    System.out.println();

                } else if (escolha3 == 3) {
                    System.out.println("Preços dos quartos " + hotel.getTitle());
                    System.out.println("1 - " + quarto.getName() + " Com diarias apartir de : R$" + quarto.getPrice() );
                    System.out.println("2 - " + quarto2.getName() + " Com diarias apartir de : R$" + quarto2.getPrice() );
                    System.out.println("3 - " + quarto3.getName() + " Com diarias apartir de : R$" + quarto3.getPrice() );
                    System.out.println("4 - " + quarto4.getName() + " Com diarias apartir de : R$" + quarto4.getPrice() );
                    System.out.println("5 - " + quarto5.getName() + " Com diarias apartir de : R$" + quarto5.getPrice() );
                } else if (escolha3 == 4) {
                    System.out.println("Obrigado, volte sempre ao " + hotel.getTitle());
                }
            }else{
                System.out.println("Obrigado, volte sempre ao " + hotel.getTitle());
            }
        }else {
            System.out.println("Obrigado, volte sempre ao " + hotel.getTitle());

        }
    }
}
