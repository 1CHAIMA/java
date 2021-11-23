package exercice_ville;

public class main_ville {

	public static void main(String[] args) {
		ville v1 = new ville();
		v1.setNom("paris");
		v1.setDepartement("75");
		
		ville v2 = new ville();
		v2.setNom("lyon");
		v2.setDepartement("69");
		
		
		System.out.println(v1);//avec override
		System.out.println(v2);
		 
	    v1.methode();//apl function dans mon objet v1
	    v2.methode();
	}

}
