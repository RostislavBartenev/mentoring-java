package oop.abst;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] negativeWords = {"=(", ":(", ":|"};

    @Override
    protected String[] getKeywords() {
        return negativeWords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}