package exo7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre : ");
            int nombre1 = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int nombre2 = scanner.nextInt();

            System.out.print("Entrez le troisième nombre : ");
            int nombre3 = scanner.nextInt();

            if (nombre1 == nombre2 && nombre2 == nombre3) {
                System.out.println("Tous les nombres sont égaux.");
            } else if (nombre1 != nombre2 && nombre2 != nombre3 && nombre1 != nombre3) {
                System.out.println("Aucun des nombres n'est égal aux autres.");
            } else {
                System.out.println("Certains des nombres sont égaux.");
            }
        }
    }
}
