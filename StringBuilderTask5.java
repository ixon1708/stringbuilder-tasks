import java.util.Scanner;

public class StringBuilderTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder word1 = new StringBuilder(input.next());
        StringBuilder word2 = new StringBuilder(input.next());
        String firstPart = word1.substring(0, word1.length() / 2);
        String secondPart = word2.substring(word2.length() / 2);
        System.out.println(firstPart + secondPart);
    }
}
