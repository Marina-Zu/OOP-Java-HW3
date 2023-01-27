package repository;

import data.Student;
import db.StudentTable;

import java.util.Collection;

/** - Создать класc StudentRepository имплементировав интерфейс UserRepository */
public class StudentRepository implements UserRepository<Student, Integer> {
    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }

    @Override
    public Student save(Student entity) {

        return studentTable.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return studentTable.deleteByFio(lastName);
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

    @Override
    public Collection<Student> findAll() {
        return studentTable.getElements();
    }



}
