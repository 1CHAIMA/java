package GestionVehicule;

import java.sql.Date;

public class Avion extends Vehicule{
private EnumAvion type;
private int nbHeurVol;



	public Avion(String marque, int dateAchat, int prixAchat, EnumAvion type, int nbHeurVol) {
		super(marque, dateAchat, prixAchat);
		this.type = type;
		this.nbHeurVol = nbHeurVol;
		
	}

	@Override
	public String toString() {
		return "Avion [type=" + type + ", nbHeurVol=" + nbHeurVol + "]";
	}


	public EnumAvion getType() {
		return type;
	}

	public void setType(EnumAvion type) {
		this.type = type;
	}

	public int getNbHeurVol() {
		return nbHeurVol;
	}

	public void setNbHeurVol(int nbHeurVol) {
		this.nbHeurVol = nbHeurVol;
	}

	@Override
	public void calculPrix(int anneActuellle) {
		int diffAnn�e;
		diffAnn�e =anneActuellle - this.getDateAchat();
		
		if (type==EnumAvion.r�action && nbHeurVol>= 1000) {
			diffAnn�e=diffAnn�e*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
			System.out.println("le nombre de vol a d�pass� 1000");
		}
		if (type==EnumAvion.h�lices && nbHeurVol>= 100) {
			diffAnn�e=diffAnn�e*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnn�e/100);
			System.out.println("le nombre d'heur a d�pass� 100");
		}
		
		//le prix ne doit pas �tre n�gatife
		if (getPrixCourant()<0) {
			this.setPrixCourant()==0;
			System.out.println("le prix et n�gatif donc �gal a 0");
		}
	}

	

}
