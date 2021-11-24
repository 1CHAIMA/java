package exercice_filière;

public class Filiere {
public String nom;
public String prenom;
public String filiere;
//constructeur
public Filiere(String nom, String prenom, String filiere) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.filiere = filiere;
}
//affichage
@Override
public String toString() {
	return "Filiere [nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + "]";
}

//getter setter
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getFiliere() {
	return filiere;
}
public void setFiliere(String filiere) {
	this.filiere = filiere;
}


}
