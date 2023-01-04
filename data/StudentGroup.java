/*Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.*/

package data;

import java.util.List;

public class StudentGroup {

    private Teacher teacher;
    private List<Student> studentNames;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List<Student> studentNames) {
        this.teacher = teacher;
        this.studentNames = studentNames;
    }

    public StudentGroup(Teacher teacher, List<Student> studentNames, int groupNumber) {
        this.teacher = teacher;
        this.studentNames = studentNames;
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<Student> studentNames) {
        this.studentNames = studentNames;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
