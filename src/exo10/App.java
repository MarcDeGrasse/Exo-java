package exo10;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StringBuilder str = new StringBuilder("Hello World!");
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());

    }
}
