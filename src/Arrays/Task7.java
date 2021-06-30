package Arrays;

import java.util.Random;
import java.util.Scanner;

// Подсчитать, сколько раз встречается элемент с заданным значением.

public class Task7 {

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

        System.out.println("\nВведите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;

        for (int item : arr) {

            if (number == item) {
                count++;
            }

        }

        System.out.println("Элемент " + number + " встречается " + count + " раз/раза");


    }
}
