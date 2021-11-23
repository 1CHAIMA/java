package afpa;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		System.out.println("salut coco");
		//les types
		int nombre1 = 50; 
		System.out.println("ceci est le nombre :"+nombre1);
		
		String chaine="ceci est un text de type string qui commence par un maj";
		System.out.println(chaine);
		
		char test= 'A';
		System.out.println(test);
		
		//reference 
	  Personne afpa = new Personne();
	    
		//les constantes
        final int AFPA = 15;
        System.out.println(AFPA);
        
        //les tables
        int [] tab = {1,2,3,4,5};
        int  tablo[] = {1,2,3,4,5};
        System.out.println("le premier element du tab  "+tab[0]);
        System.out.println("le premier element du tablo "+tablo[2]);
        
        String tabTest []= {"coco","lolo","momo"};
        System.out.println("les elements du tab  "+tabTest[0]+" "+tabTest[1]+" "+tabTest[2]);
        // parcourir un tab avec un boucle for 
        for (int i=0; i<tabTest.length;i++) {
			System.out.println(tabTest[i]);
			
		}
        // autre facon avec forECch
        for ( int valeur : tablo) 
        { System.out.println(valeur);}
        
    //collection
         ArrayList<String> coll = new ArrayList<>();
;         coll.add("azerty");
          coll.add("aqsdfgh");

       System.out.println("size ==" + coll.size() );
       System.out.println(coll.get(1));
      // tab a deux dimention 
       int [][] echiquier = {
    		   { 1,2,3,4},
    		   {5,6,7,8}
       };
          
        // boucle sur les deus tab 
       for (int i=0; i< echiquier.length; i++) {
    	   for (int j=0; j< echiquier[i].length; j++) {
    		System.out.println("\n echiquier : "+echiquier[i][j]);   
    	   }
    	   }
       }
       

}
