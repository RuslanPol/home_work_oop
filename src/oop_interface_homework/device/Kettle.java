package oop_interface_homework.device;

public class Kettle extends Device {
    private double volume;
    private double power;

    public Kettle(String name, String brand, String sound, double volume, double power) {
        super(name, brand, sound);
        this.volume = volume;
        this.power = power;
    }

    @Override
    public void sound() {
        System.out.println("Sound output: "+this.sound);
    }

    @Override
    public void description() {
        System.out.println("Wonderful kettle, boils with terrible force.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Volume: "+this.volume+"\nPower: "+this.power);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;

    }
}
