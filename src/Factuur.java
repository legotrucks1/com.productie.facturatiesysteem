import java.time.LocalDate;
import java.util.Date;

public class Factuur {
    public int volgnummer = 0;
    Klant k;

    public Factuur(Klant klant , Date datumFactuur, Date datumBetaald){

    }
    //klant
    public void klantnaam(String voornaam, String achternaam){

    }

    //volgnummer
    public int setVolgnummer(){
        return volgnummer++;
    }

    public int getVolgnummer(){
        return volgnummer;
    }
    //Datum factuur
    //Datum betaald
    //beheren van factuurlijnen(hier zullen de producten zitten)
    public void factuurlijn(){

        new Product("Water", "Drank", 1, "330CL");
        //System.out.println("Klantnaam: " + klant1.getKlantVolledigeNaam() + "Datum: ");
        System.out.println("Factuurnummer: " + getVolgnummer());
    }
}
