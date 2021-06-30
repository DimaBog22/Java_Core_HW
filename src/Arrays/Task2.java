package Arrays;

import java.util.Random;

//Найти среднее арифметическое элементов с нечетными номерами.

public class Task2 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(1000);

        }

        System.out.println("первоначальный массив");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println("\nэлементов с нечетными номерами:");

        int summ = 0;
        int count = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!(i % 2 == 0)) {

                count++;
                summ += arr[i];
                System.out.print(arr[i] + " ");

            }

        }

        result = summ / count;

        System.out.println("\n среднее арифметическое элементов с нечетными номерами - " + result);


    }

}
