package MultidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

//    Проверить произведение элементов какой диагонали больше

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

        int summMain = 0;

        for (int i = 0; i < multArr.length; i++) {

            for (int j = 0; j < multArr.length; j++) {

                if (i == j) {
                    summMain += multArr[i][j];
                }

            }

        }

        System.out.println("\nСумма элементов стоящих на главной диагонали равна " + summMain);

        int summSecond = 0;

        for (int i = 0; i < multArr.length; i++) {

            int j = multArr.length - 1 - i;
            summSecond += multArr[i][j];

        }

        System.out.println("Сумма элементов стоящих на побочной диагонали равна " + summSecond);

        if (summMain > summSecond) {
            System.out.println("Сумма " + summMain + " главной диагонали больше");
        } else if (summMain < summSecond) {
            System.out.println("Сумма " + summSecond + " побочной диагонали больше");
        } else if (summMain == summSecond) {
            System.out.println("Суммы " + summMain + " главной и побочной диагонали равны");
        }


    }

}
