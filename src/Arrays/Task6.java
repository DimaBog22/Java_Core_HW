package Arrays;

import java.util.Random;

public class Task6 {

//    Проверить, различны ли все элементы массива.

    public static void main(String[] args) {

        int[] arr = new int[6];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(10);

        }

        System.out.println("Первоначальный массив");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        boolean isEqual = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] == arr[i]) {

                    isEqual = true;
//                    System.out.println("\n" + arr[i] + " этот элемент повторяется");
                    break;

                }

            }

        }

        if (isEqual) {
            System.out.println("\nВ массиве есть повторяющиеся элементы");
        } else {
            System.out.println("\nВ массиве нет повторяющихся элементов");
        }

    }

}
