package com.mortgagelender;

public class Applicant {
    private int dti;
    private int creditScore;
    private double savings;
    private double requestedAmount;
    private String qualification;


    public Applicant(int dti, int creditScore, double savings, double requestedAmount) {
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
        this.requestedAmount = requestedAmount;
    }

    public Applicant(Applicant applicant) {
        this.dti = applicant.dti;
        this.creditScore = applicant.creditScore;
        this.savings = applicant.savings;
        this.requestedAmount = applicant.requestedAmount;
    }

    public String getQualification() {
        return qualification;
    }
    
    public int getDti() {
        return dti;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getSavings() {
        return savings;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant[" +
                "dti=" + dti +
                ", creditScore=" + creditScore +
                ", savings=" + savings +
                ", requestedAmount=" + requestedAmount +
                ", qualification='" + qualification + '\'' +
                ']';
    }


}
