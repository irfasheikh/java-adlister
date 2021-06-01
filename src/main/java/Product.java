public class Product {

    private String name;
    private double price;

    //we need this type of constructor EVERY TIME --> an EMPTY constructor

    public Product(){};
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    } // filled in constructor


    public String getName(){
        return name;
    }


}
