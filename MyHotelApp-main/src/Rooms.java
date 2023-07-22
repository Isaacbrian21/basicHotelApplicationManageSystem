public class Rooms extends Hotel{
    //region Declarações
    private  String id;
    private String name;
    private Integer stars;
    private  Double rating;
    private Double price;

    public Rooms(String id, String name, Integer stars, Double rating, Double price) {
        super(id, name, stars, rating, price);
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.rating = rating;
        this.price = price;
    }
    //endregion




    //region Getters
    public String getId(){
        return  id;
    }
    public String getName(){
        return  name;
    }
    public Integer getStars(){
        return stars;
}
    public Double getRating(){
        return rating;
    }
    public  Double getPrice(){
        return price;
    }
}
