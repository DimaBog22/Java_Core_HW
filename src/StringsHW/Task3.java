package StringsHW;

public class Task3 {

    public static void main(String[] args) throws Exception {

        Task3 executor = new Task3();
        StringBuilder outputStr = new StringBuilder();

        String[] inputStr = {"Казак", "дед", "шалаш",
                "окно", "очки"};
        System.out.println("Изначальный файл: ");

        for (String item : inputStr) {
            System.out.print(item + " ");
        }

        for (String item : inputStr) {
            if (executor.isPalindrome(item) == true) {
                outputStr.append(item + " ");
            }
        }

        System.out.println("\nВсе палиндромы, находящиеся в файле:" +
                "\n" + outputStr);


    }

    public boolean isPalindrome(String str) {

        StringBuilder rev = new StringBuilder(str).reverse();

        String strRev = rev.toString();

        if (str.equalsIgnoreCase(strRev)) {
            return true;
        } else {
            return false;
        }

    }

}
