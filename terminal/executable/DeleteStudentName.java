package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentName implements CommandExecutable{
    private StudentService studentService;
    private Student student;

    public DeleteStudentName(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public void execute() {
        studentService.deleteStudentsName(student.getFio());
        System.out.println("Студент" + student + "удален из списка \n" );

    }
}
