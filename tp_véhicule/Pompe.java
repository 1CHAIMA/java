package tp_véhicule;

public class Pompe{
// attribut
	public  String typeCarburant;
	public  int contenance, contenu;

//class pompe
	public  Pompe(String typeCarburant, int contenance, int contenu) {
		this.typeCarburant= typeCarburant;
		this.contenance= contenance;
		this.contenu= contenu;
	}
//Getter setter
		public String gettypeCarburant() {
			return typeCarburant;
		}

		public int getcontenance() {
			return contenance;
		}

		public int getcontenu() {
			return contenu;
		}
		public void setContenu1(int i) {
			// TODO Auto-generated method stub
			
		}
		

	
}