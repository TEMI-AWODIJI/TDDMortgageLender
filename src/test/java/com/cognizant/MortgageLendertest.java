package com.cognizant;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MortgageLendertest {

    //As a lender, I want to be able to check my available funds, so that I know how much money I can offer for loans.

   // When I check my available funds
   // Then I should see how much funds I currently have

    @Test
    void checkAvailableFunds() {

        //SETUP
        Lender lender = new Lender();

        //EXECUTION
        int actual = lender.checkAvailableFunds();
        int expected = 0;

        //ASSERTION
        assertEquals(expected,actual);
    }

}

