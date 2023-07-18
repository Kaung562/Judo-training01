package com.pfs.sa.pp01;



public class Athlete {
    private String name;
    private double weight;
    private String trainingPlan;
    private String weightCategory;
    public double cost=0;
    private String chosenTrainingPlan;
    public double privatecostp=0;
    public int noOfhour=0;
    public double competeCost=0;
    private double totalCost;
    private int competetime=0;

    public Athlete(String name) {
        this.name = name; 
               
    }

    public String getName() {
        return name;
    }

     public String getTrainingPlan() {
        return trainingPlan;
    }
    

    public void setTrainingPlan(String trainingPlan) {
        
        this.trainingPlan = trainingPlan;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeightCategory() {
        return weightCategory;
    }
    public void setWeightCategory(String weightCategory) {
        this.weightCategory = weightCategory;
    }
     public double getCost() {
        return cost;
    }
    

    public void setCost(double cost) {
        this.cost = cost;
    }
     public String getChosenTrainingPlan() {
        return chosenTrainingPlan;
    }
    
   
    public void setChosenTrainingPlan(String chosenTrainingPlan) {
        this.chosenTrainingPlan = chosenTrainingPlan;
    }
    
    public double getPrivatecostp() {
        return privatecostp;
    }
    

    public void setPrivatecostp(double privatecostp) {
        this.privatecostp = privatecostp;
    }
    
    
    public int getNoOfhour() {
        return noOfhour;
    }
    
      public void setNoOfhour(int noOfhour) {
        this.noOfhour = noOfhour;
    }
  
    
    public double getCompeteCost() {
        return competeCost;
    }
    

    public void setCompeteCost(double competeCost) {
        this.competeCost = competeCost;
    }
     public double getTotalCost() {
        return totalCost;
    }
    

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
     public int getCompetetime() {
        return competetime;
    }
     public void setCompetetime(int competetime) {
        this.competetime = competetime;
    }

    @Override
    public String toString() {
        return "Athlete's name\t\t=" + name 
        + "\nWeight\t\t\t=" + weight 
        + "Kg" 
        + "\nWeightCategory\t\t=" + weightCategory 
        +"\nTraining Plan \t\t="+ trainingPlan + 
        "\nTrainingplan Fee\t=" + "$"+cost + 
        "\nPrivate Training Fee\t="+"$"+privatecostp+
        "\nCompetition Entry Fee\t=$"+competeCost+
        "\n--------------------------"+
        "\nTotal Cost\t\t=$"+ totalCost;
    }  
    
}
