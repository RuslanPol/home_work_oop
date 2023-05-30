package oop_interface_homework.device;

public class Microwave  extends Device{
    private double volume;
    private double power;
    private boolean isGrill;

    public Microwave(String name, String brand, String sound, double volume, double power, boolean isGrill) {
        super(name, brand, sound);
        this.volume = volume;
        this.power = power;
        this.isGrill = isGrill;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Volume: "+this.volume+"\nPower: "+this.power+"\nGrill availability"+this.isGrill);
    }

    @Override
    public void sound() {
        System.out.println("Sound output: "+ this.sound);
    }

    @Override
    public void description() {
        System.out.println("Warms up the food well.");
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

    public boolean isGrill() {
        return isGrill;
    }

    public void setGrill(boolean grill) {
        isGrill = grill;
    }
}
