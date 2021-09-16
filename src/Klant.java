public class Klant {
    private String voornaamKlant;
    private String achternaamKlant;

    public Klant(String naam, String achternaam){
        voornaamKlant = naam;
        achternaamKlant = achternaam;
    }

    public String getKlantVolledigeNaam(){
        return achternaamKlant + " " + voornaamKlant;
    }
}
