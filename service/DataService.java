package service;

import data.Student;
import data.StudentGroup;
import data.User;

import java.util.List;

public interface DataService <U extends User>{
    U createUser(U user);

    U findById(Integer id);

    U findByFio(String lastName);

    void sortUsers(List<U> users);

    void sortUsersByName(List<U> users);


    StudentGroup getGroup(int number);
}
