package com.pfs.sa.pp01;

public class IntermediatePlan implements TrainingPlan {

    double fee;
    int noOfsessions;
    
    public IntermediatePlan() {
        this.fee = 30.0;
        this.noOfsessions = 3;
    }
    public double getFee() {
        return fee;
    }
    public int getNoOfsessions() {
        return noOfsessions;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public void setNoOfsessions(int noOfsessions) {
        this.noOfsessions = noOfsessions;
    }
    
    @Override
    public double computeFee(){
        return fee * noOfweeksInaMonth;
    }
    
}
