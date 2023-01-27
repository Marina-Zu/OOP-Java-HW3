package terminal;

import java.util.ArrayList;
import java.util.List;

public class Command {
    public static final String ADD = "/add";
    public static final String DEL = "/delete";
    public static final String DELBYNAME = "/deleteByName";
    public static final String BY_NAME = "-name";
    private List<String> arguments;
    private String mainFirstCommand;

//    public Command(List<String> arguments, String mainFirstCommand) {
//        this.arguments = arguments;
//        this.mainFirstCommand = mainFirstCommand;
//    }

    public Command(List<String> commands) {
        this.mainFirstCommand = commands.get(0);
        this.arguments = new ArrayList<>(commands);

        if (arguments.size() > 0) {
            arguments.remove(0);
        }
    }
    public String getFirstArgument(){
        return arguments.get(0);
    }
    public boolean isAddCommand(){
        return mainFirstCommand.equals(ADD);
    }
    public boolean isDeleteCommand(){
        return mainFirstCommand.equals(DEL) && !arguments.isEmpty() && arguments.get(0).equals(BY_NAME);
    }
    public boolean isDeleteByNameCommand(){return mainFirstCommand.equals(DELBYNAME);}

    @Override
    public String toString() {
        return "Command{" +
                "mainCommand='" + mainFirstCommand + '\'' +
                ", attributes=" + arguments +
                '}';
    }
}
