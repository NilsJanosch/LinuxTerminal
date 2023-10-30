package xyz.truthy.dev.command.command;

import xyz.truthy.dev.LinuxTerminal;
import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.util.Console;

import java.util.List;

public class Help extends Command {
    public Help() {
        super("Help");
    }

    @Override
    public void run() {
        List<Command> commandList = LinuxTerminal.commandManager.getCommands();

        for (Command command : commandList) {
            Console.println(command.getCommand());
        }
    }
}
