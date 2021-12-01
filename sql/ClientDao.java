package sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// les fonction qui nous fait accéder a la bdd
//classe de traitement
public class ClientDao implements IDao<Client>{
	Connection connect = GetConnection.getConnection();
	@Override
	public void create(Client object) {
		//CRUD - C avec PreparedStatement: !!!! à utiliser impérativement pour éviter les injections slq
        //et donc les failles de sécu

        PreparedStatement sql;//sql est un objet 
        try {
            sql = connect.prepareStatement("INSERT INTO client (nom,prenom) VALUES (?,?)");//requette
            //on set la valeur du premier ?
            sql.setString(1, object.getNom()); // setString pour modifier les valeurs '?' 
            //on set la valeur du 2ème ?
            sql.setString(2, object.getPrenom());
            //puis on execute ce qu'on a préparer
            sql.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
	/*Connection connect = GetConnection.getConnection();
    //CRUD - CREAT
    public void create(String nom, String prenom) {
    
    	//CRUD - C avec PreparedStatement: !!!! à utiliser impérativement pour éviter les injections slq
        //et donc les failles de sécu
        PreparedStatement sql;//sql est un objet 
        try {
            sql = connect.prepareStatement("INSERT INTO client (nom,prenom) VALUES (?,?)");//requette
            //on set la valeur du premier ?
            sql.setString(1, nom); // setString pour modifier les valeurs '?' 
            //on set la valeur du 2ème ?
            sql.setString(2, prenom);
            //puis on execute ce qu'on a préparer
            sql.executeUpdate();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    //CRUD - R:
    
    public List<Client> read() {
        
        List<Client> listeClients = new ArrayList<>();
        
        //pour récupérer les données de la table: resultset
        ResultSet rs = null;
        
        //plus sécur:
        PreparedStatement sql2;
        try {
            sql2 = connect.prepareStatement("SELECT * FROM client");
            //sql2.setString(1,"client");
            
            rs = sql2.executeQuery();// pour select 
            while(rs.next()) {
                Client client = new Client(rs.getString("nom"),rs.getString("prenom"));//instanciation = objet
                listeClients.add(client);// listeClient = triée ce que je veux afficher de ma base de donner (table client)
                System.out.println("votre id est: "+rs.getInt("id")); 
            }
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeClients;// pour n'ecrase pas les donner d'avant
        
    }
   //CRUD  update
    
    //public void update(String nom, String prenom, int id ) {
    public void update(Client client, int id ) {
    	try {
			PreparedStatement sql = connect.prepareStatement("update client set nom=?, prenom=? where id =?");
		    sql.setString(1, client.getNom());
		    sql.setString(2, client.getPrenom());
		    sql.setInt(3, id);
		    
		    System.out.println(sql);
		     
		    sql.executeUpdate();
		    
		    System.out.println(client.getPrenom()+" a étét bien modifier");
		    
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  //CRUD --DELETE
    public void delete(int id ) {
    	try {
			PreparedStatement sql = connect.prepareStatement("delete from client where id =?");
		   
		    sql.setInt(1, id);
		    
		    sql.executeUpdate();
		    System.out.println("delete ok ");
		   
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/
  
    
}