package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    // Найти средне арифметическое элементов массива, превосходящих некоторое
    //число С.

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

        System.out.println("\nВведите число С:");
        Scanner sc = new Scanner(System.in);
        int numberC = sc.nextInt();

        double average;
        double summ = 0;
        double count = 0;

        for (int item : arr) {

            if (item > numberC) {

                summ += item;
                count++;

            }

        }

        System.out.println("\nсумма чисел выше С = " + summ + ", количество этих элементов = " + count);

        average = summ / count;

        System.out.println("редне арифметическое элементов массива, превосходящих некоторое\n" +
                "число С = " + average);

    }

}
