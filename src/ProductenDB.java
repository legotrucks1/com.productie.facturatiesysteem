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
    Product p3 = new Product("Coca-Cola",
            new ArrayList<>(Arrays.asList("Drank", "Frisdrank")),
            new ArrayList<>(Arrays.asList("URL1", "URL2", "URL3")),
            new ArrayList<>(Arrays.asList("250ML", "330ml", "500ML", "1L", "1,5L", "2L")));
    //Product p1 = new Product();



    public ProductenDB(){
        //TreeMap(1, product1)
    }

}
