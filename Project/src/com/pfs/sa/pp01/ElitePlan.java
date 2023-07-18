package com.pfs.sa.pp01;

public class ElitePlan implements TrainingPlan {//using interface and implements method

    double fee;
    int noOfsessions;
    public ElitePlan() {
        this.fee = 35.0;
        this.noOfsessions = 5;
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
