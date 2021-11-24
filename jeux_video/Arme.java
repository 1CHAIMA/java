package jeux_video;

public class Arme {
public String nom_arme;
public Type type;
public int puissance;
//constructeur
public Arme(String nom_arme, Type type, int puissance) {
	super();
	this.nom_arme = nom_arme;
	this.type = type;
	this.puissance = puissance;
}
//affichage
@Override
public String toString() {
	return "nom_arme=" + nom_arme + ", type=" + type + ", puissance=" + puissance;
}
//getter setter
public String getNom_arme() {
	return nom_arme;
}
public void setNom_arme(String nom_arme) {
	this.nom_arme = nom_arme;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public int getPuissance() {
	return puissance;
}
public void setPuissance(int puissance) {
	this.puissance = puissance;
}




	
	
	
	
	
	
}
