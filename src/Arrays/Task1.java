package Arrays;

import java.util.Random;

public class Task1 {

    // Найти произведение элементов, кратных 3.

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(1000);

        }

        System.out.println("массив:");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        int summ = 0;

        System.out.println("\nкратные трем:");

        for (int item : arr) {

            if (item % 3 == 0) {

                summ += item;
                System.out.print(item + " ");

            }

        }

        System.out.println("\n" + summ);

    }

}
