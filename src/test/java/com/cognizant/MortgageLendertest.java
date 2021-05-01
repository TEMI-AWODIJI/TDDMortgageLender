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
    @Test
    void qualifyLoanApplication() {
        //As a lender, I want to accept and qualify loan applications, so that I can ensure I get my money back.
        //
        //Rule: To qualify for the full amount, candidates must have debt-to-income (DTI) less than 36%, credit score above 620
        //and savings worth 25% of requested loan amount.
        //
        //Rule: To partially qualify, candidates must still meet the same dti and credit score thresholds.
        //The loan amount for partial qualified applications is four times the applicant's savings.
        //
        //Given a loan applicant with <dti>, <credit_score>, and <savings>
        //When they apply for a loan with <requested_amount>
        //Then their qualification is <qualification>
        //And their loan amount is <loan_amount>
        //And their loan status is <status>
        //
        //Example:
        //|  requested_amount  |   dti  |  credit_score  |  savings  |     qualification    |  loan_amount  |   status   |
        //|      250,000       |   21   |       700      | 100,000   |       qualified      |   250,000     |  qualified |
        //|      250,000       |   37   |       700      | 100,000   |     not qualified    |         0     |  denied    |
        //|      250,000       |   30   |       600      | 100,000   |     not qualified    |         0     |  denied    |
        //|      250,000       |   30   |       700      |  50,000   |  partially qualified |   200,000     |  qualified |


        //SETUP
        Lender lender = new Lender();
        LoanApplicant loanApplicant = new LoanApplicant();

        //EXECUTION
        loanApplicant.setRequestedAmount(250000);
        loanApplicant.setDti(21);
        loanApplicant.setCreditScore(700);
        loanApplicant.setSavings(100000);
        lender.acceptAndQualifyLoanApplication(loanApplicant);

        //ASSERTION

        assertEquals("qualified",loanApplicant.getQualification());
        assertEquals(250000,loanApplicant.getLoanAmount());
        assertEquals("qualified",loanApplicant.getStatus());

    }



    @Test
    void qualifyManyLoanApplication() {
        //As a lender, I want to accept and qualify loan applications, so that I can ensure I get my money back.
        //
        //Rule: To qualify for the full amount, candidates must have debt-to-income (DTI) less than 36%, credit score above 620
        //and savings worth 25% of requested loan amount.
        //
        //Rule: To partially qualify, candidates must still meet the same dti and credit score thresholds.
        //The loan amount for partial qualified applications is four times the applicant's savings.
        //
        //Given a loan applicant with <dti>, <credit_score>, and <savings>
        //When they apply for a loan with <requested_amount>
        //Then their qualification is <qualification>
        //And their loan amount is <loan_amount>
        //And their loan status is <status>
        //
        //Example:
        //|  requested_amount  |   dti  |  credit_score  |  savings  |     qualification    |  loan_amount  |   status   |
        //|      250,000       |   21   |       700      | 100,000   |       qualified      |   250,000     |  qualified |
        //|      250,000       |   37   |       700      | 100,000   |     not qualified    |         0     |  denied    |
        //|      250,000       |   30   |       600      | 100,000   |     not qualified    |         0     |  denied    |
        //|      250,000       |   30   |       700      |  50,000   |  partially qualified |   200,000     |  qualified |


        //SETUP
        Lender lender = new Lender();
        LoanApplicant loanApplicant = new LoanApplicant();
        LoanApplicant loanApplicant2 = new LoanApplicant();



        //EXECUTION
        loanApplicant.setRequestedAmount(250000);
        loanApplicant.setDti(21);
        loanApplicant.setCreditScore(700);
        loanApplicant.setSavings(100000);
        lender.acceptAndQualifyLoanApplication(loanApplicant);

        loanApplicant2.setRequestedAmount(250000);
        loanApplicant2.setDti(37);
        loanApplicant2.setCreditScore(700);
        loanApplicant2.setSavings(100000);
        lender.acceptAndQualifyLoanApplication(loanApplicant2);

        //ASSERTION

        assertEquals("qualified",loanApplicant.getQualification());
        assertEquals(250000,loanApplicant.getLoanAmount());
        assertEquals("qualified",loanApplicant.getStatus());

        assertEquals("not qualified",loanApplicant2.getQualification());
        assertEquals(0,loanApplicant2.getLoanAmount());
        assertEquals("denied",loanApplicant2.getStatus());

    }






}

//

