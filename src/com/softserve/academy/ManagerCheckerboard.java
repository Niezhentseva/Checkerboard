/* 1.	Шахматная доска
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
Программа запускается через вызов главного класса с параметрами.
 */

package com.softserve.academy;

import java.util.InputMismatchException;

public class ManagerCheckerboard {

    public static void main(String[] args) {
            try {
                InputAttributeChecker list = new InputAttributeChecker();
                int[] one = list.enterAttributeChecker();
                String boardHeight = Integer.toString(one[0]);
                String boardLength = Integer.toString(one[1]);
                Checkerboard board = new Checkerboard(boardHeight, boardLength);
                System.out.println(board.drawCheckerboard());
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Wrong number format, need Integer value");
            } catch (IllegalArgumentException e) {
                System.out.println("Parameters must be greater than zero");
            }
     }
}
