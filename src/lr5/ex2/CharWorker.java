package lr5.ex2;

import static java.lang.System.out;

public class CharWorker {
    private char character1;
    private char character2;

    public void setCharacter1(char value) {
        character1 = value;
    }

    public void setCharacter2(char value) {
        character2 = value;
    }

    public void printRange() {
        var swap = Swap.swap(character1, character2);
        for (int i = swap.val1; i <= swap.val2; i++)
            out.printf("%s ", (char)i);
    }

    private static class Swap {
        char val1;
        char val2;
        Swap(char val1, char val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
        static Swap swap(char val1, char val2) {
            if (val1 > val2) {
                char temp = val1;
                val1 = val2;
                val2 = temp;
            }
            return new Swap(val1, val2);
        }
    }
}
