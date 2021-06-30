package Arrays;

import java.util.Random;

public class Task5 {

//    «Сожмите» массив, выбросив из него каждый второй элемент.
//            «Освободившиеся» места массива заполните нулями.

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

        for (int i = 0; i < arr.length; i++) {

            if (!(i % 2 == 0)) {

                arr[i] = 0;

            }

        }

        System.out.println("\nМассив после трансфорнмации");

        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

}
