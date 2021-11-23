package exercice_ville;

public class ville {
	private String nom;
	private String departement;
	
	
	public void methode () {
		System.out.println("la ville "+nom+"est dans le département "+departement);
	}

	public String getNom() {
		return this.nom;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", departement=" + departement  ;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	
}
