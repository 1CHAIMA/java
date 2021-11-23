package Exercice_heritage;

public class main {

	public static void main(String[] args) {
		Personel p =new Personel("hannachi", "chaima", "test@test.fr","061234567", 3500);
	    
		System.out.println(p);
	
		Role cp = new Role("cp","chef de rojet");
		Role mn = new Role("mn","manager");
		Role dp = new Role("dp","directeur de projet");
		Role drh = new Role("drh","directeur de ressource");
		Role dg = new Role("dg","directeur general");
	// cree utilisateur
		Personel cda = new Personel("afpa","test","service","061234567",12000,dg);
		System.out.println(cda);
		Personel cda2 = new Personel("afpa","test","service","061234567",12000,mn);
		System.out.println(cda2);
	// afficher la liste des utilisteur
		System.out.println(cda.afficher());
		System.out.println(cda2.afficher());
		//test calcul
		System.out.println("calcul de salaire" +cda.calculerSalaire());
		System.out.println("calcul de salaire" +cda2.calculerSalaire());
	//filtrer la liste des managers
		
	}
	

	
}
