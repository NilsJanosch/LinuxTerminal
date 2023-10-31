package xyz.truthy.dev.command;

import xyz.truthy.dev.command.command.*;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commands = new ArrayList<>();

    public CommandManager() {
        registerCommands();
    }

    private void registerCommands() {
        registerCommand(new Exit());
        registerCommand(new Help());
        registerCommand(new Pwd());
        registerCommand(new Cd());
        registerCommand(new PrintAscii());
    }
    private void registerCommand(Command command) {
        commands.add(command);
    }
    public List<Command> getCommands() {
        return commands;
    }
}
