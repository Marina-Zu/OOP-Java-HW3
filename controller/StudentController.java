package controller;

import data.Student;
import service.DataService;

public class StudentController implements UserController<Student, Integer> {
    private final DataService<Student> studentService;  //вместо StudentService поставили абстракцию DataService<Student>
    // здесь должен быть либо абстрактный интерфейс, либо абстрактный класс (4 принцип SOLID)

    public StudentController(DataService<Student> studentService) {
        this.studentService = studentService;
    }


    @Override
    public Student create(Student entity) {
        return studentService.createUser(entity);
    }

     @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentService.findByFio(fio);
    }


}
