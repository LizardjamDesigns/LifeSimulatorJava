
package finalproject;
import java.time.LocalDate;
import java.util.Scanner;

public class User {
    
    //Instance Variables
    private String name;
    private int age;
    private int hungerLevel;
    private int restLevel;
    private int bladderLevel;
    private double money;
    private String job;       
    private double luck;
    private double payRate;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String hairColor;
    private String eyeColor;
    
public User() {
        
        name = "";
        age = 0;
        hungerLevel = 100;
        restLevel = 100;
        bladderLevel = 100;
        money = 50.0;
        job = "";
        luck = 0;
        payRate = 0;
        hairColor = "";
        eyeColor = "";
        birthDay = 0;
        birthMonth = 0;
        birthYear = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the hungerLevel
     */
    public int getHungerLevel() {
        return hungerLevel;
    }

    /**
     * @param hungerLevel the hungerLevel to set
     */
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    /**
     * @return the restLevel
     */
    public int getRestLevel() {
        return restLevel;
    }

    /**
     * @param restLevel the restLevel to set
     */
    public void setRestLevel(int restLevel) {
        this.restLevel = restLevel;
    }

    /**
     * @return the bladderLevel
     */
    public int getBladderLevel() {
        return bladderLevel;
    }

    /**
     * @param bladderLevel the bladderLevel to set
     */
    public void setBladderLevel(int bladderLevel) {
        this.bladderLevel = bladderLevel;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the luck
     */
    public double getLuck() {
        return luck;
    }

    /**
     * @param luck the luck to set
     */
    public void setLuck(double luck) {
        this.luck = luck;
    }

    /**
     * @return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the hairColor
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * @param hairColor the hairColor to set
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * @return the eyeColor
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * @param eyeColor the eyeColor to set
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
        
    
////////////updateState/////////////////////////////////////////////////////////
    public void updateState() { //Updates warning messages and variables based on player condition.
        
        //Bladder test
        if (bladderLevel > 100){
            this.setBladderLevel(100);
        }
        else if (bladderLevel < 50 && bladderLevel > 15){
            System.out.println("You may have to use the restroom soon.");
        }
        else if (bladderLevel <= 15 && bladderLevel > 0) {
            System.out.println("You REALLY need to use the restroom!");
        }
        else if (bladderLevel <= 0) {
            System.out.println("Your bladder has exploded. Game Over.");
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        
        //Rest test
        if (restLevel > 100) {
            this.setRestLevel(100);
        }
        else if (restLevel < 50 && restLevel > 15){
            System.out.println("You are getting tired.");
        }
        else if (restLevel <= 15 && restLevel > 0) {
            System.out.println("You are REALLY tired!");
        }
        else if (restLevel <= 0) {
            System.out.println("You have passed out. Game Over.");
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        
        //Hunger test
        if (hungerLevel > 100) {
            this.setHungerLevel(100);
        }
        else if (hungerLevel < 50 && hungerLevel > 15){
            System.out.println("You are getting hungry.");
        }
        else if (hungerLevel <= 15 && hungerLevel > 0) {
            System.out.println("You are REALLY hungry!");
        }
        else if (hungerLevel <= 0) {
            System.out.println("You have starved. Game Over.");
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        
        //sets luck for each update()
        this.luck = Math.floor(Math.random()*20)+1;
        this.hungerLevel -= 5;
    }    
///////////viewStatus///////////////////////////////////////////////////////////
    public void viewStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Bladder Level: " + this.bladderLevel);
        System.out.println("Hunger Level: " + this.hungerLevel);
        System.out.println("Rest Level: " + this.restLevel);
        System.out.println("Job: " + this.job);
        System.out.println("Money: $" + this.money);
    }
/////////eatFood////////////////////////////////////////////////////////////////
   public void eatFood() {
    
    Scanner sc = new Scanner(System.in);   
    boolean goodInput = false;
    int foodType;
    
    //Loop until valid food is chosen.
    while (goodInput == false) {
       
       System.out.println("What would you like to eat?");
       System.out.println("1.Pancakes $8.00)              4.)Cheeseburger $7.50");
       System.out.println("2.Pizza $25.00)                5.)Tacos $5.00");
       System.out.println("3.Salad $12.00)                6.)Steak $30.00");
       foodType = sc.nextInt();
        
       //Food Types
       switch (foodType)
       {
           case 1:
               if (money < 8.00) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten Pancakes! You paid $8.00.");
                   this.setHungerLevel(hungerLevel+30);
                   this.setBladderLevel(bladderLevel-10);
                   this.setMoney(money-8.00);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel >= 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
               }
           
           case 2:
               if (money < 25.00) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten Pizza! You paid $25.00.");
                   this.setHungerLevel(hungerLevel+70);
                   this.setBladderLevel(bladderLevel-25);
                   this.setMoney(money-18.00);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel > 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
                   
               }
           
           case 3:
               if (money < 12.00) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten a Salad! You paid $12.00.");
                   this.setHungerLevel(hungerLevel+50);
                   this.setBladderLevel(bladderLevel-30);
                   this.setMoney(money-12.00);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel > 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
               }
           case 4:
               if (money < 7.50) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten a Cheeseburger! You paid $7.50.");
                   this.setHungerLevel(hungerLevel+12);
                   this.setBladderLevel(bladderLevel-5);
                   this.setMoney(money-7.50);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel >= 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
               }
           case 5:
               if (money < 5.00) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten Tacos! You paid $5.00.");
                   this.setHungerLevel(hungerLevel+10);
                   this.setBladderLevel(bladderLevel-5);
                   this.setMoney(money-5.00);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel >= 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
               }
           case 6:
               if (money < 30.00) {
                   System.out.println("You don't have enough money to pay for this.");
                   break;
               }
               else {
                   System.out.println ("You have eaten Steak! You paid $30.00.");
                   this.setHungerLevel(hungerLevel+40);
                   this.setBladderLevel(bladderLevel-20);
                   this.setMoney(money-30.00);
                   if (hungerLevel < 50) {
                       System.out.println("You are still hungry.");
                   }
                   else if (hungerLevel >= 100) {
                       System.out.println("You can not eat any more.");
                   }
                   goodInput = true;
                   this.updateState();
                   break;
               }
           default:
               System.out.println("That's not an available food.");
               goodInput = false;
               break;     
       }
       this.restLevel -= 5;
    }
  } 
///////////useRestroom//////////////////////////////////////////////////////////
    public void useRestroom() {
        this.bladderLevel = 100;
        System.out.println("You have used the restroom. You feel much better.");
        this.updateState();
    }
//////////sleep/////////////////////////////////////////////////////////////////
    public void sleep() {
        Scanner sc = new Scanner(System.in);
        int sleepTime = 0;
        boolean goodData = false;
        
        System.out.print("How many hours would you like to sleep?  ");
        
        //Loop until valid sleep time is given.
        while (goodData == false)
        {
            if (sc.hasNextInt())
            {
                sleepTime = sc.nextInt();
                
                if (sleepTime > 10)
                {
                    System.out.println("Thats probobly too long to sleep. Lets use a smaller number.");
                }
                else if (sleepTime <= 0)
                {
                    System.out.println("That's not really possible...");
                }
                else
                {
                    System.out.println("You have slept for " + sleepTime + " hours. Good morning!");
                    //Update variable stats
                    this.restLevel += sleepTime * 2 + 35;
                    this.hungerLevel -= sleepTime / 2 + 10;
                    goodData = true;
                    this.updateState();
                }
            }
            else
            {
                sc.nextLine();
                System.out.println("Please enter a number.");
            }
        }
    }
/////////goToWork///////////////////////////////////////////////////////////////
    public void goToWork() {
        
        Scanner sc = new Scanner(System.in);
        int workTime = 0;
        boolean goodData = false;
        
        System.out.print("How many hours would you to work?  ");
        
        //Loop until valid work time is given.
        while (goodData == false)
        {
            if (sc.hasNextInt())
            {
                workTime = sc.nextInt();
                
                if (workTime >= 18)
                {
                    System.out.println("Thats probobly too long to work. Lets use a smaller number.");
                }
                else if (workTime <= 0)
                {
                    System.out.println("That's not really possible you lazy bum.....");
                }
                else
                {
                    //Calculate work earnings
                    double moneyEarned = workTime * this.payRate;
                    System.out.println("You have worked for " + workTime + " hours and recieved $" + moneyEarned + ".");
                    //Update variable stats
                    this.money += moneyEarned;
                    this.restLevel -= workTime * 3;
                    this.hungerLevel -= workTime / 2 + 10;
                    goodData = true;
                    this.updateState();
                }
            }
            else
            {
                sc.nextLine();
                System.out.println("Please enter a number.");
            }
        }
    } 
/////////playLottery////////////////////////////////////////////////////////////
    public void playLottery() {
        
        if (this.money < 10)
        {
            System.out.println("I'm sorry, you do not have enough to play.");
        }
        else
        {
            //Secondary luck change for more randomness (Number from 1-20)
            this.luck = Math.floor(Math.random()*20)+1;
            this.money -= 10.00;
            System.out.println("You have spent $10 on the lottery.");

            if (this.luck >= 18)
            {
                this.money += 100.00;
                System.out.println("JACKPOT! You have won $100!");
            }
            else
            {
                System.out.println("I'm sorry, you lose this time.");
            }
            //Update variable stats
            this.hungerLevel -= 5;
            this.restLevel -= 5;
            this.bladderLevel -= 5;
            this.updateState();
        }
    }
//////////updateAge/////////////////////////////////////////////////////////////
   public void updateAge( int birthDay,  int birthMonth,  int birthYear){
       
       int yr = 0;
       int result;
       
       LocalDate today = LocalDate.now();
       
       yr = today.getYear();
       
       this.age = yr - birthYear;
       
       LocalDate bday = LocalDate.of(yr, birthMonth, birthDay); 
  
       result = today.compareTo(bday);
  
       if(result < 0) 
       {
           this.age = this.age - 1; 
       }
       
   }  
////////////updatePayRate///////////////////////////////////////////////////////
public void updatePayRate() {
    
    String userJob = this.getJob();
    
    //Sets payRate based on chosen job
    switch (userJob) {
        case "Fast Food": this.setPayRate(7.25);
            break;
        case "Retail Associate": this.setPayRate(8.00);
            break;
        case "Programmer": this.setPayRate(12.00);
            break;
        case "Artist": this.setPayRate(6.75);
            break;
        case "Tech Support": this.setPayRate(10.25);
            break;
        case "Teacher": this.setPayRate(11.50);
            break;
        default: this.setPayRate(0);
            break;
        
    }
    
} 

/////buyHouse method (Game End)/////////////////////////////////////////////////
public void buyHouse() {
    
    if (this.money < 50000) {
        System.out.println("I'm sorry, you do not have enough money to buy your dream house.");
    }
    else {
        System.out.println("You have purchased your dream house!");
        System.out.println("You WIN!  Thanks for playing!");
        System.exit(0);
    }
        
}


}
