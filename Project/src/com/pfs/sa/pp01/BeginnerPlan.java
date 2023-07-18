package com.pfs.sa.pp01;

public class BeginnerPlan implements TrainingPlan {

    double fee;
    int noOfsessions;
    public BeginnerPlan() {//constructor
        this.fee = 25.0;
        this.noOfsessions = 2;
    }
    public double getFee() {//getter
        return fee;
    }
    public int getNoOfsessions() {
        return noOfsessions;
    }
    public void setFee(double fee) {//setter
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
