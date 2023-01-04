package data;

import data.User;

public class Teacher extends User {
    private String kafedra;

    public Teacher(String fio, int age, int passport, String kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }
}
