package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {


    @Test
    public void givenOneEventAsEvenNumberAndSecondEventAsOddNumberOfDice_WhenChecked_ThenReturnProbabilityOfOccuringTogether() {
        float firstEventForCoinAndDice = 0.5f;
        Probability probability = new Probability(firstEventForCoinAndDice, firstEventForCoinAndDice);
        assertEquals(0.25, probability.eventOccureTogether());
    }
}
