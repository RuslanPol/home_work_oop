package oop_interface_homework.device;

public class Car extends Device{
    private String number;
    private int engineVolume;
    private String engineType;


    public Car(String name, String brand, String sound, String number, int engineVolume, String engineType) {
        super(name, brand, sound);
        this.number = number;
        this.engineVolume = engineVolume;
        this.engineType = engineType;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("State number: "+ this.number+"\nEngine volume: "+this.engineVolume+
                "\nEngine type: "+ this.engineType);
    }

    @Override
    public void sound() {
        System.out.println("Car sound output: "+this.sound);

    }

    @Override
    public void description() {
        System.out.println("The car has wheels, engine, steering wheel, able to move on the road.");

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

}
