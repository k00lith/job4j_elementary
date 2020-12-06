package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int tank) {
        this.load = tank;
    }

    public void exchange(Battery another) {
        this.load = this.load - load;
        another.load = another.load + load;
    }
}
