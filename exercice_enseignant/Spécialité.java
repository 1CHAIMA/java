package exercice_enseignant;

public class Spécialité {
	//attribut
public String nom_specialite;
public int nb_heure;
// constructeur
public Spécialité(String nom_specialite, int nb_heure) {
	super();
	this.nom_specialite = nom_specialite;
	this.nb_heure = nb_heure;
}
//affichage
@Override
public String toString() {
	return "Spécialité [nom_specialite=" + nom_specialite + ", nb_heure=" + nb_heure + "]";
}
//getter setter
public String getNom_specialite() {
	return nom_specialite;
}
public void setNom_specialite(String nom_specialite) {
	this.nom_specialite = nom_specialite;
}
public int getNb_heure() {
	return nb_heure;
}
public void setNb_heure(int nb_heure) {
	this.nb_heure = nb_heure;
}
}
