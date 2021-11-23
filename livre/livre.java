package livre;

public class livre {
	private String titre;
	private String auteur;
	private int prix;
	
	public livre(String titre, String auteur, int prix) {
		this.titre=titre;
		this.auteur=auteur;
		this.prix=prix;
	}
	
	@Override
	public String toString() {
		return "MON TABLEAUX DES LIVRE:  titre=" + titre + ", auteur=" + auteur + ", prix=" + prix ;
	}
	
	
	public String getTitre() {
		return this.titre;
	}
	
	public String getAuteur() {
		return this.auteur;
	}
	
	public int getPrix() {
		return this.prix;
	}
	
	
	
}
