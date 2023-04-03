
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set <String> textwords;
    private String text;

    public WordsChecker (String text) {
        this.text = text;
        this.textwords = new HashSet<>(Arrays.asList(text.split(" ")));
    }
    boolean hasWord (String word) {
        for (String words : textwords) {
            if (words.equals(word)) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;

    }
}
