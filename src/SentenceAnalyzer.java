import java.util.ArrayList;
import java.util.List;

public class SentenceAnalyzer {

    private static final String SEPARATORS = " .,:!?";

    private final String sentenceToAnalyze;

    private final List<String> words;

    public SentenceAnalyzer(String sentenceToAnalyze) {
        this.sentenceToAnalyze = sentenceToAnalyze;
        this.words = new ArrayList<>();
    }

    public void analyze() {
        System.out.println("Sentence to analyze: " + this.sentenceToAnalyze);

        this.analyzeWords();
        this.analyzeQuestionSentences();
        this.analyzeCommandSentences();
    }

    private void analyzeWords() {

        // TODO remove duplicity
        // TODO fix two separators behind

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < this.sentenceToAnalyze.length(); i ++) {
            char currentChar = this.sentenceToAnalyze.charAt(i);

            if (word.length() > 0 && this.isSeparators(currentChar)) {
                this.words.add(word.toString());
                word = new StringBuilder();

                continue;
            }

            word.append(currentChar);
        }

        System.out.println(":: number of words: " + this.words.size());
        System.out.println(":: words: " + this.words);
    }

    private void analyzeQuestionSentences() {
        // TODO
    }

    private void analyzeCommandSentences() {
        // TODO
    }

    private boolean isSeparators(char currentChart) {
        return SEPARATORS.indexOf(currentChart) >= 0;
    }

}
