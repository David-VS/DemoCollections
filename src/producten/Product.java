package producten;

//Comparable -> natuurlijke manier, default
//comparator -> andere manieren van sorteren
public class Product implements Comparable<Product>{

    private String name;
    private double price;
    private int rating;

    public Product() {
    }

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Product otherProduct) {
        /* indien gelijk tweede check
        if(o.rating - this.rating ==  0){
            return o.name.compareToIgnoreCase(this.name);
        }
        */
        return otherProduct.rating - this.rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
