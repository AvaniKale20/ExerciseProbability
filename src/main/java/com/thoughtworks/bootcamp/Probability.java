package com.thoughtworks.bootcamp;

public class Probability {
    private float firstEvent;
    private float secondEvent;

    Probability(float firstEvent, float secondEvent) {

        this.firstEvent = firstEvent;
        this.secondEvent = secondEvent;
    }

    Probability(float probabilityValue) {

        firstEvent = probabilityValue;

    }

    public boolean equals(Object object) {
        Probability probability = (Probability) object;
        return firstEvent == probability.firstEvent;
    }

    public float eventOccureTogether() {
        return firstEvent * secondEvent;
    }


}
