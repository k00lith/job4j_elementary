package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String variety;

    public Surgeon(String name, String surname, String education, String birthday, String specialization, String variety) {
        super(name, surname, education, birthday, specialization);
        this.variety = getVariety();
    }


    public String getVariety() {
        return this.variety;
    }

    public Quantity repare(Part part) {
        return null;

    }
}
