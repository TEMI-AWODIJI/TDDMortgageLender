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

        //ASSERTION
        assertEquals(0,lender.checkAvailableFunds());
    }
    @Test
    void depositFunds() {

       // As a lender, I want to add money to my available funds,
        // so that I can offer loans to potential home buyers.
//
//        Given I have <current_amount> available funds
//        When I add <deposit_amount>
//        Then my available funds should be <total>
//
//                Examples:
//| current_amount | deposit_amount |   total  |
//|     100,000    |      50,000    | 150,000  |
//|     200,000    |      30,000    | 230,000  |


        //SETUP
        Lender lender = new Lender();

        //EXECUTION
        lender.depositFunds(100000);
        lender.depositFunds(1);

        //ASSERTION
        assertEquals(100001,lender.checkAvailableFunds());

    }

}

