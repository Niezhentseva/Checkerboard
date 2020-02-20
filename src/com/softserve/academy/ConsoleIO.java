package com.softserve.academy;

import java.util.Scanner;

public class ConsoleIO {
    static Scanner scanner;
    private final static String informNoInt = "You entered wrong argument. " +
            "Please, enter only integer number";

    public static int enterAttribute() {
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            printToConsole(informNoInt);
            return enterAttribute();
        }
    }

    public static void closeScanner() {
        scanner.close();
    }

    public static void printToConsole(String message) {
        System.out.println(message);
    }
}
