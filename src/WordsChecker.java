
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
    public boolean hasWord (String word) {
            if (textwords.contains(word)) {
                System.out.println("True");
                return true;
            }
        System.out.println("False");
        return false;

    }
}
