package com.softserve.academy;

public class ValidAttribute {
    public static int boardLength;
    public static int boardHeight;

    private final static String informWrongAttr = "You entered wrong arguments. " +
            "Please, enter only integer numbers";
    private final static String informNegativeAttr ="You entered negative arguments or zero. " +
            "Please, enter only positive numbers";

    public static boolean checkAttribute(String height, String length){
        try{
            boardHeight = Integer.parseInt(height.trim());
            boardLength = Integer.parseInt(length.trim());
        }catch(NumberFormatException e){
            ConsoleIO.printToConsole(informWrongAttr);
            return false;
        }
        if(boardHeight <= 0 || boardLength <= 0){
            ConsoleIO.printToConsole(informNegativeAttr);
            return false;
        }
        return true;
    }
}
