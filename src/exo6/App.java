package exo6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier chiffre : ");
            double chiffre1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième chiffre : ");
            double chiffre2 = scanner.nextDouble();

            double somme = chiffre1 + chiffre2;
            double produit = chiffre1 * chiffre2;
            double difference = chiffre1 - chiffre2;
            double quotient = chiffre1 / chiffre2;
            double reste = chiffre1 % chiffre2;

            System.out.println("Somme : " + somme);
            System.out.println("Produit : " + produit);
            System.out.println("Différence : " + difference);
            System.out.println("Quotient : " + quotient);
            System.out.println("Reste : " + reste);
        }

    }
}
