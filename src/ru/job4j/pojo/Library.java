package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Peter Pen", 200);
        Book book2 = new Book("Clean Code", 300);
        Book book3 = new Book("Bible", 500);
        Book[] libra = new Book[3];
        libra[0] = book1;
        libra[1] = book2;
        libra[2] = book3;
        for (int i = 0; i < libra.length; i++) {
            System.out.println(libra[i].getName());
        }
        Book temp = libra[0];
        libra[0] = libra[2];
        libra[2] = temp;
        for (int i = 0; i < libra.length; i++) {
            System.out.println(libra[i].getName());
        }
        for (int i = 0; i < libra.length; i++) {
            if (libra[i].getName().equals("Clean Code")) {
                System.out.printf(libra[i].getName());
            }
        }

    }
}
