import java.util.Scanner;

public class StringBuilderTask3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(new Scanner(System.in).nextLine());
        int dotCount = 0;
        int commaCount = 0;
        int exclamationCount = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '.') {
                dotCount++;
            }
            if (stringBuilder.charAt(i) == ',') {
                commaCount++;
            }
            if (stringBuilder.charAt(i) == '!') {
                exclamationCount++;
            }
        }
        System.out.println(dotCount + commaCount + exclamationCount);
    }
}
