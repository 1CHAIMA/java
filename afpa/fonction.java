package afpa;

public class fonction {

	public static void main(String[] args) {
		System.out.println("la function carre "+ carre(5));
		 carre1(14);
		 System.out.println(ma_fonction(23,56,67));
		 System.out.println(ma_fonction(5,57));
        
	}
	public static  int carre(int nbre) {
		return nbre * nbre;
	}
	public static void carre1(int nbre) {
		System.out.println("ceci est un test "+ nbre);
	}

    public static String ma_fonction (int ... values ) {
    	System.out.println("1er value est : " + values[0]);
    	return "nb element: "+values.length;
    }
}
