package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static int move(String player) {
        Scanner inputPlayer = new Scanner(System.in);
        System.out.println(player + ", возьмите спички от 1 до 3 шт");
        int selectPlayer = Integer.valueOf(inputPlayer.nextLine());
        if (selectPlayer < 1 || selectPlayer > 3) {
            System.out.println("Ошибка ввода, необходимо ввести число от 1 до 3 включительно. Переход хода");
            return 0;
        } else {
            return selectPlayer;
        }
    }

    public static void main(String[] args) {
        boolean run = true;
        int matches = 11;
        while (run) {
            matches = matches - move("Player1");
            System.out.println("Остаток " + matches);
            if (matches <= 0) {
                System.out.println("Player1 win!");
                run = false;
                break;
            }
            matches = matches - move("Player2");
            System.out.println("Остаток " + matches);
            if (matches <= 0) {
                System.out.println("Player2 win!");
                run = false;
                break;
            }
        }
    }
}
