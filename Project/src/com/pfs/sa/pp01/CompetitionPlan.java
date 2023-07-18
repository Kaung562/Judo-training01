package com.pfs.sa.pp01;

public class CompetitionPlan implements TrainingPlan {
    int noOfcompetition;
    double fee;
    public CompetitionPlan(int noOfcompetition) {
        this.noOfcompetition = noOfcompetition;
        this.fee = 22.00;
    }
    public int getNoOfcompetition() {
        return noOfcompetition;
    }
    
    public void setNoOfcompetition(int noOfcompetition) {
        this.noOfcompetition = noOfcompetition;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    
   @Override
   public double computeFee(){
      return fee * noOfcompetition;
   }
   
    
}
