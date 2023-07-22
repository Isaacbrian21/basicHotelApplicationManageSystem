import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public  class RoomsRent {
        //region declarações
    private Integer id;
    private   String name;
    private boolean disp;
    private Integer dias;
    public  double price;
    public double totalPrice;
    public  Integer minDias = 1;
    //endregion

        //region Constructor
    public RoomsRent(Integer id, String name,Integer dias, double price){
        this.id = id;
        this.name = name;
        this.dias = dias;
        this.price = price;
    }
    //endregion

        //region Getters
    public Integer getId(){
        return  id;
    }
    public  String getName(){
        return name;

    }
    public Integer getDias(){
        return dias;
    }
    public double getPrice(){
        return price;
    }
    public double getTotalPrice(){
        return totalPrice = dias*price;
    }
    //endregion

        //region Setters
    public  void  setId(Integer id){
        this.id = id;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setDias(Integer dias){
        this.dias=dias;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public  double setTotalPrice(double totalPrice) {
        this.totalPrice = dias*price;
        return totalPrice;
    }
        //endregion

        //region Metodos
    public  void reservar(Integer valor){
        if (valor < minDias){
        throw new InputMismatchException("O número mínimo para diarias é " + minDias);
        }
        this.dias = this.dias + valor;
        this.disp = false;

    }

    public  void cancelarReserva(){
        this.dias = this.dias - this.dias;
        this.disp = true;

    }
    @Override
    public String toString(){
        return this.getId() + ") " + this.getName() + "" +
                " reservado por " + this.getDias() + " dias" +
                " com o preço de R$" + this.getTotalPrice();
    }
    //endregion
}
