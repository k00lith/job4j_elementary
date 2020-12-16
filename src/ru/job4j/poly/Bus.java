package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("In-Out");
    }

    @Override
    public int fill(int fuel) {
        return 0;
    }
}
