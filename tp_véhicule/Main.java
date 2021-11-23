package tp_véhicule;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Vehicule v = new Voiture();
		
		System.out.println("type du carburon de la voiture : "+v.type());
		System.out.println("nombre de roues de la voiture = "+v.nombre());
		System.out.println(v.vitesse());
				 
		Vehicule v2 = new Moto();
		System.out.println("type du carburant moto : "+v2.type());
		System.out.println("nombre de roues du moto = "+v2.nombre());
		System.out.println(v2.vitesse());
	//input
		Scanner var = new Scanner(System.in);
		System.out.println("Entrer le typeCarburant ");
		System.out.println("Entrer le contenance ");
		System.out.println("Entrer le contenu ");
		
		int typeCarburant = var.nextInt(); 
		int contenance = var.nextInt(); 
		int contenu = var.nextInt(); 
		
		

	}

}
