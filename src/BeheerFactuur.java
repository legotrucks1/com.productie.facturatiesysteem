import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class BeheerFactuur {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Date datumBetaald = new Date();
        ArrayList<Product> productMandje = new ArrayList<>();
        List<Integer> hoeveelheidProducten = new ArrayList<>();
        String maatProduct="";

        int input = -1;
        //int aantalProducten = 5;
        int hoeveelheid;
        Klant k1 = new Klant("Johan", "Struif");

        ProductenDB productenDB = new ProductenDB();
        productenDB.dbInit();
        TreeMap<Integer, Product> tM = (TreeMap) productenDB.getProductMap();

        System.out.println("Kies uit de volgende producten." + "\n");
        for (Map.Entry<Integer, Product> productEntry : tM.entrySet()) {
            System.out.println(productEntry.getKey() + ". " + productEntry.getValue().getNaamProduct());
        }


        // Hier gaan we waarschijnlijk een deel naar factuur moeten overhevelen.
        while (input != 0) {
            System.out.println("Tik het nummer van het product in dat u wenst te hebben of type \"0\" om het programma te stoppen.");
            //TO DO: factuur uitprinten,
            // producten doorgeven aan factuur om te kunnen printen.
            input = scn.nextInt();
            if (input != 0) {
                productMandje.add(tM.get(input));
                System.out.println("Hoeveel stuks wilt u hebben?");
                hoeveelheid = scn.nextInt();
                hoeveelheidProducten.add(hoeveelheid);
                System.out.println("Hoe groot moet de verpakking zijn? de waarden voor dit product zijn:");
                ArrayList<String> maten = productMandje.get(productMandje.size()-1).getMatenProduct();
                for (int i = 0; i < maten.size(); i++) {
                    System.out.println(i + 1 + ". " + maten.get(i));
                }
                int maatInput = scn.nextInt();
                maatProduct = productMandje.get(productMandje.size()-1).getMatenProduct().get(maatInput-1);

            }
        }

        // Hier gaat de factuur zelf komen.
        Factuur f = new Factuur(k1, datumBetaald);
        Factuurlijnen factuurlijnen = new Factuurlijnen(k1, datumBetaald, f, maatProduct);
        factuurlijnen.printFactuur(productMandje, hoeveelheidProducten);

    }
}
