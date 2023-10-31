package xyz.truthy.dev.command;

import java.util.List;

public class Command {
    private String command;
    List<String> parameters;

    public Command(String cmd) {
        command = cmd;
    }
    public void run() {

    }
    public String getCommand() {
        return command;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }
}
