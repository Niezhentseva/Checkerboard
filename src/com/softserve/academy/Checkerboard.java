package com.softserve.academy;

public class Checkerboard {
    private int boardHeight; // checkerboard Height
    private int boardLength; // checkerboard length

    private final static String GAP_BOARD = "  ";
    private final static String BLACK_PAINT = "*";
    private final static String NEW_LINE = "\n";

    public Checkerboard(int boardHeight, int boardLength) {
        this.boardHeight = boardHeight;
        this.boardLength = boardLength;
    }

    public String drawCheckerboard() {
        StringBuilder vertical = new StringBuilder();
        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardLength; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append(GAP_BOARD);
                } else {
                    vertical.append(BLACK_PAINT);
                }
            }
            vertical.append(NEW_LINE);
        }
        return vertical.toString();
    }
}
