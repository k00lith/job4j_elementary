package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private int group;
    private Date created;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setGroup(5);
        student.setCreated(new Date());
        System.out.println(student.getFio() + " зачислен в группу: " + student.getGroup() + ", " + student.getCreated());
    }
}
