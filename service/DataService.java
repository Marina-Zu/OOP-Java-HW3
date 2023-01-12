package service;

import data.StudentGroup;
import data.User;

public interface DataService <U extends User>{
    void create(User user);
    User read(User user);
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

}
