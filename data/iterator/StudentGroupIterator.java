package data.iterator;

import data.Student;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;


public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
//    private Iterator<Student> students;

    private List<Student> students;
    private int cursor;

    public StudentGroupIterator (StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
//        this.students = studentGroup.getStudentNames().iterator();
        this.students = studentGroup.getStudentNames();
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
//        return this.students.hasNext();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
//        return this.students.next();
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
//        this.students.remove();
    }
}
