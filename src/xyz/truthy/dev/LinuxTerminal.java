package xyz.truthy.dev;

import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.command.CommandManager;

import java.util.ArrayList;
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
            List<String> parameterTrim = new ArrayList<>(Arrays.stream(parameter).toList());
            parameterTrim.remove(0);
            for (Command command : commandManager.getCommands()) {
                if (command.getCommand().equals(parameter[0])) {
                    command.setParameters(parameterTrim);
                    command.run();
                }
            }
        }
    }
}
