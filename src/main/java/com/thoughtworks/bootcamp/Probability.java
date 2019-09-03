package com.thoughtworks.bootcamp;

public class Probability {
    private float firstEventForCoin;
    private float secondEventForDice;

    public Probability(float firstEventForCoin, float secondEventForDice) {

        this.firstEventForCoin = firstEventForCoin;
        this.secondEventForDice = secondEventForDice;
    }


    public float eventOccureTogether() {
        return firstEventForCoin * secondEventForDice;
    }
}
