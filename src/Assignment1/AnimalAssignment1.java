package Assignment1;

public abstract class AnimalAssignment1 {
    public String description;

    public AnimalAssignment1(String description){
        this.description = description;
    }

    public void sleep(){
        System.out.println("Sleeps at night");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void drinks(){
        System.out.println("Drinks water");
    }

    public abstract void hunts();
    public abstract void eats();
}
