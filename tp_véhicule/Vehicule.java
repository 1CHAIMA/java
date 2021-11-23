package tp_véhicule;

public abstract class Vehicule {
	
	//attribut
protected  int contenanceReservoir;
protected  int contenuReservoir ; 
protected String carburant;
	
public abstract int nombre();
public abstract String type();
public abstract String vitesse();

public Vehicule() {
	super();
}

public Vehicule(int contenanceReservoir, int contenuReservoir, String carburant) {
	super();
	this.contenanceReservoir = contenanceReservoir;
	this.contenuReservoir = contenuReservoir;
	this.carburant = carburant;
}
//equalsIgnoreCase pour comparer deux chaines sans prendre en considération maj et min
public void fairePlein(Pompe pomp) {
	if(this.carburant.equalsIgnoreCase(pomp.gettypeCarburant())) {
		int volume=this.contenanceReservoir-this.contenuReservoir;
		this.contenuReservoir=this.contenanceReservoir;
		pomp.setContenu(pomp.getcontenu()-volume);
	}else {
		System.out.println("type de carburant inaproprié");
	}
};

}