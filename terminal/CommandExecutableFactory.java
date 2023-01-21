package terminal;

import terminal.executable.CommandExecutable;

public interface CommandExecutableFactory{
    CommandExecutable create(Command command);
}
