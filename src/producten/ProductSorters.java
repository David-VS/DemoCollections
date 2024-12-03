package producten;

import java.util.Comparator;

public class ProductSorters {

    public static Comparator<Product> prijsOplopend = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (int)o1.getPrice() - (int)o2.getPrice();
        }
    };
}
