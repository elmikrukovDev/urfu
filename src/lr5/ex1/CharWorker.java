package lr5.ex1;

import static java.lang.System.out;

public class CharWorker {
    private char character;

    public void setCharacter(char value) {
        character = value;
    }

    public int getCharCode() {
        return character;
    }

    public void print() {
        out.printf("CharWorker.character value is %s, code: %d", character, (int)character);
    }
}
