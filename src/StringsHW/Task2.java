package StringsHW;

public class Task2 {

    public static void main(String[] args) {

        String string = "I guess it's great deal, isn't it, Gustavo?";
        System.out.println("Целое предложение:" + "\n" + string);

        char third = string.charAt(3);
        char zero = string.charAt(0);

        System.out.println("третий индекс - " + third);
        System.out.println("нулевой индекс - " + zero);

        String stringResult = string.replace(third, zero);
        System.out.println("Переделанное предложение:" + "\n" + stringResult);

    }

}
