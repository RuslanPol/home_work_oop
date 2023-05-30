package oop_interface_homework.animals;

public class Tiger extends Animal{
    private String sound;

    public Tiger(String typeAnimal, String foodType, String habitat, boolean isWools, String sound) {
        super(typeAnimal, foodType, habitat, isWools);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "sound='" + sound + '\'' +
                '}';
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Loud sound: " + this.sound);
    }

    @Override
    public void behavior() {
        System.out.println("\nHunting for food.");
    }
}
