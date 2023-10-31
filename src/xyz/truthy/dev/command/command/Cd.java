package xyz.truthy.dev.command.command;

import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.command.CommandManager;

public class Cd extends Command {
    public Cd() { super("cd"); }

    @Override
    public void run() {
        System.out.println(getParameters().toString());
        if (getParameters().size() != 1){
            if (getParameters().get(1).equals("..")){
                System.out.println("..");
            }
        }
    }
}
