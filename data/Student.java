package data;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;
    private String department;

    public Student(String fio){
        super(fio);
    }

    public Student(String fio, int age, int passport, String department, int groupNumber) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
        this.department = department;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getAge(), student.getAge());
    }




}
