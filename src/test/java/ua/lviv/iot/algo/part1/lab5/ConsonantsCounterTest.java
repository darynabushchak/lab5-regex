package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConsonantsCounterTest {

    @Test
    public void testCountConsonantsInSentences_exclamatorySentence() {
        ConsonantsCounter counter = new ConsonantsCounter("Happy Birthday!");
        int count = counter.countConsonantsInSentences();
        assertEquals(8, count);
    }

    @Test
    public void testCountConsonantsInSentences_notExclamatorySentence() {
        ConsonantsCounter counter = new ConsonantsCounter("Happy Birthday?");
        int count = counter.countConsonantsInSentences();
        assertEquals(0, count);
    }

    @Test
    public void testCountConsonantsInSentences_emptySentence() {
        ConsonantsCounter counter = new ConsonantsCounter("");
        int count = counter.countConsonantsInSentences();
        assertEquals(0, count);
    }

    @Test
    public void testCountConsonantsInSentences_oneWordSentences() {
        ConsonantsCounter counter = new ConsonantsCounter("Birthday!");
        int count = counter.countConsonantsInSentences();
        assertEquals(5, count);
    }
    @Test
    public void testCountConsonantsInSentences_severalExclamationMarks() {
        ConsonantsCounter counter = new ConsonantsCounter("Happy Birthday!!!");
        int count = counter.countConsonantsInSentences();
        assertEquals(8, count);
    }
}