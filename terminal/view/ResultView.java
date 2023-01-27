package terminal.view;

import terminal.executable.CommandResult;


public interface ResultView {
    void processCommandResult(CommandResult commandResult);
}