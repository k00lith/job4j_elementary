package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner inputPlayer1 = new Scanner(System.in);
        Scanner inputPlayer2 = new Scanner(System.in);
        boolean run  = true;
        int matches = 11;
        while (run) {
            System.out.println("Player1, возьмите спички от 1 до 3 шт");
            int selectPlayer1 = Integer.valueOf(inputPlayer1.nextLine());
            matches = matches - selectPlayer1;
            System.out.println(matches);
            if (matches == 0) {
                run = false;
                System.out.println("Player1 win!");
                break;
            }
            System.out.println("Player2, возьмите спички от 1 до 3 шт");
            int selectPlayer2 = Integer.valueOf(inputPlayer2.nextLine());
            matches = matches - selectPlayer2;
            System.out.println(matches);
            if (matches == 0) {
                run = false;
                System.out.println("Player2 win!");
                break;
            }
        }
    }
}
