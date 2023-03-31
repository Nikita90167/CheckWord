import java.util.ArrayList;
import java.util.Arrays;

public class WordsChecker {
    private String text;

    public WordsChecker (String text) {
        this.text = text;
    }
    boolean hasWord (String word) {
        String[] textWords = text.split("\\P{Alpha}+");
        for (int i = 0; i < textWords.length; i++) {
            if (textWords[i].equals(word)) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;

    }
}
