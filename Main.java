import repository.StudentRepository;
import service.StudentService;
import terminal.CommandExecutableFactory;
import terminal.CommandExecutableFactoryImpl;
import terminal.TerminalReader;
import terminal.menu.Menu;
import terminal.parser.CommandParser;
import terminal.parser.CommandParserImpl;
import terminal.view.ResultView;
import terminal.view.ResultViewImpl;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();
        ResultView view = new ResultViewImpl();

        Menu.display();
        TerminalReader.getInstance(parser, factory, view)
                .runReader();







//        List  <Student> sortStudents = Arrays.asList(
//                new Student("Poul", 18, 123, "Mathematics",5),
//                new Student("Kris", 18, 456, "Mathematics", 6),
//                new Student("Jack", 19, 789, "Physics",5)
//        );
//
//        System.out.println(sortStudents);
//
//        Collections.sort(sortStudents, new UserComparator()); // сортировка студентов
//        System.out.println(sortStudents);
    }

}
