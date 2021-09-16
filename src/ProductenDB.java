import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class ProductenDB extends TreeMap {
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
    //Product p1 = new Product();



    public ProductenDB(){
        //TreeMap(1, product1)
    }

}
