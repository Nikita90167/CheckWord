import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker (String text) {
        this.text = text;
    }
    boolean hasWord (String word) {
        Set<String> textWords = new HashSet<>(Arrays.asList(text.split(" ")));
        for (String words : textWords) {
            if (words.equals(word)) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;

    }
}
