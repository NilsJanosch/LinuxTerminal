package xyz.truthy.dev.command;

public class Command {
    private String command;
    public Command(String cmd) {
        command = cmd;
    }
    public void run() {

    }
    public String getCommand() {
        return command;
    }
}
