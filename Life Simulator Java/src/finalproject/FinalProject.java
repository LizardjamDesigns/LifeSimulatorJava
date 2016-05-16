
package finalproject;

import java.util.Scanner;

/**
 * Larry Thompson
 * CSC 151 Java Final Project
 * Life Simulator Game
 */

public class FinalProject {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Create object from user input//
        User user = new User();

        //Set name, job, and age based on user input
        System.out.println("Welcome to the Life Simulation Game.");
        System.out.println("");
        System.out.println("Now, tell me who you are.");
            user.setName(getUserName());
        System.out.println("");
            user.setJob(getUserJob());
            user.updatePayRate();
        System.out.println("");
            user.setBirthDay(getUserBirthDay());
        System.out.println("");
            user.setBirthMonth(getUserBirthMonth());
        System.out.println("");
            user.setBirthYear(getUserBirthYear());
        System.out.println("");
        
        //Asign variables for updateAge
        int bday = user.getBirthDay();
        int bmonth = user.getBirthMonth();
        int byear = user.getBirthYear();
        
        //Generates person's age
        user.updateAge(bday, bmonth, byear);
        
        System.out.println("");
        System.out.println("Now for the fun stuff! Let's get started.");
        System.out.println("Your goal is to buy the house of your dreams!");
        
    ///////Start Game///////////////////////////////////////////////////////////
        
        //playing controls loop to continue taking actions
        boolean playing = true;
        int choice = 0;
    
        while (playing == true) {

            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("1.) Check Status            5.) Go to Work");
            System.out.println("2.) Eat Somthing            6.) Play Lottery");
            System.out.println("3.) Go to Sleep             7.) Buy Dream House ($50,000)");
            System.out.println("4.) Use Restroom            8.) Exit Game");
            System.out.println("");

            if (sc.hasNextInt())
            {
                choice = sc.nextInt();
                
                //Actions available to the user
                switch (choice)
                {
                    case 1: user.viewStatus();
                            break;
                        
                    case 2: user.eatFood();
                            break;
                    
                    case 3: user.sleep();
                            break;
                        
                    case 4: user.useRestroom();
                            break;
                        
                    case 5: user.goToWork();
                            break;
                        
                    case 6: user.playLottery();
                            break;
                    
                    case 7: user.buyHouse();
                            break;
                        
                    case 8: System.out.println("Thanks for playing!");
                            playing = false;
                            break;
                        
                    default: System.out.println("ERROR! Please enter a number between 1-7.");
                            break;
                }
            }
            else
            {
                sc.nextLine();
                System.out.println("ERROR! Please enter a NUMBER between 1 and 8.");
            }
        
        
        }
    }
    
/////////////////////getUserName Method/////////////////////////////////////////    
public static String getUserName() {

    Scanner sc = new Scanner(System.in);
    boolean badData = true;
    String userName = "";

    while (badData == true) {
        System.out.print("What is your name?  ");
    
        if(sc.hasNextLine() && !sc.hasNextDouble()) { 
            userName = sc.nextLine();
            badData = false;             
        }
        else {
            System.out.println("Please do not use numbers! Please Re-enter the information.");
            sc.nextLine();
        }
    }

    return userName;
         
 } 
  
//////////////getUserJob Method/////////////////////////////////////////////////
   public static String getUserJob() {
     
     Scanner sc = new Scanner(System.in);
     boolean badData = true;
     String userJob = "";
     int jobChoice = 0;
     
     while (badData == true) {
         
         System.out.println("What job would you like?");
         System.out.println("1.)Fast Food                   4.)Artist ");
         System.out.println("2.)Retail Associate            5.)Tech Support ");
         System.out.println("3.)Programmer                  6.)Teacher ");
         
         if(sc.hasNextInt()) { 
             
             jobChoice = sc.nextInt();
             badData = false; 
             
             //User job choices
             switch(jobChoice) {
                 case 1: userJob = "Fast Food";
                     break;
                 case 2: userJob = "Retail Associate";
                     break;
                 case 3: userJob = "Programmer";
                     break;
                 case 4: userJob = "Artist";
                     break;
                 case 5: userJob = "Tech Support";
                     break;
                 case 6: userJob = "Teacher";
                     break;
                 default: System.out.println("Please enter a number between 1 and 6.");
                     break;
             }
             
         }
         else {
             
             System.out.println("Please enter a number between 1 and 6.");
             sc.nextLine();
             
         }
     }
     return userJob;
         
 }
////////////////////////getBirthDay method///////////////////////////////////////
 public static int getUserBirthDay() {
     
     Scanner sc = new Scanner(System.in);
     boolean badData = true;
     int birthDay = 0;
     
     while (badData == true) {
         
         System.out.print("What is the day of your birth?  ");
         
         if(sc.hasNextInt()) {  
             
             birthDay = sc.nextInt();
             badData = false;  
             
         }
         else {
             
             System.out.println("Please only enter numbers. Try again");
             sc.nextLine();
             
         }
     }
     return birthDay;
         
 }    
 ////////////////////////getBirthMonth method///////////////////////////////////////
 public static int getUserBirthMonth() {
     
     Scanner sc = new Scanner(System.in);
     boolean badData = true;
     int birthMonth = 0;
     
     while (badData == true) {
         
         System.out.print("What is the month of your birth? (1-12)  ");
         
         if(sc.hasNextInt()) {  
             
             birthMonth = sc.nextInt();
             badData = false;  
             
         }
         else {
             
             System.out.println("Please only enter numbers. Try again");
             sc.nextLine();
             
         }
     }
     return birthMonth;
         
 } 
 ////////////////////////getBirthYear method///////////////////////////////////////
 public static int getUserBirthYear() {
     
     Scanner sc = new Scanner(System.in);
     boolean badData = true;
     int birthYear = 0;
     
     while (badData == true) {
         
         System.out.print("What is the year of your birth?  ");
         
         if(sc.hasNextInt()) {  
             
             birthYear = sc.nextInt();
             badData = false;  
             
         }
         else {
             
             System.out.println("Please only enter numbers. Try again");
             sc.nextLine();
             
         }
     }
     return birthYear;
         
 }

    
}
