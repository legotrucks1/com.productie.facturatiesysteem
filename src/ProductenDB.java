import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ProductenDB extends TreeMap {
    private TreeMap<Integer, Product> productMap = new TreeMap();

    public void dbInit() {
        Product p1 = new Product("Chaudfontaine",
                new ArrayList<>(Arrays.asList("Drank")),
                new ArrayList<>(Arrays.asList("URL1", "URL2")),
                new ArrayList<>(Arrays.asList("150ML", "330ml", "500ML", "1L", "1,5L", "2L")));
        Product p2 = new Product("Coca-Cola",
                new ArrayList<>(Arrays.asList("Drank", "Frisdrank")),
                new ArrayList<>(Arrays.asList("URL1", "URL2", "URL3")),
                new ArrayList<>(Arrays.asList("250ML", "330ml", "500ML", "1L", "1,5L", "2L")));
        Product p3 = new Product("Shampoo",
                new ArrayList<>(Arrays.asList("Verzorgingsproducten")),
                new ArrayList<>(Arrays.asList("URL1", "URL2")),
                new ArrayList<>(Arrays.asList("400ML", "500ML", "600ML")));
        Product p4 = new Product("Kinder-Bueno",
                new ArrayList<>(Arrays.asList("Snoep")),
                new ArrayList<>(Arrays.asList("URL1")),
                new ArrayList<>(Arrays.asList("150GR", "500GR")));
        Product p5 = new Product("Dreft",
                new ArrayList<>(Arrays.asList("Wasmiddel")),
                new ArrayList<>(Arrays.asList("URL1", "URL2")),
                new ArrayList<>(Arrays.asList("400ML", "500ML", "600ML", "800ML")));

        productMap.put(1, p1);
        productMap.put(2, p2);
        productMap.put(3, p3);
        productMap.put(4, p4);
        productMap.put(5, p5);
    }

    public Map getProductMap(){
        return productMap;
    }

}
