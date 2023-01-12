package controller;

import data.Student;
import repository.StudentRepository;

public class StudentController extends StudentRepository {
    private StudentController studentController;

    public StudentController(StudentController studentController) {
        this.studentController = studentController;
    }

    @Override
    public Student save(Student entity) {
        return studentController.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentController.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentController.findByFio(fio);
    }
}
