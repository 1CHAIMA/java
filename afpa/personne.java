package afpa;

public class personne {
//les attributs
	private String nom;
	private String prenom;
	//les methods
	
	public void manger () {
	System.out.println("je mange du choco");	
	}
	@Override
	public String toString() {
		return "personne nom=" + nom + ", prenom=" + prenom ;
	}
	// avec paramètre
	public personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
 //sans param
	public personne() {
		super();	
	}
	//générer les get et set -> source genereat tosetring
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}