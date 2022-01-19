

import java.rmi.*; // For Naming, RemoteException, etc.
import java.net.*; // For MalformedURLException
import java.io.*; // For Serializable interface


/**
 * Get a Rem object from the specified remote host. Use its methods as though it
 * were a local object.
 */

public class RemClient {
	public static void main(String[] args) {
	client();	
	}
        
     public static void client()
     {
      try {

			String host =  "localhost";
			String port = "1099";
			// Get the remote object and store it in remObject:
			Rem remObject = (Rem) Naming.lookup("rmi://" + host + ":" + port + "/Rem");
			// Call methods in remObject:
			System.out.println(remObject.getMessage());
			System.out.println(remObject.login("f","f"));
			
		
		} catch (RemoteException re) {
			System.out.println("RemoteException: " + re);
		} catch (NotBoundException nbe) {
			System.out.println("NotBoundException: " + nbe);
		} catch (MalformedURLException mfe) {
			System.out.println("MalformedURLException: " + mfe);
		}   
     }
 
        
        
}
