import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class BeheerFactuur {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Date factuurdatum = LocalDate.now();

        // Maak 5 producten aan
        Product p1 = new Product("Chaudfontaine", "Drank", 1, "330CL");
        Product p2 = new Product("Shampoo", "Huidverzorging", 2, "150ML");
        Product p3 = new Product("Kinder Bueno", "Snoep", 4, "100Gr");
        Product p4 = new Product("Dreft", "Wasmiddelen", 3, "150ML");
        Product p5 = new Product("Coca-Cola", "Drank", 5, "2L");
        Klant k1 = new Klant("Johan", "Struif");

        System.out.println("Kies uit de volgende producten." + "\n" +
                p1.getNaamProduct() + "\n" +
                p2.getNaamProduct() + "\n" +
                p3.getNaamProduct() + "\n" +
                p4.getNaamProduct() + "\n" +
                p5.getNaamProduct() + "\n" );
        //String
        Factuur f = new Factuur(k1, factuurdatum)

    }
}
