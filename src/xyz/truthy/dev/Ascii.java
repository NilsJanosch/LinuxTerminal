package xyz.truthy.dev;

import java.util.Scanner;

public class Ascii {
    private static String currentTheme = "purple";
    private static String font = "modern";
    public static void setTheme(String theme) {
        currentTheme = theme;
    }
    public static void setFont(String font) {
        Ascii.font = font;
    }
    public static void print(String text) {
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            int red = 0;
            int green = 0;
            int blue = 0;

            if ("purple".equals(currentTheme)) {
                red = 128 + ((i * 127) / textLength);
                green = 128;
                blue = 255 - ((i * 127) / textLength);
            } else if ("blue".equals(currentTheme)) {
                red = 0;
                green = 200;
                blue = 255 - ((i * 100) / textLength);
            } else if ("green".equals(currentTheme)) {
                red = 0;
                green = 255 - ((i * 127) / textLength);
                blue = 150;
            } else if ("light".equals(currentTheme)) {
                red = 255 - ((i * 127) / textLength);
                green = 255 - ((i * 127) / textLength);
                blue = 250;
            } else if ("orange".equals(currentTheme)) {
                red = 255 - ((i * 127) / textLength);
                green = 100;
                blue = 0;
            }

            String coloredText = String.format(
                    "\u001B[38;2;%d;%d;%dm%s\u001B[0m",
                    red, green, blue, currentChar
            );
            System.out.print(coloredText);
        }
    }

    public static void printAscii(String text) {
        text = text.toLowerCase();
        String[] asciiLines = new String[10];

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            String[] asciiCharacter = getAscii(current).split("\n");

            for (int j = 0; j < asciiCharacter.length; j++) {
                if (i == 0) {
                    asciiLines[j] = asciiCharacter[j];
                } else {
                    asciiLines[j] += " " + asciiCharacter[j];
                }
            }
        }
        for (String line : asciiLines) {
            if (line== null) {
                print("");
                return;
            }
            print(line);
            System.out.println();
        }
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void enterToContinue() {
        Scanner scanner = new Scanner(System.in);
        print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    private static String getAscii(char current) {
        switch (current) {
            case 'a':
                return "\n" +
                        " █████╗ \n" +
                        "██╔══██╗\n" +
                        "███████║\n" +
                        "██╔══██║\n" +
                        "██║  ██║\n" +
                        "╚═╝  ╚═╝";
            case 'b':
                return "\n" +
                        "██████╗\n" +
                        "██╔══██╗\n" +
                        "██████╦╝\n" +
                        "██╔══██╗\n" +
                        "██████╦╝\n" +
                        "╚═════╝ ";
            case 'c':
                return "\n" +
                        " █████╗\n" +
                        "██╔══██╗\n" +
                        "██║  ╚═╝\n" +
                        "██║  ██╗\n" +
                        "╚█████╔╝\n" +
                        " ╚════╝";
            case 'd':
                return "\n" +
                        "██████╗ \n" +
                        "██╔══██╗\n" +
                        "██║  ██║\n" +
                        "██║  ██║\n" +
                        "██████╔╝\n" +
                        "╚═════╝ ";
            case 'e':
                return "\n" +
                        "███████╗\n" +
                        "██╔════╝\n" +
                        "█████╗  \n" +
                        "██╔══╝  \n" +
                        "███████╗\n" +
                        "╚══════╝";
            case 'f':
                return "\n" +
                        "███████╗\n" +
                        "██╔════╝\n" +
                        "█████╗  \n" +
                        "██╔══╝  \n" +
                        "██║     \n" +
                        "╚═╝     ";
            case 'g':
                return "\n" +
                        " ██████╗ \n" +
                        "██╔════╝ \n" +
                        "██║  ██╗ \n" +
                        "██║  ╚██╗\n" +
                        "╚██████╔╝\n" +
                        " ╚═════╝ ";
            case 'h':
                return "\n" +
                        "██╗  ██╗\n" +
                        "██║  ██║\n" +
                        "███████║\n" +
                        "██╔══██║\n" +
                        "██║  ██║\n" +
                        "╚═╝  ╚═╝";
            case 'i':
                return "\n" +
                        "██╗\n" +
                        "██║\n" +
                        "██║\n" +
                        "██║\n" +
                        "██║\n" +
                        "╚═╝";
            case 'j':
                return "\n" +
                        "     ██╗\n" +
                        "     ██║\n" +
                        "     ██║\n" +
                        "██╗  ██║\n" +
                        "╚█████╔╝\n" +
                        " ╚════╝ ";
            case 'k':
                return "\n" +
                        "██╗  ██╗\n" +
                        "██║ ██╔╝\n" +
                        "█████═╝ \n" +
                        "██╔═██╗ \n" +
                        "██║ ╚██╗\n" +
                        "╚═╝  ╚═╝";
            case 'l':
                return "\n" +
                        "██╗     \n" +
                        "██║     \n" +
                        "██║     \n" +
                        "██║     \n" +
                        "███████╗\n" +
                        "╚══════╝";
            case 'm':
                return "\n" +
                        "███╗   ███╗\n" +
                        "████╗ ████║\n" +
                        "██╔████╔██║\n" +
                        "██║╚██╔╝██║\n" +
                        "██║ ╚═╝ ██║\n" +
                        "╚═╝     ╚═╝";
            case 'n':
                return "\n" +
                        "███╗  ██╗\n" +
                        "████╗ ██║\n" +
                        "██╔██╗██║\n" +
                        "██║╚████║\n" +
                        "██║ ╚███║\n" +
                        "╚═╝  ╚══╝";
            case 'o':
                return "\n" +
                        " █████╗ \n" +
                        "██╔══██╗\n" +
                        "██║  ██║\n" +
                        "██║  ██║\n" +
                        "╚█████╔╝\n" +
                        " ╚════╝ ";
            case 'p':
                return "\n" +
                        "██████╗ \n" +
                        "██╔══██╗\n" +
                        "██████╔╝\n" +
                        "██╔═══╝ \n" +
                        "██║     \n" +
                        "╚═╝     ";
            case 'q':
                return "\n" +
                        " ██████╗ \n" +
                        "██╔═══██╗\n" +
                        "██║██╗██║\n" +
                        "╚██████╔╝\n" +
                        " ╚═██╔═╝ \n" +
                        "   ╚═╝   ";
            case 'r':
                return "\n" +
                        "██████╗ \n" +
                        "██╔══██╗\n" +
                        "██████╔╝\n" +
                        "██╔══██╗\n" +
                        "██║  ██║\n" +
                        "╚═╝  ╚═╝";
            case 's':
                return "\n" +
                        " ██████╗\n" +
                        "██╔════╝\n" +
                        "╚█████╗ \n" +
                        " ╚═══██╗\n" +
                        "██████╔╝\n" +
                        "╚═════╝ ";
            case 't':
                return "\n" +
                        "████████╗\n" +
                        "╚══██╔══╝\n" +
                        "   ██║   \n" +
                        "   ██║   \n" +
                        "   ██║   \n" +
                        "   ╚═╝   ";
            case 'u':
                return "\n" +
                        "██╗   ██╗\n" +
                        "██║   ██║\n" +
                        "██║   ██║\n" +
                        "██║   ██║\n" +
                        "╚██████╔╝\n" +
                        " ╚═════╝ ";
            case 'v':
                return "\n" +
                        "██╗   ██╗\n" +
                        "██║   ██║\n" +
                        "╚██╗ ██╔╝\n" +
                        " ╚████╔╝ \n" +
                        "  ╚██╔╝  \n" +
                        "   ╚═╝   ";
            case 'w':
                return "\n" +
                        " ██╗       ██╗\n" +
                        " ██║  ██╗  ██║\n" +
                        " ╚██╗████╗██╔╝\n" +
                        "  ████╔═████║ \n" +
                        "  ╚██╔╝ ╚██╔╝ \n" +
                        "   ╚═╝   ╚═╝  ";
            case 'x':
                return "\n" +
                        "██╗  ██╗\n" +
                        "╚██╗██╔╝\n" +
                        " ╚███╔╝ \n" +
                        " ██╔██╗ \n" +
                        "██╔╝╚██╗\n" +
                        "╚═╝  ╚═╝";
            case 'y':
                return "\n" +
                        "██╗   ██╗\n" +
                        "╚██╗ ██╔╝\n" +
                        " ╚████╔╝ \n" +
                        "  ╚██╔╝  \n" +
                        "   ██║   \n" +
                        "   ╚═╝   ";
            case 'z':
                return "\n" +
                        "███████╗\n" +
                        "╚════██║\n" +
                        "  ███╔═╝\n" +
                        "██╔══╝  \n" +
                        "███████╗\n" +
                        "╚══════╝";
            default:
                return " ";
        }
    }
}
