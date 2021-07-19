package StringsHW;

public class TextFormater {

    public static void main(String[] args) {

        TextFormater executor = new TextFormater();

        String inputStr = "Казак Первое второе третье четвертое пятое предложение";
        String inputStr2 = "Первое второе третье четвертое пятое";

        executor.commonFunc(inputStr);
        System.out.println("\n***");
        executor.commonFunc(inputStr2);


    }

    public boolean checkWordisPalindrome(String str) {

        // метод перебирает слова в предложении и ищет палиндром

        Task3 chechWordIsPalindrome = new Task3();

        String[] wordsInStr = str.split("\\s"); // " "

        for (String word : wordsInStr) {

            if (chechWordIsPalindrome.isPalindrome(word) == true) {

                System.out.println(word + " -это палиндром\n" + str);
                return true;

            }

        }
        System.out.println("В предложении:\n" + str + "\n" +
                "палиндромов нет");
        return false;

    }

    public boolean getCountOfWords(String str) {

        // метод считает кол-во слов в предложении

        int counter = 1;

        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] == ' ') {

                counter++;

            }

        }

        if (counter >= 3 && counter <= 5) {

            System.out.println("количество слов " + counter
                    + "\nв предложении: " + str);
            return true;


        } else {

            System.out.println("количество слов " + counter
                    + "\nв предложении: " + str + " выше нормы");
            return false;

        }

    }

    public void commonFunc(String str) {

        // чтобы не вызывать двумя методами

        TextFormater executor = new TextFormater();
        executor.getCountOfWords(str);
        executor.checkWordisPalindrome(str);

    }

}


