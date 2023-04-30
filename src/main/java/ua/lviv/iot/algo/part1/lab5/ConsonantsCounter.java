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
}
