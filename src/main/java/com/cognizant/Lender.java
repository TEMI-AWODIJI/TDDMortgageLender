package com.cognizant;

public class Lender {

    int availableFunds;

    public int checkAvailableFunds() {
        return availableFunds;
    }

    public void depositFunds(int amount) {

        availableFunds = availableFunds + amount;

    }

    public void acceptAndQualifyLoanApplication( LoanApplicant loanApplicant) {

        //get the loan applicant data

        int requestedAmount = loanApplicant.getRequestedAmount();
        int dti = loanApplicant.getDti();
        int creditScore = loanApplicant.getCreditScore();
        int savings = loanApplicant.getSavings();

        if(dti<36 && creditScore>620){
            loanApplicant.setQualification("qualified");
            if(requestedAmount>250000){
                loanApplicant.setQualification("qualified");

        }

        //check their dti, credit score, savings, requested amount

        //based from result, set their, qualification, status, and loan amount
    }


}
