package service;
/**
 * - В классе StudentService добавить новую переменную StudentRepository
 * - В классе StudentService реализовать методы сохранения студента и его поиска по id и ФИО.
 */


import data.Student;
import data.StudentGroup;
import data.comparator.UserComparator;
import repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements DataService<Student> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void deleteStudents(Student student){

    }

    public void deleteStudentsName (Student name){

    }

    public void deleteStudentGroupAndAge (int groupNumber, int age){

    }

    @Override
    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByFio(String lastName) {
        return studentRepository.findByFio(lastName);
    }


    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }





}
