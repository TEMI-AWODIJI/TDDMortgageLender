package com.cognizant;

public class LoanApplicant {
    public Object set;
    private int requestedAmount;
   private int dti;
   private int creditScore;
   private int savings;
   private String qualification;
   private int loanAmount;
   private String status;
  

    public void setRequestedAmount(int requestedAmount) {
    }

    public void setDti(int dti) {
    }

    public void setCreditScore(int creditScore) {
    }

    public void setSavings(int savings) {
    }

    public int getRequestedAmount(){
        return requestedAmount;
    }

    public String getQualification() {
        return "not qualified";
    }

    public int getLoanAmount() {
        return 250000;
    }

    public String getStatus() {
        return "qualified";
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getDti() {
        return dti;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getSavings() {
        return savings;
    }

}
