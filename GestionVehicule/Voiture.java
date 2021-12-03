package GestionVehicule;

import java.sql.Date;

public class Voiture extends Vehicule {
private int cylindr�e;
private int nbPorte;
private int puissance;
private int kilometrage;

	public Voiture(String marque, int dateAchat, int prixAchat, int cylindr�e, int nbPorte, int puissance, int kilometrage) {
	super(marque, dateAchat, prixAchat);
	this.cylindr�e = cylindr�e;
	this.nbPorte = nbPorte;
	this.puissance = puissance;
	this.kilometrage = kilometrage;
	
    }

	@Override
	public String toString() {
		return "Voiture [cylindr�e=" + cylindr�e + ", nbPorte=" + nbPorte + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + "]";
	}

	
	public int getCylindr�e() {
		return cylindr�e;
	}

	public void setCylindr�e(int cylindr�e) {
		this.cylindr�e = cylindr�e;
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
		int diffAnn�e;
		diffAnn�e =anneActuellle -    this.getDateAchat()  ;
		//2%
		diffAnn�e=diffAnn�e*2;
		this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
		System.out.println("le prix courant de votre v�hicule est : "+this.getPrixCourant());	
		//5% kilom�trage
		if (kilometrage >10000) {
			diffAnn�e=diffAnn�e*5;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
			System.out.println("le kilom�trage a d�pass� 10000");
		}
		//10% marque
		if (this.getMarque()=="renault" || this.getMarque()=="fiat" ) {
			diffAnn�e=diffAnn�e*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
			System.out.println("la marque de voiture est renaul ou fiat");
		}else if (this.getMarque()=="ferrari" || this.getMarque()=="porsche") {
			//20%
			diffAnn�e=diffAnn�e*20;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
			System.out.println("la marque de voiture est ferrari ou porsche");
		}
		
		//le prix ne doit pas �tre n�gatife
		if (getPrixCourant()<0) {
			this.setPrixCourant()==0;
			System.out.println("le prix et n�gatif donc �gal a 0");
		}
	}

	
	

	
}
