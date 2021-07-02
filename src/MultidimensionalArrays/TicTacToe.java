package MultidimensionalArrays;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        String [][] multArr = new String[3][3];

        for (int i = 0; i < multArr.length; i++) {

            for (int j = 0; j < multArr[i].length; j++) {

                multArr[i][j] = "*";

            }

        }

        boolean finish = true;
        String user1 = "Победил пользователь, играющий крестиками";
        String user2 = "Победил пользователь, играющий ноликами";

        while(finish) {

            System.out.println("Введите X или O:");
            Scanner sc3 = new Scanner(System.in);
            String ticOrTac = sc3.nextLine();

            System.out.println("Выберите поле по вертикали:");
            Scanner sc1 = new Scanner(System.in);
            int numberX = sc1.nextInt();

            System.out.println("Выберите поле по горизонтали:");
            Scanner sc2 = new Scanner(System.in);
            int numberY = sc2.nextInt();

            multArr[numberX][numberY] = ticOrTac;

            for (int i = 0; i < multArr.length; i++) {

                for (int j = 0; j < multArr[i].length; j++) {
                    System.out.print(multArr[i][j] + "\t");
                }
                System.out.println();


            }

            // XXX

            if (multArr[0][0].equals("X") && multArr[0][1].equals("X") && multArr[0][2].equals("X")) {
                // xxx
                //
                //
                System.out.println(user1);
                finish = false;

            } else if (multArr[0][0].equals("X") && multArr[1][0].equals("X") && multArr[2][0].equals("X")) {
                //x
                //x
                //x
                System.out.println(user1);
                finish = false;

            } else if (multArr[0][0].equals("X") && multArr[1][1].equals("X") && multArr[2][2].equals("X")) {
                //x
                // x
                //  x
                System.out.println(user1);
                finish = false;

            } else if (multArr[2][0].equals("X") && multArr[2][1].equals("X") && multArr[2][2].equals("X")) {
                //
                //
                //xxx
                System.out.println(user1);
                finish = false;

            } else if (multArr[0][2].equals("X") && multArr[1][2].equals("X") && multArr[2][2].equals("X")) {
                //  x
                //  x
                //  x
                System.out.println(user1);
                finish = false;

            } else if (multArr[0][1].equals("X") && multArr[1][1].equals("X") && multArr[2][1].equals("X")) {
                // x
                // x
                // x
                System.out.println(user1);
                finish = false;

            } else if (multArr[1][0].equals("X") && multArr[1][1].equals("X") && multArr[1][2].equals("X")) {
                //
                //xxx
                //
                System.out.println(user1);
                finish = false;

            } else if (multArr[2][0].equals("X") && multArr[1][1].equals("X") && multArr[0][2].equals("X")) {
                //  x
                // x
                //x
                System.out.println(user1);
                finish = false;

            }

            // OOO

            if (multArr[0][0].equals("O") && multArr[0][1].equals("O") && multArr[0][2].equals("O")) {
                // ooo
                //
                //
                System.out.println(user2);
                finish = false;

            } else if (multArr[0][0].equals("O") && multArr[1][0].equals("O") && multArr[2][0].equals("O")) {
                //o
                //o
                //o
                System.out.println(user2);
                finish = false;

            } else if (multArr[0][0].equals("O") && multArr[1][1].equals("O") && multArr[2][2].equals("O")) {
                //o
                // o
                //  o
                System.out.println(user2);
                finish = false;

            } else if (multArr[2][0].equals("O") && multArr[2][1].equals("O") && multArr[2][2].equals("O")) {
                //
                //
                //ooo
                System.out.println(user2);
                finish = false;

            } else if (multArr[0][2].equals("O") && multArr[1][2].equals("O") && multArr[2][2].equals("O")) {
                //  o
                //  o
                //  o
                System.out.println(user2);
                finish = false;

            } else if (multArr[0][1].equals("O") && multArr[1][1].equals("O") && multArr[2][1].equals("O")) {
                // o
                // o
                // o
                System.out.println(user2);
                finish = false;

            } else if (multArr[1][0].equals("O") && multArr[1][1].equals("O") && multArr[1][2].equals("O")) {
                //
                //ooo
                //
                System.out.println(user2);
                finish = false;

            } else if (multArr[2][0].equals("O") && multArr[1][1].equals("O") && multArr[0][2].equals("O")) {
                //  o
                // o
                //o
                System.out.println(user2);
                finish = false;

            }

        }

    }

}
