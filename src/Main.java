import beestjes.Dier;
import beestjes.Slang;
import beestjes.Tijger;
import beestjes.Vleermuis;
import beestjes.gedrag.KanZwemmen;
import producten.Product;
import producten.ProductSorters;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Java coffee", 2, 5);
        Product p2 = new Product("Coffee creamer", 0.5, 3);
        Product p3 = new Product("Generic cookies", 3, 4);

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println(products);
        Collections.sort(products, ProductSorters.prijsOplopend);
        System.out.println(products);

    }
}