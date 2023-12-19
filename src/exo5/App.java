package exo5;

import java.util.Scanner;

public class App {
    private static final String nomUtilisateur = null;

    public static String main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez votre nom : ");

            return "SalutationUtilisateur [scanner=" + scanner + ", nomUtilisateur=" + nomUtilisateur + "]";
        }
    }

    public static String getNomutilisateur() {
        return nomUtilisateur;
    }
}
