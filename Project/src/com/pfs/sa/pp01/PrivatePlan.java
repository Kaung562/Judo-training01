package com.pfs.sa.pp01;

public class PrivatePlan implements TrainingPlan {

    double fee;
    int noOfhour;
    public PrivatePlan(int noOfhour) {
        this.fee = 30.0;
        this.noOfhour = noOfhour;
    }
    public PrivatePlan(Object f) {
    }
    public double getFee() {
        return fee;
    }
    public int getNoOfhour() {
        return noOfhour;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public void setNoOfhour(int noOfhour) {
        this.noOfhour = noOfhour;
    }
   
    @Override
    public double computeFee(){
        return fee * noOfhour * noOfweeksInaMonth;
    }
}
    

