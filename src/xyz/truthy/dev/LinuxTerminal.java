package xyz.truthy.dev;

import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.command.CommandManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinuxTerminal {
    private boolean active;
    public static CommandManager commandManager = new CommandManager();
    public void start() {
        active = true;
        Ascii.printAscii("Linux");
        Scanner cmdinput = new Scanner(System.in);
        while (active) {
            System.out.print("$ ");
            String usercom = cmdinput.nextLine();

            String[] parameter = usercom.split(" ");
            List<String> parameterTrim = Arrays.stream(parameter).toList();
            for (Command command : commandManager.getCommands()) {
                if (parameterTrim.get(0).equals(command.getCommand())){
                    command.run();
                    if (parameterTrim.size() > 1) {
                        if (usercom.split(" ")[1] != null) {
                            command.setParameters(parameterTrim);
                        }
                    }
                }
            }
        }
    }
}
