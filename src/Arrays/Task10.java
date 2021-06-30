package Arrays;

import java.util.Random;

public class Task10 {

    // Найти максимальный элемент в массиве и поменять его местами с нулевым
    //элементом

    public static void main(String[] args) {

        int[] arr = new int[4];

        Random randomNumber = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = randomNumber.nextInt(10);

        }

        System.out.println("Первоначальный массив");

        for (int item : arr) {
            System.out.print(item + " ");
        }

        int max = arr[0];
        int indexOfMax = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
                indexOfMax = i;

            }

        }

        System.out.println("\nМакс значение = " + max + ", а его индекс = " + indexOfMax);

        int first = arr[0];
        int biggest = arr[indexOfMax];

        arr[0] = biggest;
        arr[indexOfMax] = first;

        System.out.println("Новый массив");

        for (int item : arr) {
            System.out.print(item + " ");
        }


    }

}
