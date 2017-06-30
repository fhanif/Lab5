import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Grand Circus Casino!");
        String keepGoing = "";
        //do while loop for asking user to continue
        do {
            System.out.println("How many sides does each die have?");
            numSidesOfDice();//calling method

            System.out.println("Would you like to continue? (Y/N)");
            Scanner scnr = new Scanner(System.in);
            keepGoing = scnr.nextLine();
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));

    }


    public static int numSidesOfDice() {
//callingl scanner to enter to Roll the dice
        Scanner scnr = new Scanner(System.in);
        int numSides = scnr.nextInt(); //letting user enter number of side of dice
        System.out.println("Press enter to roll the dice now!");
        scnr.nextLine(); //cleaning the scnr object
        scnr.nextLine();
        int numRand1 = 0; //declaring random integers
        int numRand2 = 0;
        numRand1 = (int) (Math.random() * numSides + 1); //calculating random numbers
        numRand2 = (int) (Math.random() * numSides + 1);
        System.out.println(numRand1);
        System.out.println(numRand2);
        return numSides;
    }

    }



