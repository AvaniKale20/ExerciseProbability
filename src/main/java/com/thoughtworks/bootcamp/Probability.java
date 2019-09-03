package com.thoughtworks.bootcamp;

public class Probability {
    private final float firstEventForCoin;
    private final float secondEventForDice;

    public Probability(float firstEventForCoin, float secondEventForDice) {

        this.firstEventForCoin = firstEventForCoin;
        this.secondEventForDice = secondEventForDice;
    }

    public float eventOccureTogether() {
        return firstEventForCoin * secondEventForDice;
    }
}
