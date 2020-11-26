package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rslEuro = value / 70;
        return rslEuro;
    }

    public static double rubleToDollar(double value) {
        double rslBaks = value / 60;
        return rslBaks;
    }

    public static void main(String[] args) {
        //int euro = Converter.rubleToEuro(140);
        int euro = Converter.rubleToEuro(140);
        int expectedeuro = 2;
        boolean passedeuro = expectedeuro == euro;
        System.out.println("140 rubles are " + euro + " euro. Test:" + passedeuro);

        //double baks = Converter.rubleToDollar(140);
        double baks = Converter.rubleToDollar(140);
        int expectedbaks = 2;
        boolean passedbaks = expectedbaks == baks;
        System.out.println("140 rubles are " + baks + " dollars. Test:" + passedbaks);
    }
}
