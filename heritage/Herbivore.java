package heritage;

public class Herbivore extends Animal {
    
    public String identifier() {
        return super.identifier() + ", herbivore";
    }
    public String vegetal() {
        return " de l'herbe, des plantes et tout autres vegetales";
    }
	@Override
	public String marcher() {
		
		return "azert";
	}
}