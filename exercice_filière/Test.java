package exercice_fili�re;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Etudiant e=new Etudiant("hannachi", "chaima",  "Informatique");
		Etudiant e2=new Etudiant("camara", "moussa",  "Informatique");
		Etudiant e3=new Etudiant("houin", "thi",  "Techno de l'info et de communication");
		Etudiant e4=new Etudiant("hamaoui", "leny",  "Marketing");
		Etudiant e5=new Etudiant("achouri", "leila",  "G�nie civil");
		//ajout dans un tableau
ArrayList<Etudiant> tab= new ArrayList<Etudiant>();
	tab.add(e);
	tab.add(e2);
	tab.add(e3);
	tab.add(e4);
	tab.add(e5);
	System.out.println(tab);
	//affichage
	System.out.println("La liste des fili�res de notre �cole:" );
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getFiliere()=="Informatique" ) {
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
			}else if((tab.get(i).getFiliere()=="Techno de l'info et de communication" )){
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
			}else if((tab.get(i).getFiliere()=="G�nie civil" )){
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
			}
	}
		System.out.println("-------------");
		System.out.println("Liste des �tudiants par fili�re :" );
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getFiliere()=="Informatique" ) {
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
						System.out.println(" Je suis l'�tudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
	
			}else if((tab.get(i).getFiliere()=="Marketing" )){
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
					System.out.println(" Je suis l'�tudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
				
			}else if((tab.get(i).getFiliere()=="G�nie civil" )){
				System.out.println("Fili�re : "+tab.get(i).getFiliere());
					System.out.println(" Je suis l'�tudiant  "+tab.get(i).getNom()+" "+tab.get(i).getPrenom());
				}
			}
	}
	
}
