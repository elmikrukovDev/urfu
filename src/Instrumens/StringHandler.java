package Instrumens;

public final class StringHandler {
    public static void toUpperFirstChar(StringBuilder sb) {
        final int CHAR_INDEX = 0;
        var changingChar = String.valueOf(sb.charAt(CHAR_INDEX));
        sb.replace(CHAR_INDEX, CHAR_INDEX + 1, changingChar.toUpperCase());
    }
}
