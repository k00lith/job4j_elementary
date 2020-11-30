package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month += 1;
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

if (ivan <= nik) {
эта проверка не нужна
while (ivan < nik * 2) {
тут лучше проще
while (ivan =< nik) {
а остальное в цикле так как Иван должен обогнать

 */