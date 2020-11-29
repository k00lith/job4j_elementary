package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        //boolean prime = true;
        boolean prime = number != 1 ? true : false;
        for (int index = 2; index <= number - 1; index++) {
            if (number % 2 == 0) {
                prime = false;
            }
            break;
        }
        return prime;
    }
}

