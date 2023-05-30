package oop_classes_homework.car;

public class Car {
    private String model ;
    private String brand;
    private int year;
    private  int volume;

    public Car(String model, String brand, int year, int volume) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.volume = volume;
    }
    public Car() {
    }
    public void printInfo(){
        System.out.println("\nBrand: "+ this.brand+"\nModel: "+this.model+"\nYear of issue: " + this.year+
                "\nVolume of engine: "+ this.volume);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
}
