package Assignment1;

public abstract class CarnivoreAssignment1 extends AnimalAssignment1 {
    public CarnivoreAssignment1(String description) {
        super(description);
    }

    public void hunts(){
        System.out.println("Carnivore animals hunt other animals");
    }
}
