package afpa;

import java.util.Scanner;

public class exe_bisextile {

	public static void main(String[] args) {
		
		System.out.println("choisiser un nombre ");
		Scanner sc =new Scanner(System.in);
		int annee =sc.nextInt();
		System.out.println("voici ce que tu a saisie : "+annee);
		
		
		if ((   annee% 4 == 0  &&    annee % 100 !=  0 ) || ( annee % 400 )  == 0) {
			System.out.println(annee+" est une année bissextil");
		} else {
            System.out.println(annee+" n'est pas une année  bissextil");
		}
      sc.close();
	}

}


