import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Factuurlijnen {
    // factuur
    // product
    // aantal
    Klant klant;
    Date datumBetaald;
    Factuur f;
    public Factuurlijnen(Klant klant, Date datumBetaald, Factuur f){
        this.klant=klant;
        this.datumBetaald=datumBetaald;
        this.f=f;
    }
    public void printFactuur(){
        f.setVolgnummer();

        System.out.println("Naam en voornaam klant:" + klant.getKlantVolledigeNaam());
        System.out.println("Factuurnummer: " + f.getVolgnummer());
        System.out.println("Factuurdatum: "+ f.datumFactuur());
        System.out.println("Datum betaald:" + f.datumFactuur());
        System.out.println("===================================================================");
        // Hier komen de factuurlijnen


        //itereren over map
        for(Map.Entry<String, ArrayList<GekozenProduct>> gekozenProduct : klant.getProductmandje().getProductmandje().entrySet()) {
            for (GekozenProduct prod : gekozenProduct.getValue()) {
                System.out.println(prod.getProduct() +
                        " \t " + prod.getHoeveelheid() +
                        " \t " + prod.getMaat() +
                        "\t" + prod.getProduct().getAllCategoriesOfProduct());
            }
        }

//        //StringBuilder sb = new StringBuilder();
//        for (int i = 0; i<productMandje.size(); i++){
//            System.out.println(productMandje.get(i) +
//                    " \t " + hoeveelheidProducten.get(i) +
//                    " \t " + this.klant.getGekozenMaten().get(i) +
//                    "\t" + productMandje.get(i).getAllCategoriesOfProduct());
//        }
        System.out.println("");
        System.out.println("Hier zijn alle fotos van de gekozen producten.");
        for(Map.Entry<String, ArrayList<GekozenProduct>> gekozenProduct : klant.getProductmandje().getProductmandje().entrySet()){
            for (GekozenProduct prod : gekozenProduct.getValue()){
                System.out.println(prod.getUrl());
            }
        }
//        for (int i = 0; i < productMandje.size(); i++){
//            System.out.println(this.klant.getUrls().get(i));
//        }
//        System.out.println("===================================================================");
    }

}
