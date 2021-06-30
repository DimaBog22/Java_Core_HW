package Arrays;

import java.util.Random;

public class Task9 {

    // Найти наименьший элемент среди элементов с четными индексами массива

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

            if ((i % 2 == 0) && (arr[i] < min)) {

                min = arr[i];

            }

        }

        System.out.println("\nНаименьший элемент среди элементов с четными индексами массива = " + min);

    }

}
