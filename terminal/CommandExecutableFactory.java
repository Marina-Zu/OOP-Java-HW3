package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.*;

public class CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutableFactory() {
        this.studentService = null;
    }

    public CommandExecutable create(String[] input) {

        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));      // имя студента
        } else if (input[0].equals("/delete")) {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteStudentName")) {
            return new DeleteStudentName(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteStudentGroupAndAge")) {
            return new DeleteStudentGroupAndAge(studentService, new Student(input[1]));
        } else
            return null;
    }

}
