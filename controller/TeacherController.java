package controller;

import data.Teacher;
import service.TeacherService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher entity) {
        return teacherService.createUser(entity);
    }
     @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findByFio(fio);
    }
}
