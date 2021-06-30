package Arrays;

import java.util.Random;

public class Task4 {

//    Найти наименьший нечетный элемент.

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(10);

        }

        System.out.println("Первоначальный массив");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (!(arr[i] % 2 == 0) && (arr[i] < min) && !(arr[i] == 0)) {

                min = arr[i];

            }

        }

        System.out.println("\nМинимальный нечетный элемент массива = " + min);

    }

}
