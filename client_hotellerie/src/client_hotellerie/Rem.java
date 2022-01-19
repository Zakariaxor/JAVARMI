
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.table.DefaultTableModel;


public interface Rem extends Remote{

public String getMessage() throws RemoteException;
	public String login(String email, String mp) throws RemoteException ;
   public String inscription(String nom,String email, String mp) throws RemoteException;
       public String res(String nom,String adresse,String tel,String email, String mp) throws RemoteException ;
        public DefaultTableModel Affichage(String rech  ) throws RemoteException ;
}
