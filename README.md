# Java_Squared-SquareRootApp
Integrative Programming Project
*By Jerald Jose*
 ## Video:
<p> This Video is the Steps process  On how to create CORBA Application </p>


[![Watch the video](https://github.com/raldzyber/JavaCORBA_Squared-SquareRootApp/blob/main/corba.png)](https://youtu.be/jFtiAhBOdgI)



## Screenshots:

<p> Screenshot during coding of the corba_app </p>
<img src="https://github.com/raldzyber/JavaCORBA_Squared-SquareRootApp/blob/main/corba_screenshot.png">

## code
 <p> The java code uses for this project: </p>
 
 
   ###### corba_app.java 
   ```java
 
 
 
  
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
```

###### SquaredServer.java
```java




import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import SquaredApp.Squared;
import SquaredApp.SquaredHelper;
import java.util.*;
public class SquaredServer {

	public static void main(String[] args) {
		try {
			//Create and initialize the orb
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			//Create and initialize the orb
			SquaredServant servant = new SquaredServant();
			servant.setOrb(orb);
			//get object reference
			org.omg.CORBA.Object ref =rootpoa.servant_to_reference(servant);
			Squared href = SquaredHelper.narrow(ref);
			
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = (NamingContextExt) NamingContextHelper.narrow(objRef);
			
			NameComponent path[] = ncRef.to_name("ABC");
			ncRef.rebind(path, href);
			
			System.out.println("Squared`s App Server ready and waiting...");
			
			//wait for invocation from clients
			for(;;) {
				orb.run();
			}
			
		} catch (Exception e) {
			System.err.println("ERROR: "+e);
			e.printStackTrace(System.out);
		}
		System.out.println("SquaredApp is Exiting....");
	}

}
```
###### SquaredClient.java
```java




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
```
###### SquaredServant
```java



import SquaredApp.*;
import org.omg.CORBA.*;
public class SquaredServant extends SquaredPOA {
	private ORB orb;
	public void setOrb(ORB orb_val) {
		orb = orb_val;
	}
	@Override
	public String getSquare(double input) {
		return "Result: The Square of " + input + " is " + (input*input);
	}

	@Override
	public String getSquareRoot(double input) {
		return "Result: The SquareRoot of " + input + " is " + (Math.sqrt(input));
	}
	
	
}
````
###### Squared.idl
```txt


module SquaredApp
{
  interface Squared
  {
  string getSquare(in double input);
  string getSquareRoot(in double input);
  };
 };
 ```
### Credits ###
 *Sir, Pilapel
 ## Done ##
