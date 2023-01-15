package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getI(int f) {
        Scanner scan = new Scanner(System.in);
        String command;
        while (true) {
            command = scan.nextLine();

            String[] cool = commandParser.parseCommand(command);

            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();

            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);

            commandExecutable.execute();
            scan.close();
        }
    }

 }
