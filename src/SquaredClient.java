
import org.omg.CosNaming.*;
import SquaredApp.Squared;
import SquaredApp.SquaredHelper;
import org.omg.CORBA.*;
import java.util.*;
public class SquaredClient {
	public static Scanner sc = null;
	public static void main(String[] args) {

		try {
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = (NamingContextExt) NamingContextHelper.narrow(objRef);
			Squared squaredObj = (Squared) SquaredHelper.narrow(ncRef.resolve_str("ABC"));
			
			//Actual coding for client
			sc = new Scanner(System.in); 
			for(;;) {
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
					System.out.print(squaredObj.getSquare(getInput()));
				
				}else {//Get Square root
					System.out.print(squaredObj.getSquareRoot(getInput()));
				}		
			}
		} catch (Exception e) {
			System.err.println("Squared Client Exceptio: "+e);
			e.printStackTrace(System.out);
		}

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
