package heritage;

public class Lapin extends Herbivore {
    
    public String identifier() {
        return super.identifier() + ", le mignon petit lapin";
    }
    public String bondir() {
        return "Lorsque je marche et bien en faites je bondis";
    }
    
    
}