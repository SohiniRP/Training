package Assignment1;

public abstract class HerbivoreAssignment1 extends AnimalAssignment1 {
    public HerbivoreAssignment1(String description) {
        super(description);
    }

    public void hunts(){
        System.out.println("Herbivores don't hunt.");
    }
}
