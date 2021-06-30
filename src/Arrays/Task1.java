package Arrays;

import java.util.Random;

public class Task1 {

    // Найти произведение элементов, кратных 3.

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(100);

        }

        System.out.println("массив:");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        int summ = 1;

        System.out.println("\nкратные трем:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 == 0) {

                summ *= arr[i];
                System.out.print(arr[i] + " ");

            }

        }

        System.out.println("\n" + summ);

    }

}
