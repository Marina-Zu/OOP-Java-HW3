package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.*;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    public CommandExecutable create(Command input) {

        if (input.isAddCommand()) {
            return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));      // имя студента
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteByNameCommand()) {
            return new DeleteStudentNameExecutable(studentService, new Student(input.getFirstArgument()));
//        } else if (input[0].equals("/deleteStudentGroupAndAge")) {
//            return new DeleteStudentGroupAndAge(studentService, new Student(input[1]));
        } else
            return null;
    }

}
