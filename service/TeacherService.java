package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;
import data.comparator.UserComparator;
import repository.TeacherRepository;

import java.util.Collections;
import java.util.List;

/**
 * Реализовать методы поиска и сохранения в классе TeacherService
 */
public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public Teacher createUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByFio(String lastName) {
        return teacherRepository.findByFio(lastName);
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return false;
    }

    @Override
    public void sortUsers(List<Teacher> users) {
        this.sortUsersByName(users);
    }

    @Override
    public void sortUsersByName(List<Teacher> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

}
