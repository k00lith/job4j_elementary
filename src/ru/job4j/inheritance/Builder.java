package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String typeOfWorks;

    public Builder(String name, String surname, String education, String birthday, String department, String typeOfWorks) {
        super(name, surname, education, birthday, department);
        this.typeOfWorks = typeOfWorks;
    }

    public String getTypeOfWorks() {
        return this.typeOfWorks;
    }

    public Staffing quantity(Area area) {
        return null;

    }

}
