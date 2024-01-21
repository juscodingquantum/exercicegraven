public class Toy {

    // attribut de la classe Toy
    private String name;
    private int price;
    private String description;
    private int promo;


    // el famoso constructeur
    public Toy(String name, int price, String description, int promo){
        this.name = name;
        this.price = price;
        this.description = description;
        this.promo = promo;
    }

    //methode pour récupérer les informations

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getPromo(){
        return promo;
    }
}
