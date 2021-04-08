package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);                  // этот метод нужен для получения минимально элемента в массиве
            int index = FindLoop.indexOfStartFinish(data, min, i, data.length);   // этот метод нужен, чтобы получить индекс элемента, полученного из метода MinDiapason.findMin
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
