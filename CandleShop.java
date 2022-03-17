import java.util.Scanner;

public class CandleShop {

        public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);


        // **********CANDLE ONE *******************
        System.out.println("Enter Name #1: ");
        String name = scnr.nextLine();
        System.out.println("Enter type #1: ");
        int type = scnr.nextInt();
        System.out.println("Enter Cost #1: ");
        double cost = scnr.nextDouble();
        System.out.println("Enter burnTime #1: ");
        int burnTime = scnr.nextInt();
        scnr.nextLine();
        
        Candle candleOne = new Candle(name, type, cost, burnTime);
       
        
        // ***********CANDLE TWO**************
        System.out.println("Enter Name #2: ");
        String name2 = scnr.nextLine();
        System.out.println("Enter type #2: ");
        int type2 = scnr.nextInt();
        System.out.println("Enter Cost #2: ");
        double cost2 = scnr.nextDouble();
        System.out.println("Enter burnTime #2: ");
        int burnTime2 = scnr.nextInt();
        scnr.nextLine();

        Candle candleTwo = new Candle(name2, type2, cost2, burnTime2);
       
        
        // ***********CANDLE THREE****************
        
        System.out.println("Enter Name #3: ");
        String name3 = scnr.nextLine();
        System.out.println("Enter type #3: ");
        int type3 = scnr.nextInt();
        System.out.println("Enter Cost #3: ");
        double cost3 = scnr.nextDouble();
        System.out.println("Enter burnTime #3: ");
        int burnTime3 = scnr.nextInt();
        scnr.nextLine();

        Candle candleThree = new Candle(name3, type3, cost3, burnTime3);
      

        // *******MAKE A PURCHASE***********
       
        System.out.println("Enter in how many candles of type 1: ");
        int amtTypeOne = scnr.nextInt(); 
        while (amtTypeOne < 0 || amtTypeOne > 10 || amtTypeOne == 0){
          System.out.println("Please enter a new amount between 0 and 10");
          amtTypeOne = scnr.nextInt();
        }
    
        System.out.println("Enter in how many candles of type 2: ");
        int amtTypeTwo = scnr.nextInt();
        while (amtTypeTwo < 0 || amtTypeTwo > 10 || amtTypeTwo == 0){
          System.out.println("Please enter a new amount between 0 and 10");
        amtTypeTwo = scnr.nextInt();
        }

        System.out.println("Enter in how many candles of type 3: ");
        int amtTypeThree = scnr.nextInt();
        while (amtTypeThree < 0 || amtTypeThree >= 10 || amtTypeThree == 0){
          System.out.println("Please enter a new amount between 0 and 10");
        amtTypeThree = scnr.nextInt();
        }
        scnr.nextLine();
  
        double price = amtTypeOne * candleOne.getCost();
        double price2 = amtTypeTwo * candleTwo.getCost();
        double price3 = amtTypeThree * candleThree.getCost();

        double total = price + price2 + price3;

        System.out.println();
        System.out.print("Your total will be: $");
        System.out.println(String.format("%.02f", total));
        System.out.println();
        System.out.println();

        double candle1Cost = candleOne.getCost();
        double candle2Cost = candleTwo.getCost();
        double candle3Cost = candleThree.getCost();
        double beforeDiscount = (candle1Cost + candle2Cost + candle3Cost);
      
          if (total > 20 && total < 35)
          {
            System.out.println("You received a 5% discount!");
            System.out.println("Your new total is: $ " + String.format("%.02f",(total - (total + 0.05))));
            
          }
          else if (total > 35 && total < 55)
          {
            System.out.println("You received a 7% discount!");
            System.out.println("Your new total is: $" + String.format("%.02f",(total - (total * 0.07))));
            
          }
          else if (total > 55 && total < 100)
          {
            System.out.println("You received a 10% discount!");
            System.out.print("Your new total is: $" + String.format("%.02f",(total - (total*0.10))));

          }
          else
          {
            System.out.println("Wow! Your purchase was over $100. Enjoy this 20% off discount!");
            System.out.println("Your new total is: $" + String.format("%.02f",(total - (total * 0.20))));
          }
         
        
        System.out.println();
        System.out.println("Thanks for your purchase! Have a nice day!");
        System.out.println();

        //*********BURN TIME***********

        int candle1Time = candleOne.getTime();
        int candle2Time = candleTwo.getTime();
        int candle3Time = candleThree.getTime();

        int totalBurnTime = (candle1Time + candle2Time + candle3Time);
        System.out.println("The amount of minutes if candles were burnt consecutively is: " + totalBurnTime + " minutes");

    
        double costPerMin = (total/totalBurnTime);
        System.out.print("The cost per minute amount is: $ ");
        System.out.print(String.format("%.02f", costPerMin));
        System.out.print(" per min");
        System.out.println();
        System.out.println();
        

        //******DISPLAY EVERYTHING*********

        System.out.println("You bought: " + amtTypeOne + " of the type " + type + " candle(s). These are the: " + name + " candles." );
        System.out.println("You bought: " + amtTypeTwo + " of the type " + type2 + " candle(s). These are the: " + name2 + " candles." );
        System.out.println("You bought: " + amtTypeThree + " of the type " + type + " candle(s).These are the: " + name3 + " candles." );
        System.out.println();

        System.out.print("Your total before the discount was: $");
        System.out.println(String.format("%.02f", total));
        System.out.println();

        System.out.print("Your total after the discount was: $");
        System.out.println(String.format("%.02f", (total - beforeDiscount)));
        System.out.println();
       
        System.out.println("The total burn time for your purchase is: " + totalBurnTime + " minutes");
        System.out.println();

        System.out.print("The cost per minute to burn all the candles is: $");
        System.out.print(String.format("%.02f", costPerMin));
        System.out.print(" per min");
        System.out.println();
        System.out.println();

        //********VISUALIZE**********
      
        System.out.println("***Histogram for Amount of Candles Purchased***");
        System.out.println();
        System.out.print(amtTypeOne + (" Type ") + candleOne.getType() + "(" + name  + ")" + " candles: ");
        for (int i = 0; i < amtTypeOne; i++){
          System.out.print("#");
        }
        System.out.println();
        System.out.print(amtTypeTwo + (" Type ") + candleTwo.getType() + "(" + name2 + ")" + " candles: ");
        for (int j = 0; j < amtTypeTwo; j++){
          System.out.print("@");
        }
        System.out.println();
        System.out.print(amtTypeThree + (" Type ") + candleThree.getType() + "(" + name3 + ")" + " candles: ");
        for (int y = 0; y < amtTypeThree; y++){
          System.out.print("?");
        }
        System.out.println();
        System.out.println();

        //*********AWARDS PROGRAM ***********

        System.out.println();
        System.out.println("Welcome to Our Loyalty Program");
        
        int candleAmtTotal = (amtTypeOne + amtTypeTwo + amtTypeThree);
        int points = (candleAmtTotal/10);
        if (points >= 1){
          System.out.println("You have earned: " + points + " points");
        }
        else
        {
          System.out.println("Sorry, you need to purchase more candles to earn points.");
        }
        System.out.println();
        System.out.println();
        scnr.close();
    }
  
}