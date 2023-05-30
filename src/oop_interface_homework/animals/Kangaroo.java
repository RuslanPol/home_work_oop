package oop_interface_homework.animals;

public class Kangaroo extends Animal{
    private int jumpingDist;

    public Kangaroo(String typeAnimal, String foodType, String habitat, boolean isWools, int jumpingDist) {
        super(typeAnimal, foodType, habitat, isWools);
        this.jumpingDist = jumpingDist;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumping on: " + this.jumpingDist + "metres");
    }

    @Override
    public void behavior() {
        System.out.println("Chews grass, fruit and jumping!");
    }

    public int getJumpingDist() {
        return jumpingDist;
    }

    public void setJumpingDist(int jumpingDist) {
        this.jumpingDist = jumpingDist;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "jumpingDist=" + jumpingDist +
                '}';
    }
}
