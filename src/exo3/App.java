package exo3;

import java.util.Scanner;

public class App {

    public static void main(String[] args, String x) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez la valeur de A : ");
            int a = scanner.nextInt();

            System.out.print("Entrez la valeur de B : ");
            int b = scanner.nextInt();

            System.out.println("Avant l'échange :");
            System.out.println("A = " + a);
            System.out.println("B = " + b);

            int temp = a;
            a = b;
            b = temp;

            System.out.println("\n Après l'échange :");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
        }
    }
}
