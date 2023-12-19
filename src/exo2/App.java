package exo2;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int somme = 0;

        for (int i = 1; i <= 10; i++) {
            somme += i; // Ajouter la valeur actuelle de i à la somme

            System.out.println("La somme S = 1 + 2 + 3 + ... + 10 est : " + somme);
        }
    }
}
