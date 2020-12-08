package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String specialization;

    public String getSpecialization() {
        return this.specialization;
    }

    public Diagnosis heal(Pacient pacient) {
        return null;

    }
}
