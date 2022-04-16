public class StringBuilderTask2 {
    public static void main(String[] args) {
        String[] array1 = {"aaa", "bbb", "ccc", "ddd"};
        String[] array2 = {"bbb", "ccc", "ddd", "eee", "aaa"};
        if (isContainsAllFromSecondInFirst(array1, array2)
                && isContainsAllFromSecondInFirst(array2, array1)) {
            System.out.println("Массивы содержат одинаковые строки");
        } else {
            System.out.println("Содержание массивов отличается");
        }
    }

    public static boolean isContainsAllFromSecondInFirst(String[] first, String[] second) {
        StringBuilder allStrings = new StringBuilder();
        for (String s : first) {
            allStrings.append(s);
        }
        for (String s : second) {
            if (allStrings.indexOf(s) == -1) {
                return false;
            }
        }
        return true;
    }

}
