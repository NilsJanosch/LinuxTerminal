package xyz.truthy.dev.command.command;

import xyz.truthy.dev.command.Command;

public class Exit extends Command {
    public Exit() {
        super("exit");
    }

    @Override
    public void run() {
        System.exit(130);
    }
}
