package Chapter8.VariantB;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<VariantB.Word> words;

    public Sentence() {
        this.words = new ArrayList<>();
    }

    public void addWord(VariantB.Word word) {
        this.words.add(word);
    }

    public List<VariantB.Word> getWords() {
        return this.words;
    }

    public boolean containsWord(String wordText) {
        for (VariantB.Word word : this.words) {
            if (word.getText().equals(wordText)) {
                return true;
            }
        }

        return false;
    }
}
