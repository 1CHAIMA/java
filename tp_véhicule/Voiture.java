package tp_véhicule;

public class Voiture extends Vehicule {
	
	//constructeur
	//super pour dire une propriété héritée de la classe mère
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
