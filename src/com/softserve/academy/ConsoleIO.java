package com.softserve.academy;

import java.util.Scanner;

public class ConsoleIO {
    static Scanner scanner = new Scanner(System.in);

    public static String enterAttribute() {
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }

    public static void printToConsole(String message) {
        System.out.println(message);
    }

}
