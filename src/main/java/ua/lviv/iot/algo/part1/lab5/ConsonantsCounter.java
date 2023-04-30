package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsonantsCounter {
    private final String sentence;

    public ConsonantsCounter(String sentence) {
        this.sentence = sentence;
    }

    public int countConsonantsInSentences() {
        int count = 0;

        if (sentence.endsWith("!")) {

            String sentenceWithoutExclamation = sentence.substring(0, sentence.length() - 1);

            String[] words = sentenceWithoutExclamation.split("\\s+");

            for (String word : words) {
                Pattern pattern = Pattern.compile("[qwrtpsdfhjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]");
                Matcher matcher = pattern.matcher(word);
                while (matcher.find()){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentences: ");
        String sentence = scanner.nextLine();

        ConsonantsCounter counter = new ConsonantsCounter(sentence);
        int count = counter.countConsonantsInSentences();

        System.out.println("Number of consonants in the words of the exclamatory sentence: " + count);
    }
}
