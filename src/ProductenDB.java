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
                new ArrayList<>(Arrays.asList(
                        "https://www.supermarktaanbiedingen.com/public/images/product/2017/39/0-80343fls-chaudfontaine-thermale-bron-natuurlijk-mineraalwater-330ml.jpg",
                        "https://zandvoort.febo.nl/zandvoort.febo.nl/img/gerechten/550x440TBDrankenFEBO2020UE7.png",
                        "https://productimages.thequestionmark.org/images/medium/7bc49d43d46d56ddfd2359345f55bfe3.jpg",
                        "https://www.dessauvage.be/media/catalog/product/cache/1/image/440x/9df78eab33525d08d6e5fb8d27136e95/c/1/c10899.jpg",
                        "")),
                new ArrayList<>(Arrays.asList("330ML", "500ML", "1L", "1,5L")));
        Product p2 = new Product("Coca-Cola",
                new ArrayList<>(Arrays.asList("Drank", "Frisdrank")),
                new ArrayList<>(Arrays.asList("https://www.skout.com.au/img/products/50009181.jpg",
                        "https://thumb.approvedfood.co.uk/thumbs/75/1000/1000/1/src_images/coca_cola_original_taste_330ml_2.jpg",
                        "https://prod.isg.bruneau.media/OMM/Images_Basse_Definition/ZoomHD/16/97/16974.jpg?width=2000&height=2000&mode=Default&quality=85&scale=upscalecanvas",
                        "https://i1.wp.com/shop.stridon.hr/wp-content/uploads/2020/04/Coca-Cola-1L-PET.jpg?fit=1200%2C1200&ssl=1",
                        "https://www.picanhacia.com.br/wp-content/uploads/2017/10/R366117_00.jpg",
                        "https://i5.walmartimages.com/asr/718749b7-5046-4abe-80ae-12bdc9dd4a77_1.cdfffc5d72a26b604ec5b36acfe443e4.jpeg")),
                new ArrayList<>(Arrays.asList("250ML", "330ml", "500ML", "1L", "1,5L", "2L")));
        Product p3 = new Product("Shampoo",
                new ArrayList<>(Arrays.asList("Verzorgingsproducten")),
                new ArrayList<>(Arrays.asList("https://www.carrefour.it/on/demandware.static/-/Sites-carrefour-master-catalog-IT/default/dw38791fb5/large/SHAMPOO1IN1CLASSICHEAD-8001090180742-5.png",
                        "https://www.flavers.pt/wp-content/uploads/2020/06/Head-Shoulders-Classic-Clean-Shampoo-500ml.jpg",
                        "https://www.ourshopee.com/ourshopee-img/ourshopee_products/77388191431700.png")),
                new ArrayList<>(Arrays.asList("400ML", "500ML", "600ML")));
        Product p4 = new Product("Kinder-Bueno",
                new ArrayList<>(Arrays.asList("Snoep")),
                new ArrayList<>(Arrays.asList("https://s.yimg.com/uu/api/res/1.2/6v4.ueCEy.pge8jm3zhJbg--~B/aD0xODAwO3c9MjcwMDtzbT0xO2FwcGlkPXl0YWNoeW9u/http://media.zenfs.com/en-US/homerun/people_218/f7033f8892fec46d936d09665b0ab9ee",
                        "https://static.hanos.com/sys-master/productimages/h7a/h61/9255011680286/28237196_b.jpg_914Wx914H")),
                new ArrayList<>(Arrays.asList("50GR", "1500GR")));
        Product p5 = new Product("Dreft",
                new ArrayList<>(Arrays.asList("Wasmiddel")),
                new ArrayList<>(Arrays.asList("https://media.hubo.be/img/Dreft-afwasmiddel-890ml_915966_000_1920x1440.jpg?base=images&sub=h18&bottom=hdc&name=9142168518686.jpg&context=bWFzdGVyfGltYWdlc3wxMzU2NzV8aW1hZ2UvanBlZ3xpbWFnZXMvaDE4L2hkYy85MTQyMTY4NTE4Njg2LmpwZ3wyOWM3MDBiMTY4OWI4OWEzNGY2NjRiZDM0ZTk4N2M5ZTgwMDkwNDAyZmJkNzYxOTkzOGQ1OWFhOGUwN2MzOGU2&attachment=true",
                        "https://static.webshopapp.com/shops/050959/files/025846395/dreft-hand-dishwashing-original-1015-ml.jpg")),
                new ArrayList<>(Arrays.asList("890ML", "1L")));

        // put is vergelijkbaar met add bij een list.
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
