package ru.job4j.ex;

public class FindMaxLenght {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            if (shops[index] != null) {
                if (shops[index].length() > max) {
                    max = shops[index].length();
                }
            }
        }
        System.out.println("Max length : " + max);
    }
}
