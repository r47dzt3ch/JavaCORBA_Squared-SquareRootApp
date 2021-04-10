
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
