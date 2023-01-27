package repository;

/** Реализовать класc TeacherRepository (обобщение на ваше усмотрение)*/
import data.Student;
import data.Teacher;

import java.util.Collection;

public class TeacherRepository implements UserRepository<Teacher,Integer> {

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return false;
    }

    @Override
    public Collection<Teacher> findAll() {
        return null;
    }

    @Override
    public Teacher findByFio(String fio) {
        return null;
    }
}
