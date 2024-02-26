package oop.abst;

import java.util.HashMap;
import java.util.Map;

public class KeywordCounterAnalyzer implements TextAnalyzer {
    private String[] keywords;
    private int maxCounter;

    public KeywordCounterAnalyzer(String[] keywords, int maxCounter) {
        this.keywords = keywords;
        this.maxCounter = maxCounter;
    }

    @Override
    public Label processText(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");

        for (String keyword : keywords) {
            wordCount.put(keyword, 0);
        }

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
                if (wordCount.get(word) >= maxCounter) {
                    return Label.TOO_MUCH_KEYWORDS;
                }
            }
        }

        return Label.OK;
    }
}
