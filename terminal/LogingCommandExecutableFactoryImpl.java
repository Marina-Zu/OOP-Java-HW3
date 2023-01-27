package terminal;

import service.StudentService;
import terminal.executable.CommandExecutable;

public class LogingCommandExecutableFactoryImpl extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactoryImpl(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.printf("Geek");
        return result;
    }

}
