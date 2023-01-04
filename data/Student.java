package data;

import service.DataService;

public class Student extends User {
    private int grupNumber;

    public Student(String fio, int age, int passport, int grupNumber) {
        super(fio, age, passport);
        this.grupNumber = grupNumber;
    }


}
