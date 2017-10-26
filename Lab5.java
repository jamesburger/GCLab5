import java.util.Scanner;

public class Lab5 {
	
	//Author: James Burger
	// Program sets up two random number generators set to a user's input, gives back results 
	//as dice rolls.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String choice = "y";
		int userDie = 0;
		
		System.out.println("Would you like to roll the dice? (y/n)");
		choice = scan.nextLine();
		System.out.println("Enter what kind of die you'd like to roll! (6, 8, 12, 20)");
		userDie = scan.nextInt();
		scan.nextLine();
		
		//While loop validates user's y/n input, then rolls the "dice" and prints their results
while (choice.equalsIgnoreCase("y")) {
	int dieRoll1 = randomGenerator1(0, userDie);
	int dieRoll2 = randomGenerator2(0, userDie);
	
		System.out.println(dieRoll1);
		System.out.println(dieRoll2);
		
		int dieTotal = dieRoll1 + dieRoll2;
		
		if(dieTotal == 7) {
			System.out.println("CRAPS!");
		}
		else if (dieTotal == 2) {
			System.out.println("SNAKE EYES!");
		}
		else if (dieTotal == 12) {
			System.out.println("BOX CARS!");
		}
		else {
			System.out.println("Nice roll!!");
		}

		System.out.println("Would you like to roll the dice again? (y/n)");
		choice = scan.nextLine();
}
		
}

	
//Methods to generate random numbers.
	//Couldn't figure out how to get both of these into one method and still have it work
	//Some feedback there would be appreciated.
	
	public static int randomGenerator1(int die1, int userDie) {
		die1 = (int) (Math.random() * userDie) + 1;
		return die1;

	}

	public static int randomGenerator2(int die1, int userDie) {
		die1 = (int) (Math.random() * userDie) + 1;
		return die1;

	}

}
