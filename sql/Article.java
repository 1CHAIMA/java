package sql;

import java.sql.Connection;
import java.sql.Date;

public class Article {
	private int id;
	private String titre;
	private String auteur;
	
	
	//variable globale
	//Connection connect = GetConnection.getConnection();
	
	
	public Article(int id, String titre, String auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getId() {
		return id;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
