package com.softserve.academy;

import java.util.Scanner;

public class InputAttributeChecker {
    private int[] sides = new int[2];

    public int[] enterAttributeChecker() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sides.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Checkerboard\nheight: ");
                    break;
                case 1:
                    System.out.print("length: ");
                    break;
            }
            sides[i] = scanner.nextInt();
        }
        return sides;
    }

}
