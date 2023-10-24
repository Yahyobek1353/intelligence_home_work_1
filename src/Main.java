import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ведите своё имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Привет "+ name);
    }
}