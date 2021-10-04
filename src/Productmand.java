import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Productmand {
    private Map<String, ArrayList<GekozenProduct>> Productmandje;
    private int count = 0;

    public Productmand() {
        Productmandje = new HashMap<>();
    }

    public Map<String, ArrayList<GekozenProduct>> getProductmandje() {
        return Productmandje;
    }

    public void addProductToMandje(Product product, int hoeveelheid, String maat, String url) {
        GekozenProduct gekozenProduct = new GekozenProduct(product, maat, hoeveelheid);
        gekozenProduct.setUrl(url);
        if (!Productmandje.containsKey(gekozenProduct.getProduct().getNaamProduct())){
            Productmandje.put(gekozenProduct.getProduct().getNaamProduct(), new ArrayList<GekozenProduct>(Arrays.asList(gekozenProduct)));
        }
        else{
            ArrayList<GekozenProduct> x = Productmandje.get(gekozenProduct.getProduct().getNaamProduct());
            // check here for dupicates
            for (GekozenProduct prod : x){
                if(prod.getMaat().equals(maat)){
                    prod.setHoeveelheid(prod.getHoeveelheid() + hoeveelheid);
                    return;
                }
            }
            x.add(gekozenProduct);
            //ArrayList<Product> y = new ArrayList<Product>();
        }
        count++;
    }

}
