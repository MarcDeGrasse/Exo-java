package exo4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le prix total HT : ");
            double prixHT = scanner.nextDouble();

            double reduction = (prixHT > 200) ? 0.15 * prixHT : 0;

            double montantApresReduction = prixHT - reduction;

            double montantTTC = montantApresReduction * 1.20;

            System.out.println("Montant HT : " + prixHT + " Euros");
            System.out.println("Réduction : " + reduction + " Euros");
            System.out.println("Montant après réduction : " + montantApresReduction + " Euros");
            System.out.println("Montant TTC (avec TVA) : " + montantTTC + " Euros");
        }
    }
}
