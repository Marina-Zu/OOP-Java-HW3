package repository;

import data.Student;

/** - Создать класc StudentRepository имплементировав интерфейс UserRepository */
public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
