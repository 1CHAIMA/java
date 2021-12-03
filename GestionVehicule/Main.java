package GestionVehicule;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicule v1 = new Vehicule("mercedece",2020 , 200);
Vehicule v2 = new Vehicule("airbus", 2010, 0);
System.out.println("véhicule 1: "+v1);
System.out.println("véhicule 2: "+v2);

Voiture voiture =new Voiture("mercedece", 2020, 200, 4, 5, 7, 20 );
System.out.println("nouvelle voiture dans bd : "+voiture);

Avion avion =new Avion("airbus", 2010, 200, EnumAvion.hélices, 1000);

System.out.println("voila les donnée de ma nouvelle avion : "+avion+" date d'achat: "+avion.getDateAchat()+" la marque: "+avion.getMarque()
		+" prix d'achat: "+avion.getPrixAchat());
//affichage du prix courant
avion.calculPrix( 2007);
voiture.calculPrix(2020);
	}

}
