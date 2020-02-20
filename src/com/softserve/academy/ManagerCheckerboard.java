/* 1.	Шахматная доска
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
Программа запускается через вызов главного класса с параметрами.
 */

package com.softserve.academy;

public class ManagerCheckerboard {
    private final static String informHeight = "Enter a checkerboard height value";
    private final static String informLength = "Enter a checkerboard length value";

    public static void main(String[] args) {
        ConsoleIO.printToConsole(informHeight);
        String height = ConsoleIO.enterAttribute();
        ConsoleIO.printToConsole(informLength);
        String length = ConsoleIO.enterAttribute();
        if (ValidAttribute.checkAttribute(height, length)) {
                Checkerboard board = new Checkerboard(ValidAttribute.boardHeight,
                                                      ValidAttribute.boardLength);
                String output = board.drawCheckerboard();
                ConsoleIO.printToConsole(output);
        } else {
            System.out.println("try again");
        }
        ConsoleIO.closeScanner();
    }
}
