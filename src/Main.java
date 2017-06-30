import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Grand Circus Casino!");
        String keepGoing = "";
        do {
            System.out.println("How many sides does each die have?");
            NumSidesOfDice();

            System.out.println("Would you like to continue? (Y/N)");
            Scanner scnr = new Scanner(System.in);
            keepGoing = scnr.nextLine();
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));

    }


    public static int NumSidesOfDice() {

        Scanner scnr = new Scanner(System.in);
        int numSides = scnr.nextInt();
        System.out.println("Roll the dice now!");
        scnr.nextLine();
        scnr.nextLine();
        int numRand1 = 0;
        int numRand2 = 0;
        numRand1 = (int) (Math.random() * numSides + 1);
        numRand2 = (int) (Math.random() * numSides + 1);
        System.out.println(numRand1);
        System.out.println(numRand2);
        return numSides;
    }

    }



