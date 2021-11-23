package exercice_enseignant;

public class Enseignant extends Spécialité {
	//attribut
public String nom;
public String prenom;
public String adresse;
//constructeur
public Enseignant(String nom_specialite, int nb_heure, String nom, String prenom, String adresse) {
	super(nom_specialite, nb_heure);
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}
//affichage
@Override
public String toString() {
	return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", nom_specialite="
			+ nom_specialite + ", nb_heure=" + nb_heure + ", toString()=" + super.toString() + ", getNom_specialite()="
			+ getNom_specialite() + ", getNb_heure()=" + getNb_heure() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + "]";
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

}
