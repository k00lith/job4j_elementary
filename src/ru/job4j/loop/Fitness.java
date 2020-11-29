package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan <= nik) {
            while (ivan < nik * 2) {
                ivan *= 3;
                month += 1;
            }
        }
        return month;
    }
}

/*
Fitness.calc(50, 90);
150 = 2 month
180
Ivan *3
Nik *2
 */