package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int cell = 0; cell < array.length; cell++) {
            for (int row = 0; row < array.length; row++) {
                //rsl = rsl + array[cell][row];
                if (array[cell][row] < 0) {
                    array[cell][row] = 0;
                }
            }
        }
        return array;
    }
}
