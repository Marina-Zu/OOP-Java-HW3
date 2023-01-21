package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public static TerminalReader getInstance(CommandParser commandParser,
                                             CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    public void runReader(int f) {
        Scanner scan = new Scanner(System.in);
        String command;
        while (true) {
            command = scan.nextLine();

            Command cool = commandParser.parseCommand(command);

            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);

            commandExecutable.execute();

        }
    }

}
