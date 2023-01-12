package service;
/**
 * - В классе StudentService добавить новую переменную StudentRepository
 * - В классе StudentService реализовать методы сохранения студента и его поиска по id и ФИО.
 */


import data.Student;
import data.StudentGroup;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentService implements DataService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }

    @Override
    public StudentGroup getGroup() {
        return null;
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

    public Student saveStudent(Student entity) {
        return studentRepository.save(entity);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
}
