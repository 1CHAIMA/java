package exercice_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IDao<Etudiant>{
	Connection connect = GetConnection.getConnection();
	ResultSet rs = null;
//CRUD - creat
	public void create(Etudiant object) {
		 PreparedStatement sql;
        try {
           sql = connect.prepareStatement("INSERT INTO etudiant (nom,prenom) VALUES (?,?)");
           sql.setString(1, object.getNom()); 
           sql.setString(2, object.getPrenom());
           sql.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
//CRUD - READ:
    
    public List<Etudiant> read() {
        
      List<Etudiant> listeetudiant = new ArrayList<>();
      ResultSet rs = null;
      PreparedStatement sql2;
        try {
            sql2 = connect.prepareStatement("SELECT * FROM etudiant");
            rs = sql2.executeQuery();
            while(rs.next()) {
            	Etudiant etudiant = new Etudiant(rs.getString("nom"),rs.getString("prenom"));
            	listeetudiant.add(etudiant);
               
            }
        
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return listeetudiant;
        
    }
	
//CRUD  update
    
    //public void update(String nom, String prenom, int id ) {
    public void update(Etudiant etudiant, int id ) {
    	try {
			PreparedStatement sql = connect.prepareStatement("update etudiant set nom=?, prenom=? where id =?");
		    sql.setString(1, etudiant.getNom());
		    sql.setString(2, etudiant.getPrenom());
		    sql.setInt(3, id);
		    
		    System.out.println(sql);
		    sql.executeUpdate();
		    System.out.println(etudiant.getPrenom()+" a étét bien modifier");
		    
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }
  //CRUD --DELETE
    public void delete(int id ) {
    	try {
			PreparedStatement sql = connect.prepareStatement("delete from etudiant where id =?");
		    sql.setInt(1, id);
		    sql.executeUpdate();
		    System.out.println("delete ok ");
		   
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }
  //findBy
    /// affiche selon "id" saisie en param
    public Etudiant findById(int id_en_param) {
		Etudiant etuById = null;
		
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM etudiant WHERE id=?");
			req.setInt(1, id_en_param);
			rs = req.executeQuery();
			while(rs.next()) {
				 etuById = new  Etudiant(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etuById;
	}
    /// affiche selon "nom" saisie en param 
    public List<Etudiant> findByName(String nom) {
		Etudiant etuByName = null;
		
		List<Etudiant> etudi = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM etudiant WHERE nom like ?");
			req.setString(1, nom);
			
			rs = req.executeQuery();
			while(rs.next()) {
				 etuByName = new  Etudiant(rs.getInt("id"),rs.getString("nom"), rs.getString("prenom"));
				 
				 etudi.add(etuByName);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudi;
	}




	
}
