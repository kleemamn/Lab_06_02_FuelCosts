import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double costMiles = 0;
        final double hundredMiles = 100;
        double gallonTank = 0;
        double fuelEfficiency = 0;
        double distanceLeft = 0;
        double gasPrice = 0;
        String trash = "";

        System.out.print("Enter the number of gallons in the tank: ");

        if(in.hasNextDouble())
        {
            gallonTank = in.nextDouble();
            in.nextLine();
        }

          else
          {
            trash = in.nextLine();
            System.out.println("\n You said the fuel efficiency was: " + trash);
            System.out.println("Run the program again and enter a valid amount.");
            System.exit(0);
          }

        System.out.print("Enter your fuel efficieny: ");

        if(in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        }
          else
          {
            trash = in.nextLine();
              System.out.println("\n Your said the fuel efficiency was: " + trash);
              System.out.println("Run the program again and enter a valid amount!");
              System.exit(0);
          }

        System.out.print("Enter the price of gas: ");

        if(in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
            in.nextLine();
        }

          else
          {
            trash = in.nextLine();
            System.out.println("\n You said the fuel efficiency was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
          }

        costMiles = gasPrice * hundredMiles;
        distanceLeft = gallonTank * fuelEfficiency;
        System.out.print("The cost per 100 miles is; " + costMiles);
        System.out.println();
        System.out.print("You have " + distanceLeft + " miles left.");
        System.out.println();
    }
}