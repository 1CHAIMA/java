package GestionVehicule;

import java.sql.Date;

public class Voiture extends Vehicule {
private int cylindrée;
private int nbPorte;
private int puissance;
private int kilometrage;

	public Voiture(String marque, int dateAchat, int prixAchat, int cylindrée, int nbPorte, int puissance, int kilometrage) {
	super(marque, dateAchat, prixAchat);
	this.cylindrée = cylindrée;
	this.nbPorte = nbPorte;
	this.puissance = puissance;
	this.kilometrage = kilometrage;
	
    }

	@Override
	public String toString() {
		return "Voiture [cylindrée=" + cylindrée + ", nbPorte=" + nbPorte + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + "]";
	}

	
	public int getCylindrée() {
		return cylindrée;
	}

	public void setCylindrée(int cylindrée) {
		this.cylindrée = cylindrée;
	}

	public int getNbPorte() {
		return nbPorte;
	}

	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	@Override
	public void calculPrix(int anneActuellle) {
		int diffAnnée;
		diffAnnée =anneActuellle -    this.getDateAchat()  ;
		//2%
		diffAnnée=diffAnnée*2;
		this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
		System.out.println("le prix courant de votre véhicule est : "+this.getPrixCourant());	
		//5% kilométrage
		if (kilometrage >10000) {
			diffAnnée=diffAnnée*5;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
			System.out.println("le kilométrage a dépassé 10000");
		}
		//10% marque
		if (this.getMarque()=="renault" || this.getMarque()=="fiat" ) {
			diffAnnée=diffAnnée*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
			System.out.println("la marque de voiture est renaul ou fiat");
		}else if (this.getMarque()=="ferrari" || this.getMarque()=="porsche") {
			//20%
			diffAnnée=diffAnnée*20;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
			System.out.println("la marque de voiture est ferrari ou porsche");
		}
		
		//le prix ne doit pas étre négatife
		if (getPrixCourant()<0) {
			this.setPrixCourant()==0;
			System.out.println("le prix et négatif donc égal a 0");
		}
	}

	
	

	
}
