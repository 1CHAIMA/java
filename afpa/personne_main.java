package afpa;

public class personne_main {

	public static void main(String[] args) {
		//instanciation 
    personne cda = new personne();// constructeur sans paramètre
    cda.setNom("ezze");
    cda.setPrenom("chaimm");
    //cda.nom="hannachi"; quand c public
    //cda.prenom="chaima";
    
    personne cda2 = new personne();
    //cda2.nom="hanna";  quand c public
    //cda2.prenom="chacha";
    cda2.setNom("hanna");
    cda2.setPrenom("chacha");
    personne cda3 = new personne("coco","fred");// avec paramètre nom,prenom
    
    //apl fonction affichage
    System.out.println(cda.getNom());
    System.out.println(cda2);
    System.out.println(cda3.getPrenom());
	}

}
