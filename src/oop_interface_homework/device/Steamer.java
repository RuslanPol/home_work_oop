package oop_interface_homework.device;

public class Steamer extends Device{
    private int displacement;
    private String type;

    public Steamer(String name, String brand, String sound, int displacement, String type) {
        super(name, brand, sound);
        this.displacement = displacement;
        this.type = type;
    }
    @Override
    public void sound() {
        System.out.println("Steamer sound output: "+ this.sound);
    }

    @Override
    public void description() {
        System.out.println("White steamer");

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Displacement: " + this.displacement+"\nType: "+ this.type);
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
