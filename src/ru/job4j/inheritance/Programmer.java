package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education, String birthday, String department, String language) {
        super(name, surname, education, birthday, department);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public Progress stat(Programm programm) {
        return null;

    }
}
