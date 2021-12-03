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
		int diffAnnée;
		diffAnnée =anneActuellle - this.getDateAchat();
		
		if (type==EnumAvion.réaction && nbHeurVol>= 1000) {
			diffAnnée=diffAnnée*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
			System.out.println("le nombre de vol a dépassé 1000");
		}
		if (type==EnumAvion.hélices && nbHeurVol>= 100) {
			diffAnnée=diffAnnée*10;
			this.setPrixCourant() = this.getprixAchat()- (this.getprixAchat()*diffAnnée/100);
			System.out.println("le nombre d'heur a dépassé 100");
		}
		
		//le prix ne doit pas étre négatife
		if (getPrixCourant()<0) {
			this.setPrixCourant()==0;
			System.out.println("le prix et négatif donc égal a 0");
		}
	}

	

}
