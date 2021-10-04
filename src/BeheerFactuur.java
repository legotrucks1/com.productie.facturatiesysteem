import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class BeheerFactuur {

    public static void main(String[] args) {

        //TO DO: foutcheck bij product indien meermaals hetzelfde product

        class CheckInput{
            private int input;
            private int max;
            public CheckInput(int input, int max){
                this.input=input;
                this.max=max;
            }
            public boolean showError(){
                if (input > max){
                    System.out.println("enkel een getal tussen 0 en " + max + " ingeven aub.");
                    return true;
                }
                return false;
            }

        }
        Scanner scn = new Scanner(System.in);
        Date datumBetaald = new Date();
        ArrayList<Product> productMandje = new ArrayList<>();
        List<Integer> hoeveelheidProducten = new ArrayList<>();
        String maatProduct="";
        String urlProduct="";

        int input = -1;
        //int aantalProducten = 5;
        int hoeveelheid;
        boolean error=true;
        Klant k1 = new Klant("Johan", "Struif");

        ProductenDB productenDB = new ProductenDB();
        productenDB.dbInit();
        TreeMap<Integer, Product> tM = (TreeMap) productenDB.getProductMap();

        System.out.println(tM.get(1).getNaamProduct());

        System.out.println("Kies uit de volgende producten." + "\n");
        for (Map.Entry<Integer, Product> productEntry : tM.entrySet()) {
            System.out.println(productEntry.getKey() + ". " + productEntry.getValue().getNaamProduct());
        }

        CheckInput chkInput;

        // Hier gaan we waarschijnlijk een deel naar factuur moeten overhevelen.
        while (input != 0) {
            System.out.println("Tik het nummer van het product in dat u wenst te hebben of type \"0\" om het programma te stoppen.");
            //TO DO: factuur uitprinten,
            // producten doorgeven aan factuur om te kunnen printen.
            while (error){
                input = scn.nextInt();
                chkInput = new CheckInput(input, tM.size());
                error = chkInput.showError();
            }

            error = true;
            if (input != 0) {
                // productmandje gaat het item uit de database halen (1 = p1, 2 = p2,...)
                productMandje.add(tM.get(input));
                System.out.println("Hoeveel stuks wilt u hebben?");
                hoeveelheid = scn.nextInt();

                hoeveelheidProducten.add(hoeveelheid);

                System.out.println("Hoe groot moet de verpakking zijn? de waarden voor dit product zijn:");
                ArrayList<String> maten = productMandje.get(productMandje.size()-1).getMatenProduct();
                ArrayList<String> fotosProduct = productMandje.get(productMandje.size()-1).getFotosProduct();
                for (int i = 0; i < maten.size(); i++) {
                    System.out.println(i + 1 + ". " + maten.get(i));
                }

                int maatInput = 0;
                while (error){
                    maatInput = scn.nextInt();
                    chkInput = new CheckInput(maatInput, maten.size());
                    error = chkInput.showError();
                }
                error = true;

                maatProduct = productMandje.get(productMandje.size()-1).getMatenProduct().get(maatInput-1);
                k1.addToGekozenMaten(maatProduct);
                urlProduct = productMandje.get(productMandje.size()-1).getFotosProduct().get(maatInput-1);
                k1.addToUrlList(urlProduct);


            }
        }

        // Hier gaat de factuur zelf komen.
        Factuur f = new Factuur(k1, datumBetaald);
        Factuurlijnen factuurlijnen = new Factuurlijnen(k1, datumBetaald, f);
        factuurlijnen.printFactuur(productMandje, hoeveelheidProducten);


    }
}
