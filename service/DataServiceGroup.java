package service;

import data.Student;
import data.StudentGroup;
import data.User;

public interface DataServiceGroup {

    StudentGroup getGroup(int number);

    void remove(Student fio);
}

