package exercice_DAO;

public class main {

	public static void main(String[] args) {
		//Cr�er 3 �tudiants
		EtudiantDAO etudiant = new EtudiantDAO();//class model
		//etudiant.create(new Etudiant("homer","simpson"));
		//etudiant.create(new Etudiant("jean","dupont"));
		//etudiant.create(new Etudiant("machin","bidule"));
		System.out.println("les trois �tudiant on �t� bien cr�er dans votre base de donn�e");
		
		//Afficher l��tudiant avec id = 3.

		System.out.println("id=3 "+etudiant.findById(1).toString());
		// Supprimer l��tudiant avec id = 3.
		etudiant.delete(3);
		System.out.println("id=3 a �t� supprimer ");
		
		//Modifier le nom de l��tudiant Jean par Dujardin
		// UPDATE ETUDIANT
		Etudiant chayma =new Etudiant(4, "chayma", "hannachi");
	    chayma.setNom("TEST");		
	    etudiant.update(chayma, chayma.getId());
		 System.out.println("modification eff�ctuer");
	}

}
