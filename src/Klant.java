import java.util.ArrayList;

public class Klant {
    private String voornaamKlant;
    private String achternaamKlant;
    //private ArrayList<String> gekozenMaten = new ArrayList<>();
    //private ArrayList<String> teTonenUrls = new ArrayList<>();
    private Productmand productmandje;

    public Klant(String naam, String achternaam){
        voornaamKlant = naam;
        achternaamKlant = achternaam;
        productmandje = new Productmand();
    }

//    public ArrayList<String> getGekozenMaten(){
//        return gekozenMaten;
//    }
//
//    public void addToGekozenMaten(String gekozenMaat){
//        gekozenMaten.add(gekozenMaat);
//    }
//
//    // bij product zetten
//    public ArrayList<String> getUrls(){
//        return teTonenUrls;
//    }
//    public void addToUrlList(String url){
//        teTonenUrls.add(url);
//    }
    // public void getAfbeelding(String url){teTonenUrls.add(url);}

    public String getKlantVolledigeNaam(){
        return achternaamKlant + " " + voornaamKlant;
    }

    public Productmand getProductmandje() {
        return productmandje;
    }

    public void setProductmandje(Productmand productmandje) {
        this.productmandje = productmandje;
    }
}
