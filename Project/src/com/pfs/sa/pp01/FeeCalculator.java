package com.pfs.sa.pp01;




import java.util.ArrayList;
import java.util.Scanner;

public class FeeCalculator {  
    

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);//initialize the value
    
        TrainingPlan chosenTrainingPlan,privateCost,competitionEntry;
        double cost=0,competeCost=0,privatecostp=0,weight=0;
        String weightCategory = "",trainingPlan="",name="",input="",inputforP="",entry=""; 
        int noOfhour=0,numberofRegtime=0,competetime=0;
        
        
        boolean valiD;
        valiD = false;
        
        System.out.println("\n\t**WELCOME TO OUR ONE MONTHM NORTH SUSSEX JUDO TRAINING PLAN**\n");
            
        do{// validation
        System.out.println("How many people do you want to register?");
        input = sc.next();
        if (!NumberUtil.isValidNumber(input)) {
                System.out.println("\nPlease enter valid Number\n");
            }
        else {
            numberofRegtime = Integer.parseInt(input);
            valiD=true;
        }
    }while(!valiD);
    
         ArrayList<Athlete> athletes = new ArrayList<Athlete>();
    
        for (int i=0; i < numberofRegtime;i++){
        sc.nextLine();
        
        do{
        System.out.println("\nPlease enter your name");
        input = sc.nextLine();
        valiD = false;
        if(!StringUtil.isAlphaWithSpace(input)){
            System.out.println("\nPlease Enter Your name with Alphaverb and Space only\n");
        }else{
            name = input;
            valiD = true;
        }
    }while(!valiD);
      
        
       
        System.out.println("\nThese are The Available Training Plan ");
        System.out.println("\nBeginner\t ---25.00$ per week\nIntermediate\t---30.00$ per week\nElite\t\t ---35.00$ per week \n[Only Intermediate and Elite can enter competition]");


       
        do{
        System.out.println("Enter your Training Plan");
        trainingPlan = sc.next().toUpperCase();
        valiD = false;
        
         cost =0;
        
         if (trainingPlan.equals("BEGINNER"))  {                                   
            chosenTrainingPlan = new BeginnerPlan();                                       
            cost += chosenTrainingPlan.computeFee();
            valiD = true;  }                                  
        else if (trainingPlan.equals("INTERMEDIATE")) {                                      
            chosenTrainingPlan = new IntermediatePlan();                                        
            cost += chosenTrainingPlan.computeFee();
            valiD = true;  }                                    
        else if (trainingPlan.equals("ELITE")){                                        
            chosenTrainingPlan = new ElitePlan();                                    
            cost += chosenTrainingPlan.computeFee();
             valiD = true; }                                 
        else{
            System.out.println("\nUnavailable, Please enter your training plan correctly[NOT Number]\n");
            
        }
        }while(!valiD);
    
        System.out.println("Awesome! You plan is "+ trainingPlan);
       do{
       System.out.println("Do you want private coaching?(Yes/No)");
       inputforP = sc.next().toUpperCase();
       
    }while(!inputforP.equalsIgnoreCase("YES")&& !inputforP.equalsIgnoreCase("NO"));
      
      do{
       if (inputforP.equals("YES")){
          
         do{
         System.out.println("How many hour do you want for private coaching per Week?\nPrivate Coaching Fee\t=$9.00 per Hour");//validation need
         input = sc.next();
         valiD = false;
         if(!NumberUtil.isValidNumber(input)){
            System.out.println("\nPlease enter a Number\n");
         }else{
            noOfhour=Integer.parseInt(input);
            valiD = true;
         }
        }while(!valiD);
       
         if(noOfhour<=5){
         privateCost = new PrivatePlan(noOfhour);
         privatecostp += privateCost.computeFee();
       
         }else {
        System.out.println("\n[[Only available for 5 and less hour]]\n");
         
       }
      
       
       
    }else {
        System.out.println("I hope you next Time!");
        noOfhour =0;
    }
     
      }while(noOfhour>5);
        System.out.println("Your Private coaching hour is :" + noOfhour + "Hour");
    
        do{
        System.out.println("What is your weight in KG?");
        input=sc.next();
        valiD = false;
         if (!NumberUtil.isValidDecimal(input)) {
              System.out.println("\nPlease enter a valid Number\n");
            }
            else {
            weight = Double.parseDouble(input);
            valiD=true;
        }
    }while(!valiD);

        if (weight > 100)
            weightCategory = "Heavyweight";
        else if ((weight > 90) && (weight <=100))   
            weightCategory = "Light-Heavyweight";
        else if ((weight > 81) && (weight <=90))   
            weightCategory = "Middleweight";
        else if ((weight > 73) && (weight <=81))   
            weightCategory = "Light-Middlwweight";    
        else if ((weight > 66) && (weight <=73))    
            weightCategory = "Lightweight";
        else
            weightCategory = "Flyweight";
        
        if (trainingPlan.equals("INTERMEDIATE") || trainingPlan.equals("ELITE")){
        
            do{
            System.out.println("Do you want competition entry?(yes/no)\nCompetition entry fee\t ---$22.00 per competition");
            entry = sc.next().toUpperCase();
            }while(!entry.equalsIgnoreCase("YES")&& !entry.equalsIgnoreCase("NO"));
            if (entry.equals("YES")){
                do{
                System.out.println("How many times do you want to compete?");
                input = sc.next();
                valiD =false;
                if(!NumberUtil.isValidNumber(input)){
                    System.out.println("\nPlease enter a number!\n");
                }else{
                    competetime = Integer.parseInt(input);
                    valiD = true;
                    System.out.println("\nYour Comepetion entry according to your WeightCategory\t----"+ weightCategory+"\n");
                }
            }while(!valiD);

                competitionEntry = new CompetitionPlan(competetime);
                competeCost += competitionEntry.computeFee();

            }else{
                System.out.println("See you next time!\n");
                competetime = 0;
            }
          } 
          else{
               System.out.println("\nSoryy, You don't have access for competition form!!\n");
               competetime =0;
          }
         
           Athlete athlete = new Athlete(name);
           athlete.setWeight(weight);
            athlete.setWeightCategory(weightCategory);
            athlete.setTrainingPlan(trainingPlan);
            athlete.setCost(cost);
            athlete.setPrivatecostp(privatecostp);
            athlete.setCompeteCost(competeCost);
            athlete.setTotalCost(cost + privatecostp + competeCost);
            athlete.setNoOfhour(noOfhour);
            athlete.setCompetetime(competetime);
            System.out.println(athlete);
            athletes.add(athlete);
          

    
        
        }
        System.out.println("\nAthlete name"+"\tWeight in Kg" +"\tWeightcategory"+"\t\tCompetition Times"+"\tPrivate Coaching Hour"+"\tTraining Plan");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");
          for (Athlete athlete: athletes){
            
            System.out.println(athlete.getName()+"\t\t"+athlete.getWeight()+"\t\t"+athlete.getWeightCategory()+"\t\t"+athlete.getCompetetime()+"\t\t\t"+athlete.getNoOfhour()+"\t\t\t"+athlete.getTrainingPlan());
          }
 sc.close();
          
}

    }


