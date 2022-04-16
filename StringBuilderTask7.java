import java.util.Scanner;

public class StringBuilderTask7 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(new Scanner(System.in).next());
        int sum = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            int current = fromRome(text.charAt(i));
            int next = fromRome(text.charAt(i + 1));
            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        sum += fromRome(text.charAt(text.length() - 1));
        System.out.println(sum);

    }

    public static int fromRome(char romeDigit) {
        switch (romeDigit) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            default:
                return 0;
        }
    }

}
