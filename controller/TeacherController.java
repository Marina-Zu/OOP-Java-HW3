package controller;

import data.Teacher;
import repository.TeacherRepository;

public class TeacherController extends TeacherRepository {
    private TeacherController teacherController;

    public TeacherController(TeacherController teacherController) {
        this.teacherController = teacherController;
    }

    @Override
    public Teacher save(Teacher entity) {
        return teacherController.save(entity);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherController.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherController.findByFio(fio);
    }
}
