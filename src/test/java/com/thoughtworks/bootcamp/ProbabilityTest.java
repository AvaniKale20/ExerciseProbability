package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {


    @Test
    public void givenOneEventAsEvenNumberAndSecondEventAsOddNumberOfDice_WhenChecked_ThenReturnProbabilityOfOccuringTogether() {
        float eventForCoinAndDice = 0.5f;
        Probability probability = new Probability(eventForCoinAndDice, eventForCoinAndDice);
        assertEquals(0.25, probability.eventOccureTogether());
    }

    @Test
    public void givenTwoEventForHeadAndTail_WhenCheckedEqualOrNot_ThenShouldReturnEqual()
    {
        Probability OneForTail=new Probability(0.5f);
        Probability SecondForHead=new Probability(0.5f);
        assertTrue(OneForTail.equals(SecondForHead));
    }





}
