package StringsHW;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите ваше предложение:");
        Scanner sctr = new Scanner(System.in);
        String string = sctr.nextLine();
        System.out.println("Целое предложение:" + "\n" + string);

        System.out.println("Введите индекс А");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Введите индекс B");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        String stringResult = string.substring(a, b);
        System.out.println(stringResult);

    }

}
