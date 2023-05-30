package oop_interface_homework.device;

public  abstract class Device implements IDevice {
    protected String name;
    protected String brand;
    protected String sound;

    public Device(String name, String brand, String sound) {
        this.name = name;
        this.brand = brand;
        this.sound = sound;
    }

    @Override
    public void showInfo() {
        System.out.println("\n * Device * "+"\nName: "+this.name+"\nBrand: " + this.brand+
                "\nSound output: "+this.sound);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
