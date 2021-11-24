package exercice_filière;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Etudiant e=new Etudiant("hannachi", "chaima",  "Informatique");
		Etudiant e2=new Etudiant("camara", "moussa",  "Informatique");
		Etudiant e3=new Etudiant("houin", "thi",  "Techno de l'info et de communication");
		Etudiant e4=new Etudiant("hamaoui", "leny",  "Marketing");
		Etudiant e5=new Etudiant("achouri", "leila",  "Génie civil");
		//ajout dans un tableau
ArrayList<Etudiant> tab= new ArrayList<Etudiant>();
	tab.add(e);
	tab.add(e2);
	tab.add(e3);
	tab.add(e4);
	tab.add(e5);
	System.out.println(tab);
	//affichage
	System.out.println("La liste des filières de notre école:" );
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getFiliere()=="Informatique" ) {
				System.out.println("Filière : "+tab.get(i).getFiliere());
			}else if((tab.get(i).getFiliere()=="Techno de l'info et de communication" )){
				System.out.println("Filière : "+tab.get(i).getFiliere());
			}else if((tab.get(i).getFiliere()=="Génie civil" )){
				System.out.println("Filière : "+tab.get(i).getFiliere());
			}
	}
		System.out.println("-------------");
		System.out.println("Liste des étudiants par filière :" );
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getFiliere()=="Informatique" ) {
				System.out.println("Filière : "+tab.get(i).getFiliere());
						System.out.println(" Je suis l'étudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
	
			}else if((tab.get(i).getFiliere()=="Marketing" )){
				System.out.println("Filière : "+tab.get(i).getFiliere());
					System.out.println(" Je suis l'étudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
				
			}else if((tab.get(i).getFiliere()=="Génie civil" )){
				System.out.println("Filière : "+tab.get(i).getFiliere());
					System.out.println(" Je suis l'étudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
				}
			}
	}
	
}
