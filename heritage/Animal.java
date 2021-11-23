package heritage;

public abstract class Animal {
    
    public String identifier() {
        return "Je suis un animal";
    }
    public String dormir() {
        return "Je dors";
    }
    public String manger() {
        return "Je mange";
    }
    public  abstract String marcher() ;
    
    public String courir() {
        return "Je cours";
    }
    public String chasser() {
        return "Je chasse";
    }
    
}