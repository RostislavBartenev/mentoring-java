package oop.abst;

public class Main {

    public static void main(String[] args) {
        String[] spamKeywords = {"buy", "cheap", "sale"};
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(spamKeywords);
        testAnalyzer(spamAnalyzer, "This comment contains the word sale");
        testAnalyzer(spamAnalyzer, "This comment is clean");

        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        testAnalyzer(negativeTextAnalyzer, "I love this video :) :)");
        testAnalyzer(negativeTextAnalyzer, "This video is boring :(");

        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
        testAnalyzer(tooLongTextAnalyzer, "Short text");
        testAnalyzer(tooLongTextAnalyzer, "This is a very long text");

        String[] keywords = {"джава"};
        int maxCounter = 3;
        KeywordCounterAnalyzer counterTextAnalyzer = new KeywordCounterAnalyzer(keywords, maxCounter);

        testAnalyzer(counterTextAnalyzer, "я учу людей джава, джава чертовски хорош, джава это куча денег, джава");
        testAnalyzer(counterTextAnalyzer, "джава это круто");
    }

    private static void testAnalyzer(TextAnalyzer analyzer, String text) {
        Label result = analyzer.processText(text);
        System.out.println("Test: " + text + " -> " + result);
    }
}
