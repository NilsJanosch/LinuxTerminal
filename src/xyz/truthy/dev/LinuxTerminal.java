package xyz.truthy.dev;

import xyz.truthy.dev.command.CommandManager;

public class LinuxTerminal {
    private boolean active;
    public static CommandManager commandManager = new CommandManager();
    public void start() {
        active = true;
        while (active) {

        }
    }
}
