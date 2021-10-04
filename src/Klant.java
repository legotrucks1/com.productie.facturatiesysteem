import java.util.ArrayList;

public class Klant {
    private String voornaamKlant;
    private String achternaamKlant;
    private ArrayList<String> gekozenMaten = new ArrayList<>();
    private ArrayList<String> teTonenUrls = new ArrayList<>();

    public Klant(String naam, String achternaam){
        voornaamKlant = naam;
        achternaamKlant = achternaam;
    }

    public ArrayList<String> getGekozenMaten(){
        return gekozenMaten;
    }

    public void addToGekozenMaten(String gekozenMaat){
        gekozenMaten.add(gekozenMaat);
    }

    // public void getAfbeelding(String url){teTonenUrls.add(url);}

    public String getKlantVolledigeNaam(){
        return achternaamKlant + " " + voornaamKlant;
    }
}
