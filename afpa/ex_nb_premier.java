package afpa;

public class ex_nb_premier {

	public static void main(String[] args) {
		int number = 5;
System.out.println(number);
boolean estPremier = true;
for (int i = 2; i < number; i++) {
    if (number % i == 0) {
    	System.out.println(number + " est pas premier car il est divisible par " + i);       
        estPremier = false;
        break;
    }
 }
if (estPremier) {
	System.out.println(number + " est premier");
   }

	}

}
