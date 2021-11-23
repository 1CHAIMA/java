package exercice_enseignant;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		//5 Spécialités
Spécialité s = new Spécialité("JAVA/JEE", 150);
Spécialité s1 = new Spécialité("HTML/CSS", 50);	
Spécialité s2 = new Spécialité("Gestion de projet", 55);		
Spécialité s3 = new Spécialité("JS", 65);		
Spécialité s4 = new Spécialité("PHP", 65);
        //tableau Spécialité
ArrayList<Spécialité> tab = new ArrayList<Spécialité>();
tab.add(s);
tab.add(s1);
tab.add(s2);
tab.add(s3);
tab.add(s4);
System.out.println(tab);
		//4 enseignants
Enseignant e = new Enseignant("JAVA/JEE", 150, "hannachi", "chaima", "cannes");
Enseignant e2 = new Enseignant("JAVA/JEE", 150, "camara", "moussa", "paris");
Enseignant e3 = new Enseignant("PHP", 65, "hamaoui", "leny", "monpelier");
Enseignant e4 = new Enseignant("JS", 65, "achour", "leila", "lyon");
		//tableau enseignants 
ArrayList<Enseignant> tab2 = new ArrayList<Enseignant>();
		tab2.add(e);
		tab2.add(e2);
		tab2.add(e3);
		tab2.add(e4);
System.out.println(tab2);
		//test
for (int i = 0; i < tab.size(); i++) {
	System.out.println("hhhhhhh");
if (tab.get(i).getNom_specialite()==tab2.get(i).getNom_specialite()) {
	System.out.println("la liste des enseignant par spécialité : "+tab2);
}else {System.out.println(" Aucun enseignant pour la spécialité "+tab.get(i).getNom_specialite());}
		
	}
}
}
