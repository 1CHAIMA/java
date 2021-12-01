package exercice_DAO;

public class main {

	public static void main(String[] args) {
		//Créer 3 étudiants
		EtudiantDAO etudiant = new EtudiantDAO();//class model
		//etudiant.create(new Etudiant("homer","simpson"));
		//etudiant.create(new Etudiant("jean","dupont"));
		//etudiant.create(new Etudiant("machin","bidule"));
		System.out.println("les trois étudiant on été bien créer dans votre base de donnée");
		
		//Afficher l’étudiant avec id = 3.

		System.out.println("id=3 "+etudiant.findById(1).toString());
		// Supprimer l’étudiant avec id = 3.
		etudiant.delete(3);
		System.out.println("id=3 a été supprimer ");
		
		//Modifier le nom de l’étudiant Jean par Dujardin
		// UPDATE ETUDIANT
		Etudiant chayma =new Etudiant(4, "chayma", "hannachi");
	    chayma.setNom("TEST");		
	    etudiant.update(chayma, chayma.getId());
		 System.out.println("modification efféctuer");
	}

}
