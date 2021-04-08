package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static int move(String player, int count) {
        Scanner inputPlayer = new Scanner(System.in);
        System.out.println(player + ", возьмите спички от 1 до 3 шт");
        int selectPlayer = Integer.valueOf(inputPlayer.nextLine());
        if (selectPlayer < 1 || selectPlayer > 3) {
            System.out.println("Ошибка ввода, необходимо ввести число от 1 до 3 включительно. Переход хода");
            return 0;
        } else {
            count = count - selectPlayer;
            System.out.println("Остаток: " + count);
            return count;
        }
    }

    public static void main(String[] args) {
        int rsl = 11;
        String winner = "Player1 win";
        while (rsl > 0) {
            rsl = move("Player1", rsl);
            winner = "Player1 win";
            if (rsl == 0) {
                break;
            }
            rsl = move("Player2", rsl);
            winner = "Player2 win";
        }
        System.out.println(winner);
    }
}
