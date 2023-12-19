package exo8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] tableau = new int[10];

        try (
                Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Entrez un entier : ");
                tableau[i] = scanner.nextInt();
            }
        }

        int nbPairs = 0;
        int nbImpairs = 0;

        for (int nombre : tableau) {
            if (nombre % 2 == 0) {
                nbPairs++;
            } else {
                nbImpairs++;
            }
        }

        int[] T1 = new int[nbPairs];
        int[] T2 = new int[nbImpairs];

        int indexT1 = 0;
        int indexT2 = 0;

        for (int nombre : tableau) {
            if (nombre % 2 == 0) {
                T1[indexT1] = nombre;
                indexT1++;
            } else {
                T2[indexT2] = nombre;
                indexT2++;
            }
        }

        System.out.println("Tableau T1 (éléments pairs) :");
        afficherTableau(T1);

        System.out.println("\nTableau T2 (éléments impairs) :");
        afficherTableau(T2);
    }

    private static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}
