package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int quantity);

    int fill(int fuel);

}
