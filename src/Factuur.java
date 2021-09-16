import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Factuur {
    public int volgnummer = 0;
    Klant klant;
    Date datumBetaald;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");

    public Factuur(Klant klant , Date datumBetaald){
        this.klant=klant;
        this.datumBetaald=datumBetaald;
    }
    //klant
    public String klantnaam(String voornaam, String achternaam){
        return  klant.getKlantVolledigeNaam();
    }

    //volgnummer
    public int setVolgnummer(){
        return volgnummer++;
    }

    public int getVolgnummer(){
        return volgnummer;
    }

    //Datum factuur
    public Date datumFactuur(){
        Date datumFactuur = new Date();
        String str = formatter.format(datumFactuur);
        return datumFactuur;
    }
    //Datum betaald
    //beheren van factuurlijnen(hier zullen de producten zitten)
    public void factuurlijn(Product product, int hoeveelheid){

        System.out.print(product.toString() + " " + hoeveelheid);
        //System.out.println("Klantnaam: " + klant1.getKlantVolledigeNaam() + "Datum: ");
        System.out.println("Factuurnummer: " + getVolgnummer());
    }
}
