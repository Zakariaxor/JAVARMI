import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/** This is the actual implementation of Rem that the RMI
 *  server uses. The server builds an instance of this, then
 *  registers it with a URL. The client accesses the URL and
 *  binds the result to a Rem (not a RemImpl; it doesn't
 *  have this).
 */

public class RemImpl extends UnicastRemoteObject implements Rem {
  public RemImpl() throws RemoteException 
  {
	  
  }

  public String getMessage() throws RemoteException {
    
	  return("Here is a remote message.");
  }


public String login(String email, String mp) throws RemoteException {
	// TODO Auto-generated method stub
	
            Connection cn;
            String rep = "non";
      try {
          cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
  

    
String sql = "select * from user where  email  like  '"+email+"' "
        + "    and  password  like  '"+mp+"'          ";

Statement st = cn.createStatement();
ResultSet rs = st.executeQuery(sql);

int i = 0;
while  (rs.next())
{
i++;
} 
  
if(i>0)rep = "oui"; else rep = "non";


     } catch (SQLException ex) {
          Logger.getLogger(RemImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
  return rep;      
}
  

public String inscription(String nom,String email, String mp) throws RemoteException {
	// TODO Auto-generated method stub
	
            Connection cn;
   
      try {
          cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
  

    
String sql = "INSERT INTO `hotel`.`user` (`id`, `nom_user`, `email`, `password`) VALUES "
        + " (NULL, '"+nom+"', '"+email+"', '"+mp+"');   ";

Statement st = cn.createStatement();
 st.executeUpdate(sql);



     } catch (SQLException ex) {
          Logger.getLogger(RemImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  return "Inscription Effectuer avec Succée ! ";      
  
}


public DefaultTableModel Affichage(String rech  ) throws RemoteException {
	// TODO Auto-generated method stub
	
        
       String[] titres = {" Nom " , " date_debut " , " date_fin  " ,"nbre_p",  " type_chambre " , " email " };
       

       
String[] collone = new String[20];

DefaultTableModel affichage = new DefaultTableModel(null,titres);

  Connection cn;
        try {
            
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
    
String sql = "select * from  reservation ";

Statement st = cn.createStatement();
ResultSet rs = st.executeQuery(sql);

while  (rs.next())
{
    collone[0] = rs.getString("nom") ;
collone[1] = rs.getString("date_debut") ;
collone[2] = rs.getString("date_fin") ;
collone[3] = rs.getString("nbre_p") ;
collone[4] = rs.getString("type_chambre") ;
collone[5] = rs.getString("email") ;

affichage.addRow(collone);
}


    } catch (SQLException ex) {
            Logger.getLogger(RemImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
   
            
 return affichage;
 
}

   public String res(String nom,String adresse,String tel,String email, String mp) throws RemoteException {
	// TODO Auto-generated method stub
             Connection cn;
      try {      
          cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
  
  

    
String sql = "INSERT INTO `hotel`.`reservation` (`id_reservation`, `nom`, `date_debut`, `date_fin`, `nbre_p`, `type_chambre`, `email`) "
        + "VALUES (NULL, '"+nom+"', '"+adresse+"', '"+tel+"', '"+email+"', '"+mp+"', '*******'); ";

Statement st = cn.createStatement();
 st.executeUpdate(sql);


    } catch (SQLException ex) {
          Logger.getLogger(RemImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    
  return "Commande Effectuer avec Succée ! ";   
    
  
}

  



}
