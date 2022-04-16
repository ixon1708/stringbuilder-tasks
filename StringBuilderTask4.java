import java.util.Scanner;

public class StringBuilderTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        StringBuilder text = new StringBuilder(input.nextLine());
        System.out.print("Разбивать на части по сколько символов? ");
        int n = input.nextInt();
        input.nextLine();
        int countOfParts = (text.length() % n == 0) ? (text.length() / n) : (text.length() / n + 1);
        String[] parts = new String[countOfParts];
        int indexOfPart = 0;
        int currentSymbolIndex = 0;
        while (currentSymbolIndex < text.length()) {
            StringBuilder part = new StringBuilder();
            int countAdded = 0;
            while (countAdded < n && currentSymbolIndex < text.length()) {
                part.append(text.charAt(currentSymbolIndex));
                currentSymbolIndex++;
                countAdded++;
            }
            parts[indexOfPart] = part.toString();
            indexOfPart++;
        }
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
