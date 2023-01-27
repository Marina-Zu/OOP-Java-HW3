package terminal.view;

import terminal.executable.CommandResult;

public class ResultViewImpl implements ResultView {

    @Override
    public void processCommandResult(CommandResult commandResult) {
        System.out.println(commandResult);
    }
}