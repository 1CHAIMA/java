package afpa;

import java.util.ArrayList;

public class ex_semaine {

	public static void main(String[] args) {
		//String [] semaine = {"lundi","mar","mercredi","jeudi","vendredi", "samedi", "dimanc"};
		//System.out.println(semaine);
		
		ArrayList<String>semaine = new ArrayList<>();
		semaine.add("lundi");
		semaine.add("mar");
		semaine.add("mercredi");
		semaine.add("jeudi");
		semaine.add("vendredi");
		semaine.add("samedi");
		semaine.add("dimanc");
		  //ArrayList<String> semaine = new ArrayList<>(Arrays.asList("lundi","mar","mercredi","jeudi","vendredi", "samedi", "dimanc");
		// supprimer la dèrnière pop
		semaine.remove(6);
		System.out.println("la dèrnière valeur du tableau est retiré avec la fonction remove\",semaine");
		System.out.println(semaine);
		// push
		semaine.add("dimanche");		
		System.out.println("la  valeur 'dimache' est ajouter a la fin du tableau  avec la fonction add"+semaine); 
		//la position
		System.out.println("la pos du mar est : "+semaine.indexOf("mar"));
		// remplacer
		semaine.set(1, "mardi");
		System.out.println("ajout du mardi"+semaine);
		//aff le nb de valeur 
		System.out.println("le length du tab"+semaine.size());
		//affiche la 5 val du tab
		System.out.println("la 5emm valeur du tableau est : "+semaine.get(4));
		System.out.println("test"+semaine.clone());// garder une copie avec clone 

	}

}

/*var semaine=["lundi","mar","mercredi","jeudi","vendredi", "samedi", "dimanc"];
console.log(semaine);


semaine.pop();
console.log("la dèrnière valeur du tableau est retiré avec la fonction pop",semaine);

semaine.push("dimanche");
console.log("la  valeur 'dimache' est ajouter a la fin du tableau  avec la fonction push",semaine);

for (let i = 0; i < semaine.length; i++) {
    if (semaine[i]=="mar") {
        semaine[i]=("mardi");
    }
}
console.log("la  valeur 'mar' est remplacer par 'mardi' avec la fonction unshift",semaine);


console.log("le nombre de valeur du tableau est : ",semaine.length);
console.log("la 5éme valeur du tableau est: ",semaine[4]);*/
