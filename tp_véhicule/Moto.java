package tp_véhicule;


	//constructeur
	public Moto(int contenueReservoir, int contenanceReservoir, String carburant) {
		super();
		this.contenanceReservoir = contenanceReservoir;
		this.contenueReservoir = contenueReservoir;
		this.carburant = carburant;
	}

	@Override
	public int nombre() {
		return 2;
	}

	@Override
	public String type() {	
		return "diesel";
	}

	@Override
	public String vitesse() {	
		return "vitesse max du moto 120 ";
	}

	



}
