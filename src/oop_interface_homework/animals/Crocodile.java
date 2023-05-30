package oop_interface_homework.animals;

public class Crocodile extends Animal {

    private int swimmingDepth;

    public Crocodile(String typeAnimal, String foodType, String habitat, boolean isWools, int swimmingDepth) {
        super(typeAnimal, foodType, habitat, isWools);
        this.swimmingDepth = swimmingDepth;
    }

    public int getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(int swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Depth of swimming: " + this.swimmingDepth + " metres");

    }

    @Override
    public void behavior() {
        System.out.println("\nHunting for food.");
    }
}
