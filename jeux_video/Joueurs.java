package jeux_video;

import java.util.Random;

public class Joueurs {
private String nom;
private int sante=10;
private int force;
private int experiance=1;
private Arme arme;
//constructeur
public Joueurs(String nom, int force) {
	super();
	this.nom = nom;
	this.force = force;
}
//getter setter
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getSante() {
	return sante;
}
public void setSante(int sante) {
	this.sante = sante;
}
public int getForce() {
	return force;
}
public void setForce(int force) {
	this.force = force;
}
public int getExperiance() {
	return experiance;
}
public void setExperiance(int experiance) {
	this.experiance = experiance;
}
public Arme getArme() {
	return arme;
}
public void setArme(Arme arme) {
	this.arme = arme;
}
//affichage
@Override
public String toString() {
	return "Joueurs [nom=" + nom + ", sante=" + sante + ", force=" + force + ", experiance=" + experiance + ", arme="
			+ arme + "]";
}
//methode
public void desarmer() {
    this.arme=null;
 }

public void changeArme( Arme arme) {
    this.arme=arme;
 }


}
