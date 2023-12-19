package exo11;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] tab = { 1, 2, 9, 4, 25, 47 };

        int plusGrand = trouverPlusGrandEntier(tab);

        System.out.println("Le plus grand entier dans le tableau est : " + plusGrand);
    }

    private static int trouverPlusGrandEntier(int[] tableau) {

        if (tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide.");
        }

        int plusGrand = tableau[0];

        for (int nombre : tableau) {
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }

        return plusGrand;
    }
}
