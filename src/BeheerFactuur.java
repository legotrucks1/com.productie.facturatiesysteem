import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BeheerFactuur {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Date datumBetaald = new Date();
        ArrayList<Product> producten = new ArrayList<>();
        List<Integer> hoeveelheidProducten = new ArrayList<>();

        int input = -1;
        //int aantalProducten = 5;
        int hoeveelheid;

        // Maak 5 producten aan
//        Product p1 = new Product("Chaudfontaine", "Drank", 1, "330CL");
//        Product p2 = new Product("Shampoo", "Huidverzorging", 2, "150ML");
//        Product p3 = new Product("Kinder Bueno", "Snoep", 4, "100Gr");
//        Product p4 = new Product("Dreft", "Wasmiddelen", 3, "150ML");
//        Product p5 = new Product("Coca-Cola", "Drank", 5, "2L");
        Klant k1 = new Klant("Johan", "Struif");

        //System.out.println("Kies uit de volgende producten." + "\n" +
                /*p1.getNaamProduct() + "\n" +
                p2.getNaamProduct() + "\n" +
                p3.getNaamProduct() + "\n" +
                p4.getNaamProduct() + "\n" +
                p5.getNaamProduct() + "\n" );*/

        // Hier gaan we waarschijnlijk een deel naar factuur moeten overhevelen.
        while (input != 0){
            System.out.println("Tik het nummer van het product in dat u wenst te hebben of type \"0\" om het programma te stoppen.");
            //TO DO: factuur uitprinten,
            // producten doorgeven aan factuur om te kunnen printen.
            input = scn.nextInt();
//            if (input == 1){
//                producten.add(p1);
//                System.out.println("Hoeveel stuks wilt u hebben?");
//                hoeveelheid = scn.nextInt();
//                hoeveelheidProducten.add(hoeveelheid);
//            }
//            if (input == 2){
//                producten.add(p2);
//                System.out.println("Hoeveel stuks wilt u hebben?");
//                hoeveelheid = scn.nextInt();
//                hoeveelheidProducten.add(hoeveelheid);
//            }
//            if (input == 3){
//                producten.add(p3);
//                System.out.println("Hoeveel stuks wilt u hebben?");
//                hoeveelheid = scn.nextInt();
//                hoeveelheidProducten.add(hoeveelheid);
//            }
//            if (input == 4){
//                producten.add(p4);
//                System.out.println("Hoeveel stuks wilt u hebben?");
//                hoeveelheid = scn.nextInt();
//                hoeveelheidProducten.add(hoeveelheid);
//            }
//            if (input == 5){
//                producten.add(p5);
//                System.out.println("Hoeveel stuks wilt u hebben?");
//                hoeveelheid = scn.nextInt();
//                hoeveelheidProducten.add(hoeveelheid);
//            }

        }
        // Hier gaat de factuur zelf komen.
        Factuur f = new Factuur(k1, datumBetaald);
        f.setVolgnummer();

        System.out.println("Naam en voornaam klant:" + k1.getKlantVolledigeNaam());
        System.out.println("Factuurnummer: " + f.getVolgnummer());
        System.out.println("Factuurdatum: "+ f.datumFactuur());
        System.out.println("Datum betaald: " + f.datumFactuur());
        System.out.println("===================================================================");
        // Hier komen de factuurlijnen

        for (int i = 0; i<producten.size(); i++){
            System.out.println(producten.get(i) + "    " + hoeveelheidProducten.get(i));
        }
        System.out.println("===================================================================");

    }
}
