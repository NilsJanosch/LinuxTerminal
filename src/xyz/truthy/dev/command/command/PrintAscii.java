package xyz.truthy.dev.command.command;

import xyz.truthy.dev.Ascii;
import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.util.Console;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintAscii extends Command {
    public PrintAscii() { super("print.ascii"); }
    Scanner asciiinput = new Scanner(System.in);
    @Override
    public void run() {
        System.out.print("> ");
        String ascinp = asciiinput.nextLine();
        String[] ascinpp = ascinp.split(" ");
        List<String> asciinp = Arrays.stream(ascinpp).toList();
        for (String s : asciinp) {
            Ascii.printAscii(s);
        }
    }
}
