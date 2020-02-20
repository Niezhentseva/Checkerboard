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
    private final static String informHeight = "Enter checkerboard height value";
    private final static String informLength = "Enter checkerboard length value";
    private final static String informNoPositive = "You entered negative arguments or zero. " +
            "Please, enter only positive numbers";

    public static void main(String[] args) {
        ConsoleIO.printToConsole(informHeight);
        int height = ConsoleIO.enterAttribute(); // method scans value and transforms it into an integer;
        ConsoleIO.printToConsole(informLength);
        int length = ConsoleIO.enterAttribute();
        // if height and length positive numbers, checkerboard creates with these attributes
        if ((height > 0) && (length > 0)) {
                Checkerboard board = new Checkerboard(height, length);
                String output = board.drawCheckerboard(); // checkerboard draws
                ConsoleIO.printToConsole(output);
        } else {
            ConsoleIO.printToConsole(informNoPositive);
        }
        ConsoleIO.closeScanner();
    }
}
