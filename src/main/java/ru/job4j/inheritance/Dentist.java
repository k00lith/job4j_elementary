package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean prosthesist;

    public Dentist(String name, String surname, String education, String birthday, String specialization, boolean prosthesist) {
        super(name, surname, education, birthday, specialization);
        this.prosthesist = prosthesist;
    }

    public boolean getProsthesist() {
        return this.prosthesist;
    }

    public Quantity repare(Tooth tooth) {
        return null;

    }

}
