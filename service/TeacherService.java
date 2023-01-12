package service;

import data.StudentGroup;
import data.Teacher;
import data.User;
import repository.Repository;

/**
 * Реализовать методы поиска и сохранения в классе TeacherService
 */
public class TeacherService implements DataService {

    private final Repository<Teacher, Integer> teacherIntegerRepository;

    public TeacherService(Repository<Teacher, Integer> teacherIntegerRepository) {
        this.teacherIntegerRepository = teacherIntegerRepository;
    }

    public Teacher findTeacher(int groupNumber) {
        return teacherIntegerRepository.findById(groupNumber);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherIntegerRepository.save(teacher);
    }

    public void create(User user) {

    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public StudentGroup getGroup() {
        return null;
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }
}
