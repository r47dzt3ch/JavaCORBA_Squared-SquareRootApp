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
