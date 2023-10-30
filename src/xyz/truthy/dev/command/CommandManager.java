package xyz.truthy.dev.command;

import xyz.truthy.dev.command.command.Example;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commands = new ArrayList<>();

    public CommandManager() {
        registerCommands();
    }

    private void registerCommands() {
        registerCommand(new Example());
    }
    private void registerCommand(Command command) {
        commands.add(command);
    }
    public List<Command> getCommands() {
        return commands;
    }
}
