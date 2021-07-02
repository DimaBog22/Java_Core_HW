package MultidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    // Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
    //строкой и т. д.)

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

        for (int i = 0; i < multArr.length; i++) {

            for (int j = i + 1; j < multArr.length; j++) {

                int temp = multArr[i][j];
                multArr[i][j] = multArr[j][i];
                multArr[j][i] = temp;

            }

        }

        System.out.println("\nНовая матрица:");

        for (int i = 0; i < multArr.length; i++) {
            for (int j = 0; j < multArr[i].length; j++) {
                System.out.print(multArr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
