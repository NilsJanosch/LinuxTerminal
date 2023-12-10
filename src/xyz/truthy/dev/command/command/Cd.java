package xyz.truthy.dev.command.command;

import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.command.CommandManager;

public class Cd extends Command {
    public Cd() { super("cd"); }

    @Override
    public void run() {
        System.out.println(getParameters().toString());
        String[] path = System.getProperty("user.dir").split("\\\\");
        if (getParameters().size() != 1){
            if (getParameters().get(1).equals("..")) {
                for (int i = 0; i < path.length; i ++) {
                    System.out.println("..");
                    System.setProperty("user.dir", "C:\\");
                }
            }
        }
    }
}
