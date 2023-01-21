package terminal;

import java.util.List;

public class Command {
    private static final String ADD = "/add";
    private static final String DEL = "/delete";
    private static final String DELNAME = "/deleteStudentName";
    private List<String> arguments;
    private String mainFirstCommand;

    public Command(List<String> arguments, String mainFirstCommand) {
        this.arguments = arguments;
        this.mainFirstCommand = mainFirstCommand;
    }
    public String getFirstArgument(){
        return arguments.get(0);
    }
    public boolean isCreateCommand(){
        return mainFirstCommand.equals(ADD);
    }
    public boolean isDeleteCommand(){
        return mainFirstCommand.equals(DEL);
    }
    public boolean isDeleteNameCommand(){return mainFirstCommand.equals(DELNAME);}
}
