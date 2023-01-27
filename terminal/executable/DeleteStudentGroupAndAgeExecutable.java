package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentGroupAndAgeExecutable implements CommandExecutable{
    private StudentService studentService;
    private Student student;

    private Student studentDel;

    public DeleteStudentGroupAndAgeExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public CommandResult execute() {
        studentService.deleteStudentGroupAndAge(student.getGroupNumber(), student.getAge());
        System.out.println("Студент" + student + "удален из списка \n" );

        return null;
    }
}
