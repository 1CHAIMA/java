package tp_v�hicule;

public class Voiture extends Vehicule {
	
	//constructeur
	//super pour dire une propri�t� h�rit�e de la classe m�re
	public Voiture(int contenueReservoir, int contenanceReservoir, String carburant) {
		super();
		this.contenanceReservoir = contenanceReservoir;
		this.contenueReservoir = contenueReservoir;
		this.carburant = carburant;
	}

	@Override
	public int nombre() {
		
		return 4;
	}

	@Override
	public String type() {
		
		return "essance";
	}

	@Override
	public String vitesse() {
		
		return "vitesse max de la voiture: 300 ";
	}

	


}
