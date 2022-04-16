import java.util.Scanner;

public class StringBuilderTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder reverseText = new StringBuilder(text).reverse();
        if (text.toString().equals(reverseText.toString())) {
            System.out.println("Это полиндром.");
        } else {
            System.out.println("Это не полиндром.");
        }
    }
}
