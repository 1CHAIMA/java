package GestionVehicule;


public class Vehicule {
private String marque;
private int dateAchat;
private int prixAchat;
private int prixCourant;

public Vehicule(String marque, int dateAchat2, int prixAchat) {
	super();
	this.marque = marque;
	this.dateAchat = dateAchat2;
	this.prixAchat = prixAchat;
}

@Override
public String toString() {
	return "Vehicule [marque=" + marque + ", dateAchat=" + dateAchat + ", prixAchat=" + prixAchat + ", prixCourant="
			+ prixCourant + "]";
}

public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public int getDateAchat() {
	return dateAchat;
}
public void setDateAchat(int dateAchat) {
	this.dateAchat = dateAchat;
}
public int getPrixAchat() {
	return prixAchat;
}
public void setPrixAchat(int prixAchat) {
	this.prixAchat = prixAchat;
}
public int getPrixCourant() {
	return prixCourant;
}
public void setPrixCourant(int prixCourant) {
	this.prixCourant = prixCourant;
}
///methode calcul

public void calculPrix( int anneActuellle) {
	
	int diffAnnée;
	diffAnnée =anneActuellle -dateAchat;
	
    prixCourant= prixAchat- (prixAchat*diffAnnée/100);
	
	System.out.println("le prix courant de votre véhicule est : "+prixCourant);	
	
}







}
