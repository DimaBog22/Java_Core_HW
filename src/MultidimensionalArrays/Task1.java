package MultidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    // Почитать сумму четных элементов стоящих на главной диагонали.

    public static void main(String[] args) {

        System.out.println("Введите число А:");
        Scanner sc1 = new Scanner(System.in);
        int numberA = sc1.nextInt();

        System.out.println("Введите число B:");
        Scanner sc2 = new Scanner(System.in);
        int numberB = sc2.nextInt();

        Random randomNumber = new Random();

        int[][] multArr = new int[numberA][numberB];

        for (int i = 0; i < multArr.length; i++) {

            for (int j = 0; j < multArr[i].length; j++) {

                multArr[i][j] = randomNumber.nextInt(50);

            }

        }

        System.out.println("Первоначальный массив:");

        for (int i = 0; i < multArr.length; i++) {
            for (int j = 0; j < multArr[i].length; j++) {
                System.out.print(multArr[i][j] + "\t");
            }
            System.out.println();
        }

        int summ = 0;

        for (int i = 0; i < multArr.length; i++) {

            for (int j = 0; j < multArr.length; j++) {

                if (i == j && multArr[i][j] % 2 == 0) {
                    summ += multArr[i][j];
                }

            }

        }

        System.out.println("\nСумма четных элементов стоящих на главной диагонали равна " + summ);

    }

}
