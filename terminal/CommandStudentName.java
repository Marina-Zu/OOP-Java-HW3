package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.DeleteStudentName;

public class CommandStudentName {
    private StudentService studentService;
    public DeleteStudentName deleteStudentName(String name) {
        return new DeleteStudentName(studentService, new Student(name));
    }


}
