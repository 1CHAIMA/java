package livre;

import java.util.ArrayList;
import java.util.Scanner;

public class main_livre {

	public static void main(String[] args) {
		
		//le nb d'entree a mon boucle
		Scanner var_i = new Scanner(System.in);
		System.out.println("Entrer le nombre de  livre ");
		int variable = var_i.nextInt();
		
		ArrayList<livre> ligne = new ArrayList<>();
		int somme =0;
	//mes saisie par l'utilisateur
		for (int i = 1; i < variable+1; i++) {
		
		    Scanner in = new Scanner(System.in);
			System.out.println("Entrer le titre du livre "+i+"/"+variable);
			String liv_titre = in.nextLine();
			
			 
			Scanner in2 = new Scanner(System.in);
			System.out.println("Entrer l auteur du livre "+i+"/"+variable);
			String liv_auteur = in2.nextLine();
			
			
			Scanner in3 = new Scanner(System.in);
			System.out.println("Entrer le prix du livre "+i+"/"+variable);
			int liv_prix = in3.nextInt();
			
			ligne.add(new livre(liv_titre, liv_auteur, liv_prix ));
			
			somme= somme +liv_prix;
			
		}
		// affiche mon table par ligne
		for (livre livre : ligne) { // (livre livre : ligne)  * class * reference *nom de mon tab
			System.out.println(livre);
		}
		
		
		System.out.println("le prix totale des "+variable+" livre est "+somme);
	}
	
}
