public class Hotel {

    //region Declarações

    private String id;
    private String title;
    private Integer stars;
    private double rating;
    //endregion


    //region Atributos
    public  Hotel(String id, String title, Integer stars, Double rating, Double price){
        this.id = "1";
        this.title = "Windsor Hotel";
        this.stars = 5;
        this.rating = 9.8;
    }

    //endregion

    //region Getters
    public String getId(){
        return  id;
    }
    public String getTitle(){
        return  title;
    }
    public Integer getStars(){
        return stars;
    }
    public Double getRating(){
        return rating;
    }

    //endregion


    //region Setters
        public  void  setId(String id){
            this.id = id;
        }
        public  void setTitle(String title){
        this.title = title;
        }

        public  void  setStars(Integer stars){
        this.stars = stars;
        }
        public  void setRating(Double rating){
        this.rating= rating;
        }
    //endregion
}
