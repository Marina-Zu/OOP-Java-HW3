/**
 * Создать класс StudentGroupServiceImpl,
 * в котором реализована логика чтения Студентов и Преподавателя из файла txt
 * (реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
 * - В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
 * - В классе StudentGroupServiceImpl реализовать методы сохранения группы и поиска её по номеру
 */

/**- В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
 - В классе StudentGroupServiceImpl реализовать методы сохранения группы и поиска её по номеру*/

package service;

import data.Student;
import data.StudentGroup;
import repository.Repository;
import util.ReaderFromTxt;

import java.util.Iterator;

public class StudentGroupServiceImpl implements DataServiceGroup {
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return studentGroupIntegerRepository.findById(groupNumber);
    }


    public StudentGroup getGroup() {
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(),
                ReaderFromTxt.getStudentsFromTxt());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return new StudentGroup
                (ReaderFromTxt.getTeacherFromTxt(),
                        ReaderFromTxt.getStudentsFromTxt(),
                        number);
    }

    @Override
    public void remove(Student fio) {
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }
    }


}