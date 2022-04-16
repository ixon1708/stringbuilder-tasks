import java.util.Scanner;

public class StringBuilderTask6 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(new Scanner(System.in).nextLine());
        /*
        qwerty - исходная строка
        подпоследовательности, которые нужно проверить:
        qwert,  werty,
        qwer,   wert,   erty,
        qwe,    wer,    ert,    rty,
        qw,     we,     er,     rt,     ty,
        q,      w,      e,      r,      t,      y
         */
        String find = null;
        int start = 0;
        int end = text.length() - 1;
        for (int i = text.length() - 1; i >= 0; i--) {
            while (end <= text.length()) {
                if (isContainsTwice(text, text.substring(start, end))) {
                    find = text.substring(start, end);
                    i = -1;//чтобы прервать внешний цикл
                    break;
                }
                start++;
                end++;
            }
            start = 0;
            end = i;
        }
        System.out.println(find);
    }

    public static boolean isContainsTwice(StringBuilder text, String sequence) {
        return text.indexOf(sequence) != -1 && text.indexOf(sequence) != text.lastIndexOf(sequence);
    }
}
