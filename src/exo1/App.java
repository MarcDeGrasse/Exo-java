package exo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (
                Scanner scanner = new Scanner("CategorieEnfant")) {
            System.out.print("Entrez l'âge de l'enfant : ");

            int age2 = scanner.nextInt();

            String categorie = determinerCategorie(age2);

            System.out.println("La catégorie de l'enfant est : " + categorie);
        }
    }

    private static String determinerCategorie(int age) {
        String categorie = "";

        if (age >= 6 && age <= 7) {
            categorie = "Poussin de 6 à 7 ans";
        } else if (age >= 8 && age <= 9) {
            categorie = "Pupille de 8 à 9 ans";
        } else if (age >= 10 && age <= 11) {
            categorie = "Minime de 10 à 11 ans";
        } else if (age >= 12) {
            categorie = "Cadet après 12 ans";
        } else {
            categorie = "L'enfant ne correspond à aucune catégorie spécifiée.";
        }

        return categorie;
    }
}
