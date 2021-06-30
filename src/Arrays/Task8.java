package Arrays;

import java.util.Random;

public class Task8 {

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

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];

            }

        }

        System.out.println("\n\nМаксимальное значение = " + max);

        // просто присвоим индексам со значением макс внутри значение 0 и выведем новый макс

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == max) {

                arr[i] = 0;

            }

        }

        int newMax = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > newMax) {

                newMax = arr[i];

            }

        }

        System.out.println("Второй по величине элемент в массиве = " + newMax);

    }

}
