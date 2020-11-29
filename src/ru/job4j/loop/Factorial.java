package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n != 0 && n != 1) {
            for (int index = 1; index <= n; index++) {
                result = result * index;
            }
        }
        if (n == 0 || n == 1) {
            result = 1;
        }
        return result;
    }
}

/*
Факториал для числа 5 будет равен 120 (1 * 2 * 3 * 4 * 5).
Факториал для числа 0 равен 1.
Факториал для числа 1 равен 1.
 */