package xyz.truthy.dev.command.command;

import xyz.truthy.dev.command.Command;

public class Pwd extends Command {
    public Pwd(){ super("pwd"); }

    @Override
    public void run() {
        System.out.println(System.getProperty("user.dir"));
    }
}
