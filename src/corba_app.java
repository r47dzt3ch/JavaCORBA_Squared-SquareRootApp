
import java.util.InputMismatchException;
import java.util.Scanner;

public class corba_app {
	public static  Scanner sc = null;
	public static void main(String[] Args ) {
		sc = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("*   SQUARE & SQUARE ROOT CORBA       *");
		System.out.println("**************************************");		
		System.out.println();
		System.out.println("What do you want to do today");
		System.out.println("1 - Get Square of a number");
		System.out.println("2 - Get Square root of a number");
		int choice = getChoice();
		if (choice == 1) {//print Square
			System.out.print(getSquare(getInput()));
		
		}else {//Get Square root
			System.out.print(getSquareRoot(getInput()));
		}		
	}

	public static String getSquare(double input) {
		return "Result: The Square of " + input + " is " + (input*input);
	}
	public static String getSquareRoot(double input) {
		return "Result: The SquareRoot of " + input + " is " + (Math.sqrt(input));
	}
	public static int getChoice() {
		try {
			System.out.println("Enter Choice: ");
			int input = sc.nextInt();
			if( input < 1 || input > 2 )throw new InputMismatchException(); 
			return input;
		}catch(InputMismatchException IME) {
			System.err.println("Error: Please input a number from 1 to 2");
			return getChoice();
		}
	}	
	public static double getInput() { 
		try {
			System.out.print("Enter Number: ");
			double inputs = sc.nextDouble();
			if (inputs < 0 ) throw new Exception();
			return inputs;
		} catch (Exception e) {
			System.err.println("Type a valid number");
			
		}
		return getInput();

	}
		
		
	
}
