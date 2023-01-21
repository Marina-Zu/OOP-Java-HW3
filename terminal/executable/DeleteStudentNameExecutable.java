package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentNameExecutable implements CommandExecutable{
    private StudentService studentService;
    private Student student;

    public DeleteStudentNameExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public void execute() {
        studentService.deleteStudentsName(student.getFio());
        System.out.println("Студент" + student + "удален из списка \n" );

    }
}
