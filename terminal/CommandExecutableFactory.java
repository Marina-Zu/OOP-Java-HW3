package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;
import terminal.executable.DeleteStudentExecutable;

public class CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutableFactory() {
        this.studentService = studentService;
    }

    public CommandExecutable create(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));  //имя студента
        }

        else {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }
    }

}
