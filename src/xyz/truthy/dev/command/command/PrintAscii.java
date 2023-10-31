package xyz.truthy.dev.command.command;

import xyz.truthy.dev.Ascii;
import xyz.truthy.dev.command.Command;
import xyz.truthy.dev.util.Console;
import java.util.Scanner;

public class PrintAscii extends Command {
    public PrintAscii() { super("print.ascii"); }
    Scanner asciiinput = new Scanner(System.in);
    @Override
    public void run() {
        System.out.print("> ");
        String ascinp = asciiinput.nextLine();
        String[] ascinpp = ascinp.split(" ");
        for (int i = 0; i < ascinpp.length; i ++) {
            Ascii.printAscii(ascinpp[i]);
        }
    }
}
