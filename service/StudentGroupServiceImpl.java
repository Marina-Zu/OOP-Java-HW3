/*Создать класс StudentGroupServiceImpl,
в котором реализована логика чтения Студентов и Преподавателя из файла txt
(реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
*/

package service;

import data.Student;
import data.StudentGroup;
import data.comparator.UserComparator;
import util.ReaderFromTxt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements DataServiceGroup{
    private StudentGroup studentGroup;

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Poul", 18, 123, 5),
                new Student("Kris", 18, 456, 6),
                new Student("Jack", 19, 789, 5)
        );

        System.out.println(studentList);

        Collections.sort(studentList, new UserComparator());
        System.out.println(studentList);
    }

    public StudentGroup getGroup(){
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(),
                ReaderFromTxt.getStudentsFromTxt());
    }

    public void sortStudents(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
        Collections.sort(studentGroup.getStudentNames());
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
          while (studentGroup.hasNext()){
              Student student = studentGroup.next();
              if(fio.equals(student.getFio())){
                  studentGroup.remove();
              }
          }
    }


}