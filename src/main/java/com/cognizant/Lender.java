package com.cognizant;

public class Lender {

    int availableFunds;

    public int checkAvailableFunds() {
        return availableFunds;
    }

    public void depositFunds(int amount) {

        availableFunds = availableFunds + amount;

    }
}
