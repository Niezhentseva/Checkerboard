package com.softserve.academy;

public class Checkerboard {
    private int boardHeight; // checkerboard Height
    private int boardLength; // checkerboard length

    // checkerboard Height and checkerboard length have to be positive numbers
    Checkerboard(String boardHeight, String boardLength) throws NumberFormatException {
        this.boardHeight = Integer.parseInt(boardHeight);
        this.boardLength = Integer.parseInt(boardLength);
        if (this.boardHeight <= 0 || this.boardLength <= 0) {
            throw new IllegalArgumentException("");
        }
    }

    // the method draws a checkerboard
    String drawCheckerboard() {
        StringBuilder vertical = new StringBuilder();
        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardLength; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append("  ");
                } else {
                    vertical.append("*");
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }
}
